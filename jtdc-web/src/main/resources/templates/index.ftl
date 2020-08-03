<#include "include/macros.ftl">
<@compress single_line=false>
<@header title="${config.siteDesc!} | 一个学习Java的宝地！"
    keywords="${config.homeKeywords!}"
    description="${config.homeDesc!}"
    canonical="/${url!}">
</@header>

<div class="container custome-container">
    <@prompt></@prompt>
    <nav class="breadcrumb">
        <div class="notify"><i class="fa fa-bullhorn fa-fw"></i></div>
        <div id="scrolldiv">
            <div class="scrolltext">
                <ul class="list-unstyled" id="notice-box">
                    <li class="scrolltext-title">
                        <a href="javascript:void(0)" rel="bookmark">本站正式启用新域名:<a href="http://localhost:8443" target="_blank">ttt</a></a>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
    <div class="row">
        <div class="col-sm-8 blog-main">
            <@articleTag method="recommendedList" pageSize="8">
                <#if recommendedList?? && (recommendedList?size > 0)>
                <div class="blog-body expansion" style="padding: 0;">
                    <div id="myCarousel" class="carousel slide" style="height:300px;">
                        <ol class="carousel-indicators">
                            <#list recommendedList as item>
                            <li data-target="#myCarousel" data-slide-to="${item_index}" class="${(item_index == 0)?string('active','')}"></li>
                            </#list>
                        </ol>
                        <div class="carousel-inner">
                            <#list recommendedList as item>
                            <div class="item ${(item_index == 0)?string('active','')}">
                                <a href="${config.siteUrl}/article/${item.id?c}">
                                    <img src="${item.coverImage}" alt="${item.title}" title="${item.title}">
                                </a>
                                <div class="zyd-carousel-caption">${item.title}</div>
                            </div>
                            </#list>
                        </div>
                        <a class="left carousel-control hide" href="#myCarousel" role="button" data-slide="prev">
                            <span class="fa fa-angle-left fa-fw fa-3x" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control hide" href="#myCarousel" role="button" data-slide="next">
                            <span class="fa fa-angle-right fa-fw fa-3x" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
                </#if>
            </@articleTag>
            <#if page.list?? && (page.list?size > 0)>
                <#list page.list as item>
                    <article class="excerpt excerpt-1">
                        <#if item.coverImage?? && (item.coverImage?length > 7)>
                                <a  class="focus" href="${config.siteUrl}/article/${item.id?c}">
                                    <img width="220" height="150" <#if config.lazyloadPath!>data-original<#else>src</#if>="${item.coverImage}" class="thumb" alt="${item.title!}">
                                </a>
                        </#if>
                        <header>
                            <a class="cat" href="${config.siteUrl}/type/${item.typeId?c}">${item.type.name}<i></i></a>
                            <h2 >
                                <a href="${config.siteUrl}/article/${item.id?c}" rel="bookmark" title="${item.title} | JAVA技术开发社区" data-toggle="tooltip" data-placement="bottom">${item.title}</a>
                            </h2>
                        </header>
                        <p class="meta">
                            <time><i class="fa fa-clock-o"></i>${item.createTime?string('yyyy-MM-dd')}</time>
                            <span class="author"><i class="fa fa-user"></i>
                                <a href="${config.siteUrl}/about">Java技术开发社区管理员</a>
                            </span>
                            <span class="pv">
                                <i class="fa fa-eye"></i>浏览(${item.lookCount!(0)})
                            </span>
                            <a class="pc" href="${config.siteUrl}/article/${item.id?c}#comment-box">
                                <i class="fa fa-comments-o"></i>评论(${item.commentCount!(0)})
                            </a>
                            <a href="javascript:;" etap="like" class="post-like actived" data-pid="266">
                                <i class="fa fa-thumbs-o-up"></i>
                                赞(<span>${item.loveCount!(0)}</span>)
<#--                                <a href="javascript:;" data-id="${article.id?c}" title="点赞" ><i class="fa fa-thumbs-up"></i>赞 <i class="count"> ${article.loveCount!(0)}</i> </a>-->
                            </a>
                        </p>
                        <p class="note">
                            ${item.description!}
                        </p>
                        <div class="clear"></div>
                                <a  class="cat1" href="${config.siteUrl}/article/${item.id?c}" rel="bookmark" title="点击查看文章详情"  data-placement="bottom">阅读全文</a>
                    </article>
                </#list>
                <@pageBar></@pageBar>
            <#else >
                <article class="fade-in" style="height: auto">
                    <div class="rows">
                        <div class="col-md-10 col-sm-12">
                            <div class="h3 text-center">亲，啥也没找到啊~~<img src="http://img.t.sinajs.cn/t35/style/images/common/face/ext/normal/15/j_thumb.gif" alt="[囧]"></div>
                            <div class="h5 text-center">换个姿势，再来一次~~</div>
                        </div>
                        <div class="col-md-2 col-sm-12">
                            <img src="${config.staticWebSite}/img/wrong.gif" class="center-block" alt="惩罚我" style="width: 110px;margin-top: -10px;">
                        </div>
                    </div>
                    <form action="/" method="post" class="form-horizontal searchForm">
                        <input type="hidden" name="pageNumber" value="1">
                        <div class="input-group">
                            <input type="text" class="form-control br-none" name="keywords" placeholder="换个姿势，再来一次~~">
                            <span class="input-group-btn">
                                <button class="btn btn-default br-none nav-search-btn pointer" type="submit"><i class="fa fa-search"></i> 搜索</button>
                            </span>
                        </div>
                        <div class="clear" style="margin-bottom: 10px"></div>
                        <ul class="list-unstyled list-inline search-hot">
                            <li><strong style="position: relative;top: 2px;color: #999999;">热门搜索：</strong></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-default">Java</span></a></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-primary">Springboot</span></a></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-success">Linux</span></a></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-info">Maven</span></a></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-warning">Bootstrap</span></a></li>
                            <li><a class="pointer" rel="external nofollow"><span class="label label-danger">阿里云</span></a></li>
                        </ul>
                    </form>
                </article>
            </#if>
        </div>
        <#include "layout/sidebar.ftl"/>
    </div>
</div>

<@footer></@footer>
</@compress>
