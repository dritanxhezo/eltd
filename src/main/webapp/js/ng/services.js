'use strict';

angular.module('myApp.services', ['ngResource'])
	.value('version', '0.1')
	.factory('UserService', function($resource) {
		return $resource('data/user.json');
	});
//	.factory('ReportsService', function($resource) {
//		return $resource('data/reports.json');
//	});