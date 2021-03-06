'use strict';

angular.module('myApp.controllers.HelpController', ['ngPDFViewer'])
	.controller('HelpController', ['$scope', 'PDFViewerService', function($scope, pdf) {
		console.log('HelpController: new instance');

		$scope.pdfURL = "manual.pdf";

		$scope.instance = pdf.Instance("viewer");

		$scope.nextPage = function() {
			$scope.instance.nextPage();
		};

		$scope.prevPage = function() {
			$scope.instance.prevPage();
		};

		$scope.gotoPage = function(page) {
			$scope.instance.gotoPage(page);
		};

		$scope.pageLoaded = function(curPage, totalPages) {
			$scope.currentPage = curPage;
			$scope.totalPages = totalPages;
		};

		$scope.loadProgress = function(loaded, total, state) {
			console.log('loaded =', loaded, 'total =', total, 'state =', state);
		};
	}]);