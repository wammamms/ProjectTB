package com.seventyseven.projecttb.utils

import android.content.Context
import android.content.SharedPreferences
import com.seventyseven.projecttb.MyApplication

object SPUtils {

    const val USER_FILE = "UserData"
    const val USER_ACCOUNT = "account"
    const val USER_TOKEN = "token"
    const val USER_PASSWORD = "password"
    const val BANNER_TYPE = "bannerType"
    const val BANNER_LIST = "bannerList"
    const val ACTION_LIST = "actionList"

    var account : String
        get() = getData(MyApplication.instance().baseContext, USER_FILE, USER_ACCOUNT,"").toString()
        set(value) {
            if (value != null) {
                putData(MyApplication.instance().baseContext, USER_FILE, USER_ACCOUNT,value)
            }
        }

    var token : String
        get() = getData(MyApplication.instance().baseContext, USER_FILE, USER_TOKEN,"") as String
        set(value) {
            if (value != null) {
                putData(MyApplication.instance().baseContext, USER_FILE, USER_TOKEN,value)
            }
        }

    var password
        get() = getData(MyApplication.instance().baseContext, USER_FILE, USER_PASSWORD,"")
        set(value) {
            if (value != null) {
                putData(MyApplication.instance().baseContext, USER_FILE, USER_PASSWORD,value)
            }
        }

    var bannerType : Int
        get() = getData(MyApplication.instance().baseContext, USER_FILE, BANNER_TYPE,0).toString().toInt()
        set(value){
            if (value != null) {
                putData(MyApplication.instance().baseContext, USER_FILE, BANNER_TYPE,value)
            }
        }

    fun putData(context: Context, spName: String?, key: String?, `object`: Any) {
        val sp: SharedPreferences = context.getSharedPreferences(
            spName,
            Context.MODE_PRIVATE
        )
        val editor = sp.edit()
        when (`object`) {
            is String -> {
                editor.putString(key, `object`)
            }
            is Int -> {
                editor.putInt(key, `object`)
            }
            is Boolean -> {
                editor.putBoolean(key, `object`)
            }
            is Float -> {
                editor.putFloat(key, `object`)
            }
            is Long -> {
                editor.putLong(key, `object`)
            }
            else -> {
                editor.putString(key, `object`.toString())
            }
        }
        editor.apply()
    }


    fun getData(
        context: Context,
        spName: String?,
        key: String?,
        defaultObject: Any?
    ): Any? {
        val sp = context.getSharedPreferences(
            spName,
            Context.MODE_PRIVATE
        )
        when (defaultObject) {
            is String -> {
                return sp.getString(key, defaultObject as String?)
            }
            is Int -> {
                return sp.getInt(key, (defaultObject as Int?)!!)
            }
            is Boolean -> {
                return sp.getBoolean(key, (defaultObject as Boolean?)!!)
            }
            is Float -> {
                return sp.getFloat(key, (defaultObject as Float?)!!)
            }
            is Long -> {
                return sp.getLong(key, (defaultObject as Long?)!!)
            }
            else -> return null
        }
    }
}