package com.lwh.jtdc.business.vo;

import com.lwh.jtdc.business.entity.Article;
import com.lwh.jtdc.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ArticleConditionVO extends BaseConditionVO {
	private Article article;
	private Long typeId;
	private Long tagId;
	private Integer status;
	private Boolean top;
	private Boolean recommended;
	private Boolean original;
	private Boolean random;
	private List<Long> tagIds;
}

