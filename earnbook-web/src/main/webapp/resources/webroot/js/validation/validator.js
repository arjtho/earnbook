/**
 * Created with IntelliJ IDEA.
 * User: Mahadev
 * Date: 11/8/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var validator = (function () {

        return {
            /**
             *
             * @param jqElement
             * @returns {boolean}
             */
            isNotEmpty : function(jqElement) {
                var result = false;
                if(jqElement) {
                    var elValue = jqElement.val();
                    if(elValue != null && elValue.trim() !="") {
                        result = true;
                    }
                }
                return result;
            },

            /**
             *
             * @param jqElement1
             * @param jqElement2
             * @returns {boolean}
             */
            match: function(jqElement1, jqElement2) {
                var result = false;
                if(jqElement1 && jqElement2) {
                    var el1Value = jqElement1.val();
                    var el2Value = jqElement2.val();
                    if(el1Value != null && el2Value != null
                        && el1Value.trim() !=="" && el2Value.trim() !=="") {
                        if(el1Value === el2Value) {
                            result = true;
                        }
                    }
                }
                return result;
            },

            /**
             *
             * @param emailAddress
             * @returns {boolean}
             */
            isValidEmail: function(emailAddress){
                var result = false;
                if(validator.isNotEmpty(emailAddress)) {
                    var emailRegex = new RegExp(/^([\w\.\-]+)@([\w\-]+)((\.(\w){2,3})+)$/i);
                    var valid = emailRegex.test(emailAddress.val());
                    if (valid) {
                        result = true;
                    }
                }
                return result;
            },

            /**
             *
             * @param jqElement
             * @param requiredLength
             * @returns {boolean}
             */
            isValidLength : function(jqElement, requiredLength) {
                var result = false;
                if(validator.isNotEmpty(jqElement) && jqElement.val().length >= requiredLength) {
                    result = true;
                }
                return result;
            },

            indicateErrorFields: function (errorFields, prefix) {
                var errorClass = "validation-error-fields";
                if(errorFields && errorFields.length > 0) {
                    $.each( errorFields, function( index, element ) {
                        if(!element.jquery) {
                            if(prefix && prefix.trim()!= "") {
                                element =  $(prefix + element);
                            }
                        }
                        element.addClass(errorClass);
                        element.on("keypress", function() {
                           if($(this).hasClass(errorClass)) {
                               $(this).removeClass(errorClass);
                           }
                        });
                    });
                }
            }
        }
    }());
    //@sourceURL = resources/eb-web/js/validation/ebw-validator.js
    scope.EbwValidatorNS = validator;
}(window, jQuery));