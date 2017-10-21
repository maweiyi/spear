<#include "./header.ftl">
<link href="/static/plugins/tagsinput/jquery.tagsinput.css" rel="stylesheet">
<link href="/static/plugins/select2/dist/css/select2-bootstrap.css" rel="stylesheet">
<link href="/static/plugins/toggles/toggles.css" rel="stylesheet">
<link href="//cdn.bootcss.com/multi-select/0.9.12/css/multi-select.min.css" rel="stylesheet">
<link href="//cdn.bootcss.com/select2/3.4.8/select2.min.css" rel="stylesheet">
<link href="//o7d6mdbet.qnssl.com/mditor/css/mditor.min.css" rel="stylesheet">
<link href="//cdn.bootcss.com/summernote/0.8.2/summernote.css" rel="stylesheet">
<link href="//cdn.bootcss.com/dropzone/4.3.0/min/dropzone.min.css" rel="stylesheet">
<style rel="stylesheet">
    #tags_tagsinput {
        background-color: #fafafa;
        border: 1px solid #eeeeee;
    }

    #tags_addTag input {
        width: 100%;
    }

    #tags_addTag {
        margin-top: -5px;
    }

    .mditor .editor{
        font-size: 14px;
        font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    }
    .mditor .backdrop, .mditor .textarea, .mditor .viewer{
        font-size: 14px;
    }
    .markdown-body{
        font-size: 14px;
    }
    .note-toolbar {
        text-align: center;
    }

    .note-editor.note-frame {
        border: none;
    }

    .note-editor .note-toolbar {
        background-color: #f5f5f5;
        padding-bottom: 10px;
    }

    .note-toolbar .note-btn-group {
        margin: 0;
    }

    .note-toolbar .note-btn {
        border: none;
    }

    #articleForm #dropzone {
        min-height: 200px;
        background-color: #dbdde0;
        line-height:200px;
        margin-bottom: 10px;
    }
    #articleForm .dropzone {
        border: 1px dashed #8662c6;
        border-radius: 5px;
        background: white;
    }
    #articleForm .dropzone .dz-message {
        font-weight: 400;
    }
    #articleForm .dropzone .dz-message .note {
        font-size: 0.8em;
        font-weight: 200;
        display: block;
        margin-top: 1.4rem;
    }
</style>
<div class="row">
    <div class="col-sm-12">
        <h4 class="page-title">
        </h4>
    </div>
    <div class="col-md-12">

        <input type="hidden" id="attach_url" value="" />

        <form id="articleForm">

            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
            </div>

            <div class="form-group col-md-6" style="padding: 0 0 0 10px;">
            </div>

            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
            </div>

            <div class="form-group col-md-6">
                <select id="multiple-sel" class="select2 form-control" multiple="multiple" data-placeholder="请选择分类...">
                </select>
            </div>
            <div class="clearfix"></div>

            <div class="form-group col-xs-12">
                <div class="pull-right">
                </div>
            </div>

            <div id="md-container" class="form-group col-md-12">
            </div>
            <div id="html-container" class="form-group col-md-12">
            </div>

            <div class="form-group col-md-3 col-sm-4">
                <label class="col-sm-4">开启评论</label>
                <div class="col-sm-8">
                </div>
            </div>

            <div class="form-group col-md-3 col-sm-4">
                <label class="col-sm-4">允许Ping</label>
                <div class="col-sm-8">
                </div>
            </div>

            <div class="form-group col-md-3 col-sm-4">
                <label class="col-sm-4">允许订阅</label>
                <div class="col-sm-8">
                </div>
            </div>

            <div class="form-group col-md-3">
                <label class="col-sm-5">添加缩略图</label>
                <div class="col-sm-7">
                    <div id="thumb-toggle" class="toggle toggle-success" on="false" onclick="add_thumbimg(this);"></div>
                </div>
            </div>

            <div id="dropzone-container" class="form-group col-md-12 hide">
                <div class="dropzone dropzone-previews" id="dropzone">
                    <div class="dz-message">
                        <p>可以为你的文章添加一张缩略图 ;)</p>
                    </div>
                </div>
                <input type="hidden" name="thumbImg" id="thumbImg"/>
            </div>

            <div class="clearfix"></div>

            <div class="text-right">
                <a class="btn btn-default waves-effect waves-light" href="/admin/article">返回列表</a>
                <button type="button" class="btn btn-primary waves-effect waves-light" onclick="subArticle('publish');">
                    保存文章
                </button>
                <button type="button" class="btn btn-warning waves-effect waves-light" onclick="subArticle('draft');">
                    存为草稿
                </button>
            </div>
        </form>
    </div>
</div>
<#include "./footer.ftl">
<script src="/static/plugins/tagsinput/jquery.tagsinput.min.js"></script>
<script src="/static/plugins/jquery-multi-select/jquery.quicksearch.js"></script>
<script src="//o7d6mdbet.qnssl.com/mditor/js/mditor.min.js"></script>
<script src="//cdn.bootcss.com/wysihtml5/0.3.0/wysihtml5.min.js"></script>
<script src="//cdn.bootcss.com/summernote/0.8.2/summernote.min.js"></script>
<script src="//cdn.bootcss.com/summernote/0.8.2/lang/summernote-zh-CN.min.js"></script>
<script src="//cdn.bootcss.com/multi-select/0.9.12/js/jquery.multi-select.min.js"></script>
<script src="//cdn.bootcss.com/select2/3.4.8/select2.min.js"></script>
<script src="//cdn.bootcss.com/jquery-toggles/2.0.4/toggles.min.js"></script>
<script src="//cdn.bootcss.com/dropzone/4.3.0/min/dropzone.min.js"></script>
<script src="//cdn.bootcss.com/to-markdown/3.1.0/to-markdown.min.js"></script>
<script src="/static/js/article.js" type="text/javascript"></script>
</body>
</html>