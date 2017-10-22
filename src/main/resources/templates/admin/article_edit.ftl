<#include "./header.ftl">
<link href="/static/plugins/tagsinput/jquery.tagsinput.css" rel="stylesheet">
<link href="/static/plugins/select2/css/select2.css" rel="stylesheet">
<link href="/static/plugins/toggles/toggles.css" rel="stylesheet">
<link href="//cdn.bootcss.com/multi-select/0.9.12/css/multi-select.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://unpkg.com/mditor@1.0.5/dist/css/mditor.min.css">
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
            发布文章
        </h4>
    </div>
    <div class="col-md-12">

        <input type="hidden" id="attach_url" value="" />

        <form id="articleForm">

            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                <input class="form-control" placeholder="请输入文章标题（必须）" name="title" required/>
            </div>

            <div class="form-group col-md-6" style="padding: 0 0 0 10px;">
                <input class="form-control" placeholder="自定义访问路径，如：my-first-article  默认为文章id" name="slug"/>
            </div>

            <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                <input name="tags" id="tags" type="text" class="form-control" placeholder="请填写文章标签"/>
            </div>
            <div class="clearfix"></div>

            <div id="md-container" class="form-group col-md-12">
                <textarea id="md-editor" class=""></textarea>
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
<script src="/static/plugins/select2/js/select2.full.js"></script>
<script src="https://unpkg.com/mditor@1.0.5/dist/js/mditor.min.js"></script>
<script src="//cdn.bootcss.com/wysihtml5/0.3.0/wysihtml5.min.js"></script>
<script src="//cdn.bootcss.com/summernote/0.8.2/summernote.min.js"></script>
<script src="//cdn.bootcss.com/summernote/0.8.2/lang/summernote-zh-CN.min.js"></script>
<script src="//cdn.bootcss.com/multi-select/0.9.12/js/jquery.multi-select.min.js"></script>
<script src="//cdn.bootcss.com/jquery-toggles/2.0.4/toggles.min.js"></script>
<script src="//cdn.bootcss.com/dropzone/4.3.0/min/dropzone.min.js"></script>
<script src="//cdn.bootcss.com/to-markdown/3.1.0/to-markdown.min.js"></script>
<script src="/static/js/article.js"></script>
</body>
</html>