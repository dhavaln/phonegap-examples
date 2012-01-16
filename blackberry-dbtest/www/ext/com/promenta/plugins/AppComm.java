
package com.promenta.plugins;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

import com.phonegap.json4j.JSONArray;

public class AppComm extends Plugin {

	/**
     * Executes the requested action and returns a PluginResult.
     *
     * @param action     The action to execute.
     * @param callbackId The callback ID to be invoked upon action completion.
     * @param args       JSONArry of arguments for the action.
     * @return           A PluginResult object with a status and message.
     */
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        System.out.println("plugin action - " + action + " called ");
		return new PluginResult(PluginResult.Status.OK, "11");
    }

    /**
     * Called when Plugin is paused.
     */
    public void onPause() {
    }

    /**
     * Called when Plugin is resumed.
     */
    public void onResume() {
    }

    /**
     * Called when Plugin is destroyed.
     */
    public void onDestroy() {
    }
}
