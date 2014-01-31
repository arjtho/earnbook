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
                $("#btnSignup").on("click", ebwLogin.doSignUp);
            },

            doLogin: function(loginFail, paramPrefix) {
                var url = EbwAppCommmonNS.getUrl("/login");
                var setting = {
                    url : url,
                    onSuccess:ebwLogin.loginSuccess,
                    onFail : loginFail,
                    params: ebwLogin.getLoginParams(paramPrefix)
                };
                EbwAjaxNS.makeServerCallToGetJson(setting);
            },

            doSignUp: function() {
                var errorFields = ebwLogin.validateSignUp();
                if(errorFields.length > 0) {
                    EbwValidatorNS.indicateErrorFields(errorFields, null);
                } else {
                    var url = EbwAppCommmonNS.getUrl("/signup");
                    var setting = {
                        url : url,
                        onSuccess:ebwLogin.singUpSuccess,
                        onFail : ebwLogin.signUpFail,
                        params: ebwLogin.getSignUpParams()
                    };
                    EbwAjaxNS.makeServerCallToGetJson(setting);
                }
            },

            loginSuccess : function(response) {
              alert("Login Success");
            },

            signUpFail : function(jqXHR, textStatus) {
                alert("Signup Fail");
            },

            singUpSuccess : function(response) {
                alert("Signup Success");
            },

            loginRetryFailed : function() {
                ebwLogin.showErrorMessage("server");
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
                    $(loginFieldPrefix + "password").on("keypress",ebwLogin.hideErrorMessage);
                    $(loginFieldPrefix + "userId").on("keypress",ebwLogin.hideErrorMessage);
                    ebwLogin.showErrorMessage("server");
                    $("#retryLoginBtn").on("click", function(){
                        var errorFields = ebwLogin.validateLogin(loginFieldPrefix);
                        if(errorFields.length > 0) {
                            EbwValidatorNS.indicateErrorFields(errorFields, null);
                            ebwLogin.showErrorMessage("client");
                        } else {
                            ebwLogin.doLogin(ebwLogin.loginRetryFailed,loginFieldPrefix);
                        }

                    });
                }
            },

            hideErrorMessage: function() {
                $("#login-error-message-server").hide();
                $("#login-error-message-client").hide();
                $("#login-error-message-box").hide();
            },

            showErrorMessage: function(type) {
                ebwLogin.hideErrorMessage();
                $("#login-error-message-" + type).show();
                $("#login-error-message-box").show();
            },

            getSignUpParams: function() {

                var firstName = $("#signup-first-name").val();
                var lastName = $("#signup-last-name").val();
                var email =  $("#signup-email").val();
                var password = $("#signup-password").val();
                var businessName = $("#signup-business-name").val();
                var businessCategory = $("#signup-business-category").val();
                return {
                    firstName : firstName,
                    lastName :  lastName,
                    email: email,
                    password: password,
                    businessName : businessName,
                    businessCategory: businessCategory
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
            validateLogin: function(fieldPrefix){
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
            },
            /**
             *
             * @returns {boolean}
             */
            validateSignUp: function(){
                var errorFields = [];
                var firstName = $("#signup-first-name");
                var lastName = $("#signup-last-name");
                var email =  $("#signup-email");
                var password = $("#signup-password");
                var confirmPassword = $("#signup-password-confirm");
                var businessName = $("#signup-business-name");
                var businessCategory = $("#signup-business-category");

                if(!EbwValidatorNS.isValidEmail(email)) {
                    errorFields.push(email);
                }

                if(!EbwValidatorNS.isValidLength(password, 6)) {
                    errorFields.push(password);
                }

                if(!EbwValidatorNS.isValidLength(firstName, 1)) {
                    errorFields.push(firstName);
                }

                if(!EbwValidatorNS.isValidLength(lastName, 1)) {
                    errorFields.push(lastName);
                }

                if(!EbwValidatorNS.isValidLength(businessName, 1)) {
                    errorFields.push(businessName);
                }

                if(!EbwValidatorNS.match(password, confirmPassword)) {
                    errorFields.push(confirmPassword);
                }
                return errorFields;
            }


        }
    }());
    //@sourceURL = resources/eb-web/js/login/ebw-login.js
    scope.EbwLoginNS = ebwLogin;
}(window, jQuery));