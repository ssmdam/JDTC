<div class="col-sm-3 sidebar">
    <#if articleDetail??>
        <div class="sidebar-module">
            <h5 class="custom-title"><i class="fa fa-hand-peace-o fa-fw icon"></i><strong>说给你听</strong><small></small></h5>
            <div class="div-quote">
                <i class="fa fa-quote-left fa-fw"></i><p id="hitokoto" style="margin-left: 15px;"></p>
            </div>
        </div>
    <#else>
<#--        <div class="sidebar-module" style="position: relative;">-->
<#--            <a href='https://gitee.com/yadong.zhang/DBlog' target="_blank" rel="external nofollow"><img src='https://gitee.com/yadong.zhang/DBlog/widgets/widget_1.svg?color=07b83f' alt='Fork me on Gitee' style="position: absolute;right: 0;"/></a>-->
<#--            <h5 class="custom-title"><i class="fa fa-home fa-fw icon"></i><strong>关于我</strong><small></small></h5>-->
<#--            <div class="widget">-->
<#--                <div id="feed_widget">-->
<#--                    <div class="feed-about">-->
<#--                        <div class="about-main">-->
<#--                            <div class="about-img"><a href="${config.wxCode}" class="showImage" title="微信公众号"><img src="${config.wxCode}" alt="微信公众号"></a></div>-->
<#--                            <div class="about-name">${config.siteName}</div>-->
<#--                            <div class="about-the">${config.siteDesc!}</div>-->
<#--                        </div>-->
<#--                        <div class="clear"></div>-->
<#--                        <!-- 方案一：图标展示 &ndash;&gt;-->
<#--&lt;#&ndash; &ndash;&gt;-->
<#--                        <!-- 方案二：列表展示 &ndash;&gt;-->
<#--                        &lt;#&ndash;<ul class="list-unstyled">-->
<#--                            <li><i class="fa fa-info-circle fa-fw"></i>博主：<small>张亚东</small></li>-->
<#--                            <li><i class="fa fa-user-circle fa-fw"></i>职业：<small>码农</small></li>-->
<#--                            <li><i class="fa fa-home fa-fw"></i>籍贯：<small>长白山某棵树上</small></li>-->
<#--                            <li><i class="fa fa-envelope-square fa-fw"></i>邮箱：<small>10000@qq.com</small></li>-->
<#--                        </ul>&ndash;&gt;-->
<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--        </div>-->
    </#if>
    <div class="widget widget_ui_posts">
        <h3><i class="fa fa-thumbs-o-up fa-fw icon"></i>置顶推荐</h3>
        <ul>
            <@articleTag method="recommendedList" pageSize="10">
                <#if recommendedList?? && (recommendedList?size > 0)>
                    <#list recommendedList as item>
                        <li>
                            <a href="${config.siteUrl}/article/${item.id?c}" title="${item.title}" data-toggle="tooltip" data-placement="bottom">
                                <span class="thumbnail">
                                     <img <#if config.lazyloadPath!>data-original<#else>src</#if>="${item.coverImage}" >
                                </span>
                                <span class="text1" >【${item.type.name}】${item.title}</span>
                                <span class="muted">${item.createTime?string('yyyy-MM-dd')}</span>
                                <span class="muted">评论(${item.commentCount!(0)})</span>
                            </a>
                        </li>
                    </#list>
                <#else>
                    <li class="empty-list">
                        <i class="fa fa-bookmark-o fa-fw"></i> 暂无相关文章
                    </li>
                </#if>
            </@articleTag>
        </ul>
    </div>

    <div class="sidebar-module article-module hide" style="top: 145px;">
        <h5 class="custom-title"><i class="fa fa-book fa-fw icon"></i><strong>本文目录</strong><i class="fa fa-close pull-right close-article-menu hide pointer"></i><small></small></h5>
        <div id="article-menu">
            <ul class="list-unstyled"></ul>
        </div>
    </div>

    <div class="widget widget_ui_tags">
        <h3><i class="fa fa-tags fa-fw icon"></i>标签云</h3>
        <div class="items">
            <@zhydTag method="tagsList" pageSize="10">
                <#if tagsList?? && (tagsList?size > 0)>
                    <#list tagsList as item>
                        <a style="font-size: <@zhydTag method="random" max="15" min="10">${random}</@zhydTag>px;margin: 5px;" href="${config.siteUrl}/tag/${item.id?c}" title="${item.name!}" data-toggle="tooltip" data-placement="bottom">
                            ${item.name!}
                        </a>
                    </#list>
                </#if>
            </@zhydTag>
        </div>
    </div>
    <div class="widget widget_ui_posts">
        <h3><i class="fa fa-list fa-fw icon"></i>热门文章</h3>
        <ul class="nopic">
            <@articleTag method="recentArticles" pageSize="10">
                <#if recentArticles?? && (recentArticles?size > 0)>
                    <#list recentArticles as item>
                        <li>
                            <a href="${config.siteUrl}/article/${item.id?c}" title="${item.title}" >
                                <span class="text1" >【${item.type.name}】${item.title}</span>
                                <span class="muted">${item.createTime?string('yyyy-MM-dd')}</span>
                                <span class="muted">评论(${item.commentCount!(0)})</span>
                            </a>
                        </li>
                    </#list>
                <#else>
                    <li class="empty-list">
                        <i class="fa fa-bookmark-o fa-fw"></i> 暂无相关文章
                    </li>
                </#if>
            </@articleTag>
        </ul>
    </div>

