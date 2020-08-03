<div class="modal" id="oauth" tabindex="-1" role="dialog" aria-labelledby="oauthTitle">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <ul class="list-inline">
                    <li><h4 class="modal-title" id="oauthTitle">登录</h4></li>
                    <li><a href="javascript:$.alert.info('没用，别点了！我就没打算开发这个功能。Just to show you~~');"><h4 class="modal-title" id="myModalLabel">注册</h4></a></li>
                </ul>
            </div>
            <div class="modal-body">
                <div class="oauth">
                    <ul class="list-unstyled list-inline oauth-list">
                        <@zhydTag method="listAvailableOAuthPlatforms">
                            <#if listAvailableOAuthPlatforms?? && listAvailableOAuthPlatforms?size gt 0>
                                <#list listAvailableOAuthPlatforms as item>
                                    <li>
                                        <a href="${config.siteUrl}/oauth/render/${item}" target="">
                                            <img src="https://gitee.com/yadong.zhang/static/raw/master/JustAuth/${item}.png" alt="" class="img-circle">
                                        </a>
                                    </li>
                                </#list>
                            <#else>
                                <li>
                                    稍等一下， 博主正在快马加鞭的配置~~
                                </li>
                            </#if>
                        </@zhydTag>
                        <li>
                            <a href="${config.siteUrl}/oauth/render/gitee" target="">
                                <img src="https://gitee.com/logo_icon.png" alt="" class="img-circle">
                            </a>
                        </li>
                    </ul>
                    <div class="oauth-line">
                        <span>
                            Powered by <a href="https://gitee.com/yadong.zhang/JustAuth" target="_blank">JustAuth</a>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<header class="header">
    <div class="container">
        <h1 class="logogo">
            <a href="${config.siteUrl}">
                <img src="${config.staticWebSite}/img/jskfsq.jpg">
                Java技术开发社区
            </a>
        </h1>
        <div class="brand">
            "欢迎光临"
            <br>
            "生活尽了力，其他靠佛系"
        </div>
        <ul class="site-nav site-navbar">
            <li>
                <a href="/" class="menu_a"><i class="fa fa-home"></i>首页</a>
            </li>
            <@zhydTag method="types">
                <#if types?? && types?size gt 0>
                    <#list types as item>
                        <#if item.nodes?? && item.nodes?size gt 0>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle menu_a" data-toggle="dropdown" aria-expanded="false">
                                    <i class="${item.icon!}"></i>${item.name!} <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <#list item.nodes as node>
                                        <li><a href="/type/${node.id?c}" title="点击查看《${node.name!}》的文章">${node.name!}</a></li>
                                    </#list>
                                </ul>
                            </li>
                        <#else>
                            <li><a href="/type/${item.id?c}" class="menu_a"><i class="${item.icon!}"></i>${item.name!}</a></li>
                        </#if>
                    </#list>
                </#if>
            </@zhydTag>
            <li><a href="/guestbook" class="menu_a"><i class="fa fa-comments-o"></i>留言板</a></li>
            <li><span class="pull-right nav-search main-search" data-toggle="modal" data-target=".nav-search-box"><i class="fa fa-search"></i></span></li>
        </ul>
        <div class="topbar">
                <ul class="site-nav topmenu">
                    <li><a href="${config.siteUrl}/about" class="menu_a" title="关于博客" data-toggle="tooltip" data-placement="bottom">关于本站</a></li>
                    <li><a href="${config.siteUrl}/links" class="menu_a" title="友情链接" data-toggle="tooltip" data-placement="bottom">友情链接</a></li>
                </ul>
                <#if user??>
                    <ul class="list-unstyled list-inline nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle menu_a" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-user fa-fw"></i>${user.username!} <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="/oauth/logout"><i class="fa fa-sign-out"></i>退出</a></li>
                            </ul>
                        </li>
                    </ul>
                <#else>
                    <ul class="list-unstyled list-inline pull-left">
                        <li><a href="javascript:;;" data-toggle="modal" data-target="#oauth" rel="nofollow" title="授权登录">登录</a></li>
                    </ul>
                </#if>
        </div>
    </div>
</header>
