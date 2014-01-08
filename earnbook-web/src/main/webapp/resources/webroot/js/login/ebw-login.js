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
                $("#btnLogin").on("click", ebwLogin.doLogin);
            },

            doLogin: function() {
                var url = EbwAppCommmonNS.getUrl("/login");
                var setting = {
                    url : url,
                    onSuccess:ebwLogin.loginSuccess,
                    onFail : ebwLogin.loginFail,
                    params: ebwLogin.getLoginParams()
                };
                EbwAjaxNS.makeServerCallToGetJson(setting);
            },

            loginSuccess : function(response) {
              alert("Login Success");
            },

            loginFail : function(jqXHR, textStatus) {
                var url = EbwAppCommmonNS.getUrl("/getLoginPage");
                var setting = {
                    url : url,
                    onSuccess:ebwLogin.displayLoginPage,
                    onFail: ebwLogin.displayLoginPage
                };
                EbwAjaxNS.makeServerCall(setting);
            },


            /**
             * @param event
             * @param response
             */
            displayLoginPage: function (response) {
                EbwVanillaModalNS.showModal(350,505, response, "User Login");

            },

            getLoginParams:function() {
                var fieldPrefix= "#ebw-login-";
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