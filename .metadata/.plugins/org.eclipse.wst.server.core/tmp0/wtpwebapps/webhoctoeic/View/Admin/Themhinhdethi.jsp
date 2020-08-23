<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm hình đề thi</title>
<meta name="description" content="User login page" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="Template/Backend/assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="Template/Backend/font/font-awesome.min.css" />
<link rel="stylesheet" href="Template/Backend/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

<!-- ace styles -->
<link rel="stylesheet" href="Template/Backend/assets/css/ace.min.css" />
<link rel="stylesheet" href="Template/Backend/assets/css/ace-rtl.min.css" />

</head>
<body class="login-layout">

	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
							<h1>
								<i class="ace-icon fa fa-leaf green"></i> <span class="red">JSP</span>
								<span class="white" id="id-text2">SERVLET</span>
							</h1>
							<h4 class="blue" id="id-company-text">&copy; Design by
								Nguyen Trung Kien</h4>
						</div>

						<div class="space-6"></div>

						<div class="position-relative">
							<div id="login-box"
								class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger">
											<i class="ace-icon fa fa-coffee green"></i> Thêm hình đề thi
										</h4>

										<div class="space-6"></div>

										<form
											action="Themhinhdethi?examinationid=<%=request.getAttribute("examinationid")%>"
											method="POST" enctype="multipart/form-data">
											<fieldset>
												<label class="block clearfix"> <%=request.getAttribute("msgquanlydethi") != null
					? request.getAttribute("msgquanlydethi")
					: " "%>
												</label> <label class="block clearfix"> Thêm file: <input
													type="file" name="file"
													class="btn btn-white btn-warning btn-bold">
												</label>


												<div class="space"></div>

												<div class="clearfix">


													<button type="submit"
														class="width-70 pull-right btn btn-sm btn-primary">
														<i class="ace-icon fa fa-key"></i> <span
															class="bigger-110">Thêm ảnh đề thi</span>
													</button>
												</div>

												<div class="space-4"></div>
											</fieldset>
										</form>

										<div class="social-or-login center">
											<span class="bigger-110"></span>
										</div>

										<div class="space-6"></div>


									</div>
									<!-- /.widget-main -->

								</div>
								<!-- /.widget-body -->
							</div>
							<!-- /.login-box -->
						</div>
						<!-- /.position-relative -->

						<div class="navbar-fixed-top align-right">
							<br /> &nbsp; <a id="btn-login-dark" href="#">Dark</a> &nbsp; <span
								class="blue">/</span> &nbsp; <a id="btn-login-blur" href="#">Blur</a>
							&nbsp; <span class="blue">/</span> &nbsp; <a id="btn-login-light"
								href="#">Light</a> &nbsp; &nbsp; &nbsp;
						</div>
					</div>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.main-content -->
	</div>
	<!-- /.main-container -->


	<!-- basic scripts -->

	<!--[if !IE]> -->
	<script src="Template/Backend/assets/js/jquery.2.1.1.min.js"></script>
	<!-- <![endif]-->

	<!--[if !IE]> -->
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='Template/Backend/assets/js/jquery.min.js'>"
								+ "<"+"/script>");
	</script>

	<!-- <![endif]-->
	
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='Template/Backend/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script src="Template/Backend/assets/js/bootstrap.min.js"></script>

	<!-- page specific plugin scripts -->
	<script src="Template/Backend/assets/js/jquery-ui.custom.min.js"></script>
	<script src="Template/Backend/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script src="Template/Backend/assets/js/markdown.min.js"></script>
	<script src="Template/Backend/assets/js/bootstrap-markdown.min.js"></script>
	<script src="Template/Backend/assets/js/jquery.hotkeys.min.js"></script>
	<script src="Template/Backend/assets/js/bootstrap-wysiwyg.min.js"></script>
	<script src="Template/Backend/assets/js/bootbox.min.js"></script>

	<!-- ace scripts -->
	<script src="Template/Backend/assets/js/ace-elements.min.js"></script>
	<script src="Template/Backend/assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		jQuery(function($) {

			function showErrorAlert(reason, detail) {
				var msg = '';
				if (reason === 'unsupported-file-type') {
					msg = "Unsupported format " + detail;
				} else {
					//console.log("error uploading file", reason, detail);
				}
				$(
						'<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>'
								+ '<strong>File upload error</strong> '
								+ msg
								+ ' </div>').prependTo('#alerts');
			}

			//$('#editor1').ace_wysiwyg();//this will create the default editor will all buttons

			//but we want to change a few buttons colors for the third style
			$('#editor1').ace_wysiwyg({
				toolbar : [ 'font', null, 'fontSize', null, {
					name : 'bold',
					className : 'btn-info'
				}, {
					name : 'italic',
					className : 'btn-info'
				}, {
					name : 'strikethrough',
					className : 'btn-info'
				}, {
					name : 'underline',
					className : 'btn-info'
				}, null, {
					name : 'insertunorderedlist',
					className : 'btn-success'
				}, {
					name : 'insertorderedlist',
					className : 'btn-success'
				}, {
					name : 'outdent',
					className : 'btn-purple'
				}, {
					name : 'indent',
					className : 'btn-purple'
				}, null, {
					name : 'justifyleft',
					className : 'btn-primary'
				}, {
					name : 'justifycenter',
					className : 'btn-primary'
				}, {
					name : 'justifyright',
					className : 'btn-primary'
				}, {
					name : 'justifyfull',
					className : 'btn-inverse'
				}, null, {
					name : 'createLink',
					className : 'btn-pink'
				}, {
					name : 'unlink',
					className : 'btn-pink'
				}, null, {
					name : 'insertImage',
					className : 'btn-success'
				}, null, 'foreColor', null, {
					name : 'undo',
					className : 'btn-grey'
				}, {
					name : 'redo',
					className : 'btn-grey'
				} ],
				'wysiwyg' : {
					fileUploadError : showErrorAlert
				}
			}).prev().addClass('wysiwyg-style2');

			/**
			//make the editor have all the available height
			$(window).on('resize.editor', function() {
				var offset = $('#editor1').parent().offset();
				var winHeight =  $(this).height();
				
				$('#editor1').css({'height':winHeight - offset.top - 10, 'max-height': 'none'});
			}).triggerHandler('resize.editor');
			 */

			$('#editor2').css({
				'height' : '200px'
			}).ace_wysiwyg(
					{
						toolbar_place : function(toolbar) {
							return $(this).closest('.widget-box').find(
									'.widget-header').prepend(toolbar).find(
									'.wysiwyg-toolbar').addClass('inline');
						},
						toolbar : [ 'bold', {
							name : 'italic',
							title : 'Change Title!',
							icon : 'ace-icon fa fa-leaf'
						}, 'strikethrough', null, 'insertunorderedlist',
								'insertorderedlist', null, 'justifyleft',
								'justifycenter', 'justifyright' ],
						speech_button : false
					});

			$('[data-toggle="buttons"] .btn').on(
					'click',
					function(e) {
						var target = $(this).find('input[type=radio]');
						var which = parseInt(target.val());
						var toolbar = $('#editor1').prev().get(0);
						if (which >= 1 && which <= 4) {
							toolbar.className = toolbar.className.replace(
									/wysiwyg\-style(1|2)/g, '');
							if (which == 1)
								$(toolbar).addClass('wysiwyg-style1');
							else if (which == 2)
								$(toolbar).addClass('wysiwyg-style2');
							if (which == 4) {
								$(toolbar).find('.btn-group > .btn').addClass(
										'btn-white btn-round');
							} else
								$(toolbar).find('.btn-group > .btn-white')
										.removeClass('btn-white btn-round');
						}
					});

			//RESIZE IMAGE

			//Add Image Resize Functionality to Chrome and Safari
			//webkit browsers don't have image resize functionality when content is editable
			//so let's add something using jQuery UI resizable
			//another option would be opening a dialog for user to enter dimensions.
			if (typeof jQuery.ui !== 'undefined' && ace.vars['webkit']) {

				var lastResizableImg = null;
				function destroyResizable() {
					if (lastResizableImg == null)
						return;
					lastResizableImg.resizable("destroy");
					lastResizableImg.removeData('resizable');
					lastResizableImg = null;
				}

				var enableImageResize = function() {
					$('.wysiwyg-editor')
							.on(
									'mousedown',
									function(e) {
										var target = $(e.target);
										if (e.target instanceof HTMLImageElement) {
											if (!target.data('resizable')) {
												target
														.resizable({
															aspectRatio : e.target.width
																	/ e.target.height,
														});
												target.data('resizable', true);

												if (lastResizableImg != null) {
													//disable previous resizable image
													lastResizableImg
															.resizable("destroy");
													lastResizableImg
															.removeData('resizable');
												}
												lastResizableImg = target;
											}
										}
									})
							.on(
									'click',
									function(e) {
										if (lastResizableImg != null
												&& !(e.target instanceof HTMLImageElement)) {
											destroyResizable();
										}
									}).on('keydown', function() {
								destroyResizable();
							});
				}

				enableImageResize();

				/**
				//or we can load the jQuery UI dynamically only if needed
				if (typeof jQuery.ui !== 'undefined') enableImageResize();
				else {//load jQuery UI if not loaded
					//in Ace demo dist will be replaced by correct assets path
					$.getScript("assets/js/jquery-ui.custom.min.js", function(data, textStatus, jqxhr) {
						enableImageResize()
					});
				}
				 */
			}

		});
	</script>

</body>
</html>