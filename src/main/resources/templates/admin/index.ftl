<#include "./header.ftl">
<div class="row">
    <div class="col-sm-12">
        <h4 class="page-title">Tale仪表盘</h4>
    </div>

    <div class="row">
        <div class="col-sm-6 col-lg-3">
            <div class="mini-stat clearfix bx-shadow bg-info">
                <span class="mini-stat-icon"><i class="fa fa-quote-right" aria-hidden="true"></i></span>
                <div class="mini-stat-info text-right">
                    发表了<span class="counter">${statistics.articles}</span>篇文章
                </div>
            </div>
        </div>
        <div class="col-sm-6 col-lg-3">
            <div class="mini-stat clearfix bg-purple bx-shadow">
                <span class="mini-stat-icon"><i class="fa fa-comments-o" aria-hidden="true"></i></span>
                <div class="mini-stat-info text-right">
                    收到了<span class="counter">${statistics.comments}</span>条留言
                </div>
            </div>
        </div>

        <div class="col-sm-6 col-lg-3">
            <div class="mini-stat clearfix bg-success bx-shadow">
                <span class="mini-stat-icon"><i class="fa fa-cloud-upload" aria-hidden="true"></i></span>
                <div class="mini-stat-info text-right">
                    上传了<span class="counter">${statistics.attachs}</span>个附件
                </div>
            </div>
        </div>

    </div>
    <div class="row">
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">最新文章</h4>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <#list  [1, 2] as a>
                        <li class="list-group-item">
                            <span class="badge badge-primary"
                                  title="0条评论">0</span>
                            <a target="_blank" href="/article">第一篇文章</a>
                        </li>
                        </#list>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">最新留言</h4>
                </div>
                <div class="panel-body">
                    <div class="alert alert-warning">
                        还没有收到留言.
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">系统日志</h4>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <#list [1, 2] as a>
                        <li class="list-group-item">
                            <span>日志</span>
                        </li>
                        </#list>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>
<#include "./footer.ftl">
</body>
</html>