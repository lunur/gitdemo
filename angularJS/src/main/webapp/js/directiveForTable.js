angular.module('directiveForTable', []).directive('datatable',[function() {
    return {
        restrict: 'AE', //Element Attribute
        template:
'           <table class="table table-hover table-bordered">\n' +
'                <tr ng-repeat="currData in dat">\n' +
'                    <td>{{currData.id}}</td>\n' +
'                    <td>{{currData.name}}</td>\n' +
'                    <td>{{currData.intro}}</td>\n' +
'                </tr>\n' +
'            </table>'
        ,
        replace:true,
        scope:{
            dat : "=listdata" //    = 和父scope双向绑定
        }
    }
}]);

