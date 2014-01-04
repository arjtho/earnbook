<%--
  Created by IntelliJ IDEA.
  User: Mahadev Mane
  Date: 10/11/13
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div id="app-body">
    <div class="app-max-width container">
        <div class="row">
            <div class="col-sm-5">
                <tiles:insertAttribute name="signup"/>
            </div>
            <div class="col-sm-1" >
            </div>
            <div class="col-sm-6 left-vertical-border" style="height: 370px">
                <tiles:insertAttribute name="welcome-note"/>
            </div>
        </div>

        <div class="row" style="margin-top: 24px">
            <div class="col-sm-5">
                <div class="business-bar-panel left-padding" style="width: 100%;">
                    <h5 class="section-heading">Recentely added businesses </h5>
                </div>

            </div>
            <div class="col-sm-1" >
            </div>
            <div class="col-sm-6">
                <div class="business-bar-panel left-padding" style="width: 100%;">
                    <h5 class="section-heading">Popular on Earnbook </h5>
                </div>
            </div>
        </div>
    </div>
</div>