<#--    <div class="widget widget_ui_comments">-->
<#--        <h3>最新评论</h3>-->
<#--        <ul>-->
<#--            <li>-->
<#--                <a href="https://www.piqiandong.com/?page_id=217&cpage=1#comment-25" title="留言板上的评论">-->
<#--                    <img alt='' data-src='https://secure.gravatar.com/avatar/186bb7171b5688bf4877c97bf99ff4ec?s=50&#038;d=monsterid&#038;r=g'-->
<#--                         srcset='https://secure.gravatar.com/avatar/186bb7171b5688bf4877c97bf99ff4ec?s=100&#038;d=monsterid&#038;r=g 2x'-->
<#--                         class='avatar avatar-50 photo' height='50' width='50' />-->
<#--                    <strong>zwy</strong> 5天前说：<br>谢谢啦-->
<#--                </a>-->
<#--            </li>-->
<#--        </ul>-->
<#--    </div>-->

    <@zhydTag method="recentComments" pageSize="10">
        <#if recentComments?? && recentComments?size gt 0>
            <div class="widget widget_ui_comments">
                <h3><i class="fa fa-comments fa-fw icon"></i>最新评论</h3>
                <ul>
                <#list recentComments as item>
                    <li>
                        <a href="${item.sourceUrl}#comment-${item.id?c}" title="${item.briefContent!}" rel="external nofollow" data-toggle="tooltip" data-placement="bottom">
                            <img alt="${item.nickname!}" src="${item.avatar!}"  class='avatar avatar-50 photo' height='50' width='50' onerror="this.src='${config.staticWebSite}/img/user.png'" />
                            <strong>${item.nickname!}</strong> 评论：<br>${item.briefContent!}
                        </a>
                    </li>
                </#list>
                </ul>
            </div>
        </#if>
    </@zhydTag>
