
var AppCommControl = function() {
};

AppCommControl.prototype.running = function(successCallback, failureCallback) {
 return PhoneGap.exec(    successCallback,    //Success callback from the plugin
      failureCallback,     //Error callback from the plugin
      'AppComm',  //Tell PhoneGap to run Plugin
      'running',              //Tell plugin, which action we want to perform
      []);        //Passing list of args to the plugin
};

PhoneGap.addConstructor(function() {
    PhoneGap.addPlugin("appcomm", new AppCommControl());
});