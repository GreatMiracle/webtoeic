<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lí danh sách bài nghe</title>
<meta name="description" content="Static &amp; Dynamic Tables" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->

<link rel="stylesheet"
	href="Template/Backend/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="Template/Backend/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

<!-- text fonts -->
<link rel="stylesheet"href="Template/Backend/assets/fonts/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet" href="Template/Backend/assets/css/ace.min.css"class="ace-main-stylesheet" id="main-ace-style" />

<!-- ace settings handler -->
<script src="Template/Backend/assets/js/ace-extra.min.js"></script>


</head>
<body class="no-skin">
	<!-- Header -->
	<jsp:include page="HeaderAdmin.jsp" />
	<!-- End Header -->

	<div class="main-container ace-save-state" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.loadState('main-container')
			} catch (e) {
			}
		</script>

		<!-- Begin menu -->
		<jsp:include page="Menu.jsp" />
		<!-- End menu -->


		<!-- Begin Content -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a
							href="Adminforward">Trang chủ</a></li>

						<li><a href="#">Quản lý bài tập nghe</a></li>
						<li class="active">Thêm danh sách bài nghe</li>

					</ul>
					<!-- /.breadcrumb -->

				</div>
				<div class="page-content">
					<c:if test="${msgquanlydsbtnghe!=null}">
						<h4 class="pink">
							<i
								class="ace-icon fa fa-hand-o-right icon-animated-hand-pointer blue"></i>

							<a class="green" data-toggle="modal">${msgquanlydsbtnghe}</a>
						</h4>
						<div class="hr hr-18 dotted hr-double"></div>
					</c:if>

					<div class="row">
						<div class="col-xs-12">

							<div class="row">
								<div class="col-xs-12">
									<table id="simple-table"
										class="table  table-bordered table-hover">
										<thead>
											<tr>
												<th class="center">ID</th>
												<th class="center">Tên bài nghe</th>
												<th class="center">Hình</th>
												<th class="center">Xóa</th>
												<th class="center">Thêm nội dung</th>
												<th class="center">Checked nội dung</th>
											</tr>
										</thead>
										<tbody>

											<c:forEach items="${lsAllExListening}" var="list">
												<tr>
													<td class="center">${list.listenexerciseid}</td>
<%-- 													<td class="center">${list.listenexercisename}</td> --%>
<td class="center">
														<a class="green" href="DetailListening?pageid=1&listenexerciseid=${list.listenexerciseid}">
													${list.listenexercisename}</a></td>
