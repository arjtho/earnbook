<%--
  Created by IntelliJ IDEA.
  User: Mahadev Mane
  Date: 10/11/13
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="menu-bar-panel" id="earnbook-header-menu-bar">
    <div class="app-max-width container">
        <ul class="nav navbar-nav navbar-left">
            <li><a href="#" style="font-weight: bold"><spring:message code="menu.bar.home"/></a></li>
            <li><div class="menubar-vertical-divider"></div></li>
            <li><a href="#"><spring:message code="menu.bar.deals"/></a></li>
            <li><div class="menubar-vertical-divider"></div></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code="menu.bar.businessses"/> <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Retails</a></li>
                    <li><a href="#">Wholesale</a></li>
                    <li><a href="#">Healthcare</a></li>
                    <li><a href="#">Education</a></li>
                </ul>
            </li>
            <li><div class="menubar-vertical-divider"></div></li>
            <li><a href="#"><spring:message code="menu.bar.about.us"/></a></li>
            <li><div class="menubar-vertical-divider"></div></li>
            <li><a href="#"><spring:message code="menu.bar.help"/></a></li>
        </ul>
        <ul id="search-options" class="nav navbar-nav navbar-right right-padding"  style="padding-top: 4px;">
            <li>
                <div>
                    <select id="search-categories"  data-placeholder="Select category" class="input-element-large" style="width:110px">
                        <option>All</option>
                        <option>Businesses</option>
                        <option>Products</option>
                        <option>People</option>
                     </option>
                </div>
            </li>
            <li>
                <div>
                    <input type="text" class="input-element-large search-box">
                </div>
            </li>
            <li>
                <div class="related-element-spacing-left">
                    <button class="btn btn-primary" type="button" style="height: 30px">
                        <i class="fa fa-search" style="font-size: 18px;"></i>
                    </button>
                </div>
            </li>
        </ul>
    </div>
</div>