<#--    <div class="sidebar-module">-->
<#--        <ul class="nav nav-tabs sidebar-tabs" role="tablist">-->
<#--            <li role="presentation" class="active"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab"><i class="fa fa-list"></i>近期文章</a></li>-->
<#--            <li role="presentation"><a href="#home" aria-controls="home" role="tab" data-toggle="tab"><i class="fa fa-thumbs-o-up"></i>站长推荐</a></li>-->
<#--            <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab"><i class="fa fa-hand-peace-o"></i>随机文章</a></li>-->
<#--        </ul>-->
<#--        <div class="tab-content">-->
<#--            <div role="tabpanel" class="tab-pane active" id="profile">-->
<#--                <ol class="list-unstyled">-->
<#--                    <@articleTag method="recentArticles" pageSize="10">-->
<#--                        <#if recentArticles?? && (recentArticles?size > 0)>-->
<#--                            <#list recentArticles as item>-->
<#--                                <li>-->
<#--                                    <a href="${config.siteUrl}/article/${item.id?c}" title="${item.title}" data-toggle="tooltip" data-placement="bottom">-->
<#--                                        <i class="fa fa-book fa-fw"></i> ${item.title}-->
<#--                                    </a>-->
<#--                                </li>-->
<#--                            </#list>-->
<#--                        <#else>-->
<#--                            <li class="empty-list">-->
<#--                                <i class="fa fa-bookmark-o fa-fw"></i> 暂无相关文章-->
<#--                            </li>-->
<#--                        </#if>-->
<#--                    </@articleTag>-->
<#--                </ol>-->
<#--            </div>-->
<#--            <div role="tabpanel" class="tab-pane" id="home">-->
<#--                <ol class="list-unstyled">-->
<#--                    <@articleTag method="recommendedList" pageSize="10">-->
<#--                        <#if recommendedList?? && (recommendedList?size > 0)>-->
<#--                            <#list recommendedList as item>-->
<#--                                <li>-->
<#--                                    <a href="${config.siteUrl}/article/${item.id?c}" title="${item.title}" data-toggle="tooltip" data-placement="bottom">-->
<#--                                        <i class="fa fa-book fa-fw"></i> ${item.title}-->
<#--                                    </a>-->
<#--                                </li>-->
<#--                            </#list>-->
<#--                        <#else>-->
<#--                            <li class="empty-list">-->
<#--                                <i class="fa fa-bookmark-o fa-fw"></i> 暂无相关文章-->
<#--                            </li>-->
<#--                        </#if>-->
<#--                    </@articleTag>-->
<#--                </ol>-->
<#--            </div>-->
<#--            <div role="tabpanel" class="tab-pane" id="messages">-->
<#--                <ol class="list-unstyled">-->
<#--                    <@articleTag method="randomList" pageSize="10">-->
<#--                        <#if randomList?? && (randomList?size > 0)>-->
<#--                            <#list randomList as item>-->
<#--                                <li>-->
<#--                                    <a href="${config.siteUrl}/article/${item.id?c}" title="${item.title}" data-toggle="tooltip" data-placement="bottom">-->
<#--                                        <i class="fa fa-book fa-fw"></i> ${item.title}-->
<#--                                    </a>-->
<#--                                </li>-->
<#--                            </#list>-->
<#--                        <#else>-->
<#--                            <li class="empty-list">-->
<#--                                <i class="fa fa-bookmark-o fa-fw"></i> 暂无相关文章-->
<#--                            </li>-->
<#--                        </#if>-->
<#--                    </@articleTag>-->
<#--                </ol>-->
<#--            </div>-->
<#--        </div>-->
<#--    </div>-->
<#--    <div class="widget widget_ui_statistics">-->
<#--        <h3>网站统计</h3>-->
<#--        <ul>-->
<#--            <li><strong>日志总数：</strong>25</li>-->
<#--            <li><strong>评论总数：</strong>23</li>-->
<#--            <li><strong>标签总数：</strong>14</li>-->
<#--            <li><strong>页面总数：</strong>8</li>-->
<#--            <li><strong>分类总数：</strong>18</li>-->
<#--            <li><strong>链接总数：</strong>3</li>-->
<#--            <li><strong>用户总数：</strong>16</li>-->
<#--            <li><strong>最后更新：</strong>2020-04-28</li>-->
<#--        </ul>-->
<#--    </div>-->

    <div class="clear"></div>
    <div class="widget widget_ui_statistics">
        <h3><i class="fa fa-info fa-fw icon"></i>网站信息</h3>
        <ul >
            <@zhydTag method="siteInfo">
                <li> <i class="fa fa-file fa-fw"></i> 文章总数：${siteInfo.articleCount!(0)} 篇</li>
                <li> <i class="fa fa-tags fa-fw"></i> 标签总数：${siteInfo.tagCount!(0)} 个</li>
                <li> <i class="fa fa-folder-open fa-fw"></i> 分类总数：${siteInfo.typeCount!(0)} 个</li>
                <li> <i class="fa fa-comments fa-fw"></i> 留言数量：${siteInfo.commentCount!(0)} 条</li>
                <li> <i class="fa fa-users fa-fw"></i> 在线人数：<span class="online">1</span>人</li>
                <li> <i class="fa fa-calendar fa-fw"></i> 运行天数：${siteInfo.installdate!(1)}天</li>
                <li class="lastt"> <i class="fa fa-pencil-square fa-fw"></i> 最后更新：${siteInfo.lastUpdateTime!("暂无更新记录")}</li>
            </@zhydTag>
        </ul>
    </div>
</div>
