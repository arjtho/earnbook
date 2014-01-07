<%--
  Created by IntelliJ IDEA.
  User: kranti
  Date: 12/14/13
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Earnbook">
    <meta name="author" content="Arjun">
    <link rel="shortcut icon" href="resources/eb-web/ext/assets/ico/favicon.png">

    <title> <tiles:insertAttribute name="title" ignore="true"/>  </title>

    <!-- Bootstrap core CSS -->
    <link href="resources/eb-web/ext/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="resources/eb-web/ext/bootstrap/css/bootstrap-theme.css" rel="stylesheet">


    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="resources/eb-web/ext/font-awesome/css/font-awesome.min.css">

    <!-- chosen plugin CSS -->
    <link rel="stylesheet" href="resources/eb-web/ext/chosen/chosen.min.css">

    <!-- Application less file-->
    <link rel="stylesheet/less" type="text/css" href="resources/eb-web/css/earnbook-web.less"/>
    <link rel="stylesheet/less" type="text/css" href="resources/eb-web/css/earnbook-common.less"/>

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="resources/eb-web/ext/jquery/js/jquery-2.0.3.js"></script>
    <script src="resources/eb-web/ext/bootstrap/js/bootstrap.min.js"></script>

    <!-- Less standard css -->
    <script src="resources/eb-web/ext/less/less-1.4.1.min.js"></script>

    <!-- chosen plugin -->
    <script src="resources/eb-web/ext/chosen/chosen.jquery.min.js"></script>


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="resources/eb-web/ext/assets/js/html5shiv.js"></script>
    <script src="resources/eb-web/ext/assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- Application js files -->
    <script src="resources/eb-web/js/constants/ebw-app-common.js"></script>
    <script src="resources/eb-web/js/modal/vanilla-modal.js"></script>
    <script src="resources/eb-web/js/ajax/ebw-ajax.js"></script>
    <script src="resources/eb-web/js/login/ebw-login.js"></script>

    <script>
        $(document).ready(function() {
            EbwLoginNS.init();
            $("#testimonial1").popover('show');
            $("#testimonial2").popover('show');
        });
    </script>
</head>
</head>
<body>
    <%--Application Body Contents--%>
    <tiles:insertAttribute name="header" />

    <%--Application main Menu bar Contents--%>
    <tiles:insertAttribute name="menu-bar" />

    <%--Application Body Contents--%>
    <tiles:insertAttribute name="body-layout"/>

    <%--Application Footer Contents--%>
    <tiles:insertAttribute name="footer" />

    <tiles:insertAttribute name="vanilla-model"/>


</body>
</html>