<%-- 													<td class="center">${list.readimage}</td> --%>
													<td class="center">
														<img src="Filebtphannghe/${list.listenexerciseimage}" class="media-object" alt=''  width="64px" height="40px"/>
													</td>
													<td class="center"><a class="red"
														href="#">
															<i class="ace-icon fa fa-trash-o bigger-130"></i>
													</a></td>

													<td class="center"><a class="green"
														href="Themcauhoibtnghe?listenexerciseid=${list.listenexerciseid}">
															<i class="ace-icon fa fa-pencil bigger-130"></i>
													</a></td>
													<td class="center">
														<ul class="list-unstyled">
															<c:if test="${list.checkcauhoi==1}">
																<li><i class="ace-icon fa fa-check-square-o"></i></li>
															</c:if>
															<c:if test="${list.checkcauhoi==0}">
																<li><i class="ace-icon fa fa-square-o"></i></li>
															</c:if>
														</ul>
													</td>

												</tr>
											</c:forEach>

										</tbody>
									</table>
								</div>
							</div>


			<!--Pagination-->
							<div class="row">
								<div class="col-xs-12">	
								
									<div>
										<ul class="pagination">
											<c:if test="${numberpage == 1}">
												<li class="disabled"><a href="#">Prev</a></li>
												<li  class="active"><a href="Hienthidsquanlybtnghe?pageid=${numberpage}">${numberpage}</a></li>
												<c:if test="${numberpage == 1 && numberpage < maxpageid}">
													<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage+1}">${numberpage+1}</a></li>
													<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage+1}">Next</a></li>
												</c:if>
												<c:if test="${numberpage == 1 && numberpage == maxpageid}">
													<li  class="disabled"><a class="disabled" href="#">Next</a></li>
												</c:if>
												
											</c:if>
											
											<c:if test="${numberpage > 1 && numberpage == maxpageid}">
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage-1}">Prev</a></li>
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage-1}">${numberpage-1}</a></li>
												<li  class="active"><a href="Hienthidsquanlybtnghe?pageid=${numberpage}">${numberpage}</a></li>
												<li class="disabled"><a href="#">Next</a></li>
											</c:if>

											<c:if test="${numberpage > 1 && numberpage < maxpageid}">
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage-1}">Prev</a></li>
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage-1}">${numberpage-1}</a></li>
												<li class="active"><a class="active" href="Hienthidsquanlybtnghe?pageid=${numberpage}">${numberpage}</a></li>
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage+1}">${numberpage+1}</a></li>
												<li><a href="Hienthidsquanlybtnghe?pageid=${numberpage+1}">Next</a></li>
											</c:if>
										</ul>
									</div>
								</div>
							</div>
			<!--/.Pagination-->
			
							
							<div class="row">
								<div class="col-xs-12">
									<button type="button"
										class="btn btn-white btn-warning btn-bold" data-toggle="modal"
										data-target="#myModal">Thêm bài tập nghe</button>
										
										<a href="Themaudiohinhanhbtnghe" role="button" class="btn btn-white btn-warning btn-bold">Thêm audio và hình ảnh bài nghe</a>


								</div>
								
								

							</div>



						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.main-content -->
		<!-- End Content -->


		<!-- Begin footer -->

		<jsp:include page="FooterAdmin.jsp" />

		<!-- end footer -->


		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- /.main-container -->




	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<form action="Themtenbtnghe" method="POST">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Thêm tên bài nghe</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<div class="col-sm-9">
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right"
											for="form-field-1">Nhập tên bài</label>

										<div class="col-sm-9">
											<input type="text" id="form-field-1-1"
												placeholder="Tên bài hướng dẫn ngữ pháp"
												class="form-control" name="listenexercisename" />
										</div>
									</div>

								</div>

							</div>
						</div>

					</div>
					<br />
					<div class="modal-footer">
						<button class="btn btn-info" type="submit">
							<i class="ace-icon fa fa-check bigger-110"></i> Thêm tên bài nghe
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>


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

	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='Template/Backend/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script src="Template/Backend/assets/js/bootstrap.min.js"></script>

	<!-- page specific plugin scripts -->
	<script src="Template/Backend/assets/js/jquery.dataTables.min.js"></script>
	<script
		src="Template/Backend/assets/js/jquery.dataTables.bootstrap.min.js"></script>
	<script src="Template/Backend/assets/js/dataTables.tableTools.min.js"></script>
	<script src="Template/Backend/assets/js/dataTables.colVis.min.js"></script>

	<!-- ace scripts -->
	<script src="Template/Backend/assets/js/ace-elements.min.js"></script>
	<script src="Template/Backend/assets/js/ace.min.js"></script>

	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		jQuery(function($) {
			//initiate dataTables plugin
			var oTable1 = $('#dynamic-table')
			//.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
			.dataTable({
				bAutoWidth : false,
				"aoColumns" : [ {
					"bSortable" : false
				}, null, null, null, null, null, {
					"bSortable" : false
				} ],
				"aaSorting" : [],

			});
			TableTools.classes.container = "btn-group btn-overlap";
			TableTools.classes.print = {
				"body" : "DTTT_Print",
				"info" : "tableTools-alert gritter-item-wrapper gritter-info gritter-center white",
				"message" : "tableTools-print-navbar"
			}

			var tableTools_obj = new $.fn.dataTable.TableTools(
					oTable1,
					{
						"sSwfPath" : "assets/swf/copy_csv_xls_pdf.swf",

						"sRowSelector" : "td:not(:last-child)",
						"sRowSelect" : "multi",
						"fnRowSelected" : function(row) {
							//check checkbox when row is selected
							try {
								$(row).find('input[type=checkbox]').get(0).checked = true
							} catch (e) {
							}
						},
						"fnRowDeselected" : function(row) {
							//uncheck checkbox
							try {
								$(row).find('input[type=checkbox]').get(0).checked = false
							} catch (e) {
							}
						},

						"sSelectedClass" : "success",
						"aButtons" : [
								{
									"sExtends" : "copy",
									"sToolTip" : "Copy to clipboard",
									"sButtonClass" : "btn btn-white btn-primary btn-bold",
									"sButtonText" : "<i class='fa fa-copy bigger-110 pink'></i>",
									"fnComplete" : function() {
										this
												.fnInfo(
														'<h3 class="no-margin-top smaller">Table copied</h3>\
									<p>Copied '
																+ (oTable1
																		.fnSettings()
																		.fnRecordsTotal())
																+ ' row(s) to the clipboard.</p>',
														1500);
									}
								},

								{
									"sExtends" : "csv",
									"sToolTip" : "Export to CSV",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-file-excel-o bigger-110 green'></i>"
								},

								{
									"sExtends" : "pdf",
									"sToolTip" : "Export to PDF",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-file-pdf-o bigger-110 red'></i>"
								},

								{
									"sExtends" : "print",
									"sToolTip" : "Print view",
									"sButtonClass" : "btn btn-white btn-primary  btn-bold",
									"sButtonText" : "<i class='fa fa-print bigger-110 grey'></i>",

									"sMessage" : "<div class='navbar navbar-default'><div class='navbar-header pull-left'><a class='navbar-brand' href='#'><small>Optional Navbar &amp; Text</small></a></div></div>",

									"sInfo" : "<h3 class='no-margin-top'>Print view</h3>\
									  <p>Please use your browser's print function to\
									  print this table.\
									  <br />Press <b>escape</b> when finished.</p>",
								} ]
					});

			$(tableTools_obj.fnContainer())
					.appendTo($('.tableTools-container'));

			setTimeout(function() {
				$(tableTools_obj.fnContainer()).find('a.DTTT_button').each(
						function() {
							var div = $(this).find('> div');
							if (div.length > 0)
								div.tooltip({
									container : 'body'
								});
							else
								$(this).tooltip({
									container : 'body'
								});
						});
			}, 200);

			//ColVis extension
			var colvis = new $.fn.dataTable.ColVis(oTable1, {
				"buttonText" : "<i class='fa fa-search'></i>",
				"aiExclude" : [ 0, 6 ],
				"bShowAll" : true,
				//"bRestore": true,
				"sAlign" : "right",
				"fnLabel" : function(i, title, th) {
					return $(th).text();//remove icons, etc
				}

			});

			//style it
			$(colvis.button()).addClass('btn-group').find('button').addClass(
					'btn btn-white btn-info btn-bold')

			//and append it to our table tools btn-group, also add tooltip
			$(colvis.button()).prependTo('.tableTools-container .btn-group')
					.attr('title', 'Show/hide columns').tooltip({
						container : 'body'
					});

			//and make the list, buttons and checkboxed Ace-like
			$(colvis.dom.collection)
					.addClass(
							'dropdown-menu dropdown-light dropdown-caret dropdown-caret-right')
					.find('li').wrapInner('<a href="javascript:void(0)" />') //'A' tag is required for better styling
					.find('input[type=checkbox]').addClass('ace').next()
					.addClass('lbl padding-8');

			/////////////////////////////////
			//table checkboxes
			$('th input[type=checkbox], td input[type=checkbox]').prop(
					'checked', false);

			//select/deselect all rows according to table header checkbox
			$('#dynamic-table > thead > tr > th input[type=checkbox]').eq(0)
					.on(
							'click',
							function() {
								var th_checked = this.checked;//checkbox inside "TH" table header

								$(this).closest('table').find('tbody > tr')
										.each(function() {
											var row = this;
											if (th_checked)
												tableTools_obj.fnSelect(row);
											else
												tableTools_obj.fnDeselect(row);
										});
							});

			//select/deselect a row when the checkbox is checked/unchecked
			$('#dynamic-table').on(
					'click',
					'td input[type=checkbox]',
					function() {
						var row = $(this).closest('tr').get(0);
						if (!this.checked)
							tableTools_obj.fnSelect(row);
						else
							tableTools_obj.fnDeselect($(this).closest('tr')
									.get(0));
					});

			$(document).on('click', '#dynamic-table .dropdown-toggle',
					function(e) {
						e.stopImmediatePropagation();
						e.stopPropagation();
						e.preventDefault();
					});

			var active_class = 'active';
			$('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on(
					'click',
					function() {
						var th_checked = this.checked;//checkbox inside "TH" table header

						$(this).closest('table').find('tbody > tr').each(
								function() {
									var row = this;
									if (th_checked)
										$(row).addClass(active_class).find(
												'input[type=checkbox]').eq(0)
												.prop('checked', true);
									else
										$(row).removeClass(active_class).find(
												'input[type=checkbox]').eq(0)
												.prop('checked', false);
								});
					});

			//select/deselect a row when the checkbox is checked/unchecked
			$('#simple-table').on('click', 'td input[type=checkbox]',
					function() {
						var $row = $(this).closest('tr');
						if (this.checked)
							$row.addClass(active_class);
						else
							$row.removeClass(active_class);
					});

			/********************************/
			//add tooltip for small view action buttons in dropdown menu
			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});

			//tooltip placement on right or left
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				//var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}

		})
	</script>
</body>
</html>