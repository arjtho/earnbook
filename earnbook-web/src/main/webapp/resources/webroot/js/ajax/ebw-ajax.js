/**
 * Ajax framework.
 * Created with IntelliJ IDEA.
 * User: Mahadev
 * Date: 11/6/13
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
(function(scope,$) {
    var ebwAjax =(function(){

        return {

            /**
             * This function will be called when the ajax request is failed.
             * Custom event will be triggered on base element configured.
             * @param jqXHR
             * @param textStatus
             * @param actionName
             */
            onFail: function (jqXHR, textStatus, settings) {
                if(settings.onFail) {
                    settings.onFail(jqXHR, textStatus);
                }
            },

            /**
             * This function will be called when the ajax request is completed successfully.
             * Custom event will be triggered on base element configured.
             * @param response
             * @param acitionName
             */
            onSuccess: function (response, settings) {
                if(settings.onSuccess) {
                    settings.onSuccess(response);
                }
            },

            /**
             * This function will be called when the ajax request is completed erespective of success or fail.
             * Custom event will be triggered on base element configured.
             * @param response
             * @param acitionName
             */
            finally: function (jqXHR, textStatus, settings) {
               if(settings.finally) {
                   settings.finally(jqXHR, textStatus);
               }
            },


            /**
             * Call this function to send the information to server and get the html response back.
             * @param actionName
             * @param url
             * @param dataToSend
             */
            makeServerCall: function (actionName, url, dataToSend) {

                var request = $.ajax({
                    url: url,
                    type: "POST",
                    data: dataToSend,
                    dataType: "html"
                });

                request.done(function (msg) {

                });

                request.fail(function (jqXHR, textStatus) {

                });
            },


            /**
             * Call this function to send the information to server and get the json response back.
             * @param actionName
             * @param url
             * @param dataToSend
             */
            makeServerCallToGetJson: function (settings) {
                var ajaxSetting = {
                    url: "",
                    type: "POST",
                    params: "",
                    dataType: "json",
                    contentType: "application/json",
                    onSuccess: undefined,
                    onFail : undefined,
                    finally : undefined
                };

                $.extend( ajaxSetting, settings );
                if(ajaxSetting.url) {
                    var request = $.ajax({
                        url: ajaxSetting.url,
                        type: "POST",
                        data: JSON.stringify(ajaxSetting.params),
                        dataType: "json",
                        contentType: "application/json"
                    });
                    request.done(function (data) {
                        ebwAjax.onSuccess(data, ajaxSetting)
                    });

                    request.fail(function (jqXHR, textStatus) {
                        ebwAjax.onFail(jqXHR, textStatus, ajaxSetting)
                    });

                    request.always(function (jqXHR, textStatus) {
                        ebwAjax.finally(jqXHR, textStatus, ajaxSetting)
                    });
                }
            }
        }
    }());
    //@sourceURL = resources/eb-web/js/ajax/ebw-ajax.js
    scope.EbwAjaxNS = ebwAjax;
}(window,jQuery));

