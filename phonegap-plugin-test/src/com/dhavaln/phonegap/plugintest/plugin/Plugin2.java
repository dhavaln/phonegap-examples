package com.dhavaln.phonegap.plugintest.plugin;

import org.json.JSONArray;

import android.util.Log;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

public class Plugin2 extends Plugin {

	public static final String ACTION_START = "call";

	public Plugin2() {
	}

	@Override
	public PluginResult execute(String action, JSONArray data, String callbackId) {
		Log.i("Plugin2", action + " Action called with callback id "
				+ callbackId );

		PluginResult.Status status = PluginResult.Status.INVALID_ACTION;
		String result = "Unsupported Operation: " + action;

		// either start or stop the listener...
		if (action.equals(ACTION_START)) {
		}

		return new PluginResult(status, result); // no valid action called
	}

}
