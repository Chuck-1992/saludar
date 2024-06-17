package org.example.miplugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class MiPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("saludar".equals(action)) {
            this.saludar(args, callbackContext);
            return true;
        }
        return false;
    }

    private void saludar(JSONArray args, CallbackContext callbackContext) {
        try {
            String nombre = args.getString(0);
            String mensaje = "Hola " + nombre;
            callbackContext.success(mensaje);
        } catch (JSONException e) {
            callbackContext.error("Error al leer el nombre");
        }
    }
}
