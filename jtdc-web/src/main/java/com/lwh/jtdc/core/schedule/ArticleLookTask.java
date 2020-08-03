package com.lwh.jtdc.core.schedule;

import com.lwh.jtdc.business.entity.ArticleLook;
import com.lwh.jtdc.business.service.BizArticleLookService;
import com.lwh.jtdc.business.service.BizArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Chris luo 201635020423
 * @since 1.8
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ArticleLookTask {

    private final BizArticleService bizArticleService;

    private final BizArticleLookService articleLookService;

    private BlockingQueue<ArticleLook> queue = new ArrayBlockingQueue<>(1024);

    /**
     * 保存文章的浏览记录，先进先出
     */
    public void addLookRecordToQueue(ArticleLook articleLook) {
        if (null == articleLook) {
            return;
        }
        queue.offer(articleLook);
    }

    public void save() {
        List<ArticleLook> bufferList = new ArrayList<>();
        while (true) {
            try {
                bufferList.add(queue.take());
                for (ArticleLook articleLook : bufferList) {
                    if (!bizArticleService.isExist(articleLook.getArticleId())) {
                        log.warn("{}-该文章不存在！", articleLook.getArticleId());
                        continue;
                    }
                    articleLookService.insert(articleLook);
                }
            } catch (InterruptedException e) {
                log.error("保存文章浏览记录失败--->[{}]", e.getMessage());
                // 防止缓冲队列填充数据出现异常时不断刷屏
                try {
                    Thread.sleep(1000);
                } catch (Exception err) {
                    log.error(err.getMessage());
                }
            } finally {
                bufferList.clear();
            }
        }
    }

}
