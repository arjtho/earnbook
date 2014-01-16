<%--
  Created by IntelliJ IDEA.
  User: Mahadec
  Date: 11/6/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="login-error-message-box" class="error-message-box-outline login-fields">
    <div class="error-icon-box">
        <i class="fa fa-exclamation-circle" style="color: red;font-size: 30px"></i>
    </div>
    <div class="error-message-box">
        <span id="login-error-message" style="margin-left: 12px"> User Id/Email or password is invalid. Please correct it. </span>
    </div>
</div>

<div style="padding: 7px" class="distance-between-heading-top login-fields">
    <div>
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div class="pull-right login-label">
                       User Id/Email:
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="input-group margin-bottom-sm">
                    <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
                    <input id="ebw-retry-login-userId" class="form-control login-fields" type="text" placeholder='User Name'>
                </div>
            </div>
        </div>
        <div class="row related-element-distance-top">
            <div class="col-lg-4">
                <div>
                    <div class="pull-right login-label">Password:</div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                    <input id="ebw-retry-login-password" class="form-control login-fields" type="password" placeholder='Password'>
                </div>
            </div>
        </div>

        <div class="row related-element-distance-top">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div>
                    <input type="checkbox" id="keepMeLoggedInOnLogin" class="input-checkbox-small" style="margin-top: -4px">
                    <label class="header-lable-padding" style="font-weight: normal"> <spring:message code="login.user.keep.logged.in"/></label>
                </div>
            </div>
        </div>
        <div class="row related-element-distance-top">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div>
                    <a href="#"> Forgot Password?</a>
                </div>
            </div>
        </div>

        <div class="row related-element-distance-top">

            <div class="col-lg-12" style=" text-align: center">
                <div>
                    <button id="retryLoginBtn" class="btn btn-primary" type="button">
                       Login
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>