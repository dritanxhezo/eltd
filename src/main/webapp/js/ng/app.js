'use strict';

// Declare app level module which depends on filters, and services
angular.module('myApp', [
  'ngRoute',
  'myApp.filters',
  'myApp.services',
  'myApp.directives',
  'myApp.controllers',
  'myApp.controllers.MainController',
  'myApp.controllers.ReportsController',
  'myApp.controllers.HelpController',
  'angularTreeview'
  //'jsonService'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {templateUrl: 'home.html', controller: 'homeCtrl'});
  $routeProvider.when('/new_loan', {templateUrl: 'new_loan.html', controller: 'newLoanCtrl'});
  $routeProvider.when('/new_title', {templateUrl: 'new_title.html', controller: 'newTitleCtrl'});
  $routeProvider.when('/find_loan', {templateUrl: 'find_loan.html', controller: 'findLoanCtrl'});
  $routeProvider.when('/find_title', {templateUrl: 'find_title.html', controller: 'findTitleCtrl'});
  $routeProvider.when('/reports', {templateUrl: 'reports.html', controller: 'reportsCtrl'});
  $routeProvider.when('/users', {templateUrl: 'users.html', controller: 'usersCtrl'});
  $routeProvider.when('/import', {templateUrl: 'import.html', controller: 'importCtrl'});
  $routeProvider.when('/help', {templateUrl: 'help.html', controller: 'helpCtrl'});
  $routeProvider.when('/workflow', {templateUrl: 'workflow.html', controller: 'workflowCtrl'});
  $routeProvider.otherwise({redirectTo: '/home'});
}]);