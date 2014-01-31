<%--
  Created by IntelliJ IDEA.
  User: Mahadec
  Date: 11/6/13
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="distance-between-heading-top">
    <div class="row distance-between-heading-top">
        <div class="col-sm-6 text-color distance-between-heading-top" style="padding-right: 7px ">
            First Name
        </div>
        <div class="col-sm-6  text-color distance-between-heading-top" style="padding-left: 8px">
            Last Name
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6" style="padding-right: 7px">
            <input type="text" id="signup-first-name" class="signup-input-fields">
        </div>
        <div class="col-sm-6" style="padding-left: 8px">
            <input type="text" id="signup-last-name" class="signup-input-fields">
        </div>
    </div>

    <div class="row element-distance-top">
        <div class="col-sm-12 text-color">
            Email
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <input type="text" id="signup-email" class="signup-input-fields">
        </div>
    </div>

    <div class="row element-distance-top">
        <div class="col-sm-12 text-color">
            Password
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <input  id="signup-password"  type="password" class="signup-input-fields">
        </div>
    </div>

    <div class="row element-distance-top">
        <div class="col-sm-12 text-color">
            Confirm Password
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <input  id="signup-password-confirm" type="password" class="signup-input-fields">
        </div>
    </div>


    <div class="row element-distance-top">
    <div class="col-sm-12 text-color">
        Business Name
    </div>
</div>
    <div class="row">
        <div class="col-sm-12">
            <input type="text" id="signup-business-name" class="signup-input-fields">
        </div>
    </div>

    <div class="row  element-distance-top">
    <div class="col-sm-12">
        <select  id="signup-business-category" class="signup-input-fields">
            <option>Business Category</option>
        </select>
    </div>
</div>
    <div class="row element-distance-top">
        <div class="col-sm-12 element-distance-top" style="text-align: center;vertical-align: middle; ">
            <button id="btnSignup" class="btn btn-primary" type="button" style="height: 30px;width: 150px;">
              Sign Up
            </button>
        </div>
    </div>



</div>