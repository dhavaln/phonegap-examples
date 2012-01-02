
var Plugin1 = function() {
};

Plugin1.prototype.call = function(successCallback, failureCallback) {
	return PhoneGap.exec(successCallback, failureCallback, 'Plugin1',
			'call', []);
};

PhoneGap.addConstructor(function() {
	PhoneGap.addPlugin("plugin1", new Plugin1());
});