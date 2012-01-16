PhoneGap BlackBerry Database Example

External library PersistenceJS (http://persistencejs.org) is used to provide object oriented database operations in  BlackBerry 5.x onwards devices. On BlackBerry 5.x, it uses Google Gears for storage and 6.x onwards uses localstorage.

The project also contains a sample Plugin at location www/ext/com/promenta/plugins. All changes required to run plugin:
-----------------------------------------------------------------------------------------------------------------------

	1)  www/ext/com/promenta/plugins/AppComm.java
	2)  plugins.xml
	3)  plugins/appcomm.js
	4)  index.html (contains plugin call)