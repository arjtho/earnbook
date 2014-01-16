/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/6/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var ebwLogin = (function () {

        return {
            init: function () {
                $("#btnLogin").on("click", function(){ebwLogin.doLogin(ebwLogin.loginFail,"#ebw-login-");});
            },

            doLogin: function(loginFailedCallback, paramPrefix) {
                var url = EbwAppCommmonNS.getUrl("/login");
                var setting = {
                    url : url,
                    onSuccess:ebwLogin.loginSuccess,
                    onFail : loginFailedCallback,
                    params: ebwLogin.getLoginParams(paramPrefix)
                };
                EbwAjaxNS.makeServerCallToGetJson(setting);
            },

            loginSuccess : function(response) {
              alert("Login Success");
            },

            loginRetryFailed : function() {
                $("#login-error-message-box").show();
            },

            loginFail : function(jqXHR, textStatus) {
                if(jqXHR) {
                    EbwVanillaModalNS.showModal(350,505, jqXHR.responseText, "User Login");
                    var loginFieldPrefix = "#ebw-retry-login-";
                    $(loginFieldPrefix+ 'userId').val(ebwLogin.getLoginParams("#ebw-login-").email);
                    var keepMeLoggedIn = $('#keepMeLoggedIn', $('#header-login-container')).is(':checked');
                    if(keepMeLoggedIn) {
                        $("#keepMeLoggedInOnLogin").attr('checked', true);
                    }
                    $(loginFieldPrefix + "password").on("keypress",function() {
                          $("#login-error-message-box").hide();
                    });
                    $("#retryLoginBtn").on("click", function(){ebwLogin.doLogin(ebwLogin.loginRetryFailed,loginFieldPrefix);});
                }
            },

            getLoginParams:function(fieldPrefix) {
                var userId = $(fieldPrefix + "userId").val();
                var password = $(fieldPrefix + "password").val();
                return {
                    email: userId,
                    password: password
                }
            },

            /**
             *
             * @returns {boolean}
             */
            validateLogin: function(){
                var fieldPrefix= "#ebw-login-";
                var errorFields = [];

                var email = $(fieldPrefix + "userId");
                var password = $(fieldPrefix + "password");

                if(!EbwValidatorNS.isValidEmail(email)) {
                    errorFields.push(email);
                }

                if(!EbwValidatorNS.isValidLength(password, 6)) {
                    errorFields.push(password);
                }
                return errorFields;
            }
        }
    }());
    //@sourceURL = resources/eb-web/js/login/ebw-login.js
    scope.EbwLoginNS = ebwLogin;
}(window, jQuery));