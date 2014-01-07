<%--
  Created by IntelliJ IDEA.
  User: Mahadec
  Date: 11/6/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="login-error-message-box" style="height: 50px;display: table;display: none">
    <div>
        <i class="fa fa-exclamation-circle" style="color: red;font-size: 30px"></i>
    </div>
    <div>
        <span id="login-error-message" style="margin-left: 12px"> Below highlighted fields are invalid. Please correct it. </span>
    </div>
</div>

<div style="padding: 7px">
    <div>
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div>
                       User Name
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="input-group margin-bottom-sm">
                    <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
                    <input id="login-email" class="form-control login-fields" type="text" placeholder='User Name'>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <div>
                    <div class="login-label-inner">Password</div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                    <input id="login-password" class="form-control login-fields" type="password" placeholder='Password'>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div>
                    <a href="#"> Forgot Password</a>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-6">
                <div>
                    <button class="btn btn-primary" type="button" style="height: 30px;width: 150px;">
                       Login
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>