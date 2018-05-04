package com.example.android.jci

import android.content.Context
import android.content.SharedPreferences


/**
 * Created by Jovee-2 on 04-Jul-17.
 */

class SharedPreferenceHelper {
    companion object {

        fun getStringPreference(context: Context, key: String, defaultTest: String): String? {
            return getPreference(context).getString(key, defaultTest)
        }

        fun setStringPreference(context: Context, key: String, value: String) {
            getPreference(context).edit().putString(key, value).apply()
        }

        fun getBooleanPreference(context: Context, key: String, default_value: Boolean?): Boolean {
            return getPreference(context).getBoolean(key, default_value!!)
        }

        fun setBooleanPreference(context: Context, key: String, value: Boolean?) {
            getPreference(context).edit().putBoolean(key, value!!).apply()
        }

        fun getIntPreference(context: Context, key: String): Int {
            return getPreference(context).getInt(key, 0)
        }

        fun setIntPreference(context: Context, key: String, value: Int) {
            getPreference(context).edit().putInt(key, value).apply()
        }


        fun getPreference(context: Context): SharedPreferences {
            return context.getSharedPreferences("MyAppPreference", Context.MODE_PRIVATE)
        }
    }

}
