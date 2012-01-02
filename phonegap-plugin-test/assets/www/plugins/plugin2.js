
var Plugin2 = function() {
};

Plugin2.prototype.call = function(successCallback, failureCallback) {
	return PhoneGap.exec(successCallback, failureCallback, 'Plugin2',
			'call', []);
};

PhoneGap.addConstructor(function() {
	PhoneGap.addPlugin("plugin2", new Plugin2());
});