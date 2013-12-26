/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/6/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
(function (scope, $) {
    var ebwAppCommon = (function () {
        var APP_NAME_EBW = "earnbook-web";
        return {
            getAppName: function () {
                 return APP_NAME_EBW;
            },

            getUrl: function (url) {
                return APP_NAME_EBW + url;
            }
        }
    }());
    //@sourceURL = resources/eb-web/js/constants/ebw-app-constants.js
    scope.EbwAppCommmonNS = ebwAppCommon;
}(window, jQuery));