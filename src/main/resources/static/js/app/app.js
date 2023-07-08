'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getUserByIdUrl : "/persons/v1/all",
	getAllUsers : "/persons/v1/all",
	saveUser : "/persons/v1/save"
});