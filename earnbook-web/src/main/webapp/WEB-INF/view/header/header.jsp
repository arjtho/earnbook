<%--
  Created by IntelliJ IDEA.
  User: Mahadev Mane
  Date: 10/11/13
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<div class="header-panel" id="earnbook-header-panel">
    <div class="app-max-width container">
        <div class="pull-left">
            <div>
                <label class="brand-logo">
                    <spring:message code="brand.company.name"/>
                </label>
            </div>
            <div class="pull-right">
                <label class="brand-slogan">
                    <spring:message code="brand.company.slogan"/>
                </label>

            </div>
        </div>
        <div id="header-login-container" class="pull-right header-right-panel">
            <div class="row">
                <div class="col-sm-5 header-element-spacing ">
                    <input id="ebw-login-userId" type="text" class="input-element-small" placeholder="<spring:message code="login.user.name"/>">
                </div>
                <div class="col-sm-5 header-element-spacing ">
                    <input id="ebw-login-password" type="password" class="input-element-small" placeholder="<spring:message code="login.user.password"/>">
                </div>
                <div class="col-sm-2 header-element-spacing">
                    <button id="btnLogin" class="btn btn-primary header-button" type="button">
                        <spring:message code="login.user.sign.in"/>
                    </button>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-5 header-element-spacing ">
                    <input type="checkbox" id="keepMeLoggedIn" class="input-checkbox-small" style="margin-top: -4px">
                    <label class="input-label-small header-lable-padding"> <spring:message code="login.user.keep.logged.in"/></label>
                </div>
                <div class="col-sm-5 header-element-spacing ">
                    <label class="input-label-small header-lable-padding"><spring:message code="login.user.forgot.password"/></label>

                </div>
            </div>
        </div>
    </div>
</div>