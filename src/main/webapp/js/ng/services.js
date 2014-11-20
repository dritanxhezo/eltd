'use strict';

angular.module('myApp.services', ['ngResource'])
	.value('version', '0.1')
	.value('appName', 'ELT Direct')
	.factory('UserService', function($resource) {
		return $resource('data/user.json');
	})
	.factory('AppPropertiesService', function($resource) {
		return $resource('data/appProperties.json');
	});
//	.factory('ReportsService', function($resource) {
//		return $resource('data/reports.json');
//	});