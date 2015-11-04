package edu.umkc.cs5573.cyborgp2p;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Younghwan on 11/2/2015.
 */
public class MyPreference {
    public static final String PREF_SSO = "pref_sso";
    public static final String PREF_TYPE = "pref_type";
    public static final String PREF_NAME = "pref_name";
    public static final String PREF_ORG = "pref_organization";
    public static final String PREF_EMAIL = "pref_email";
    public static final String PREF_PHONE = "pref_phonenumber";

    public static SharedPreferences getMyPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setMyInfo(Context context, String sso, int type, String name,
                                 String organization, String email, String phoneNumber){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit =pref.edit();
        edit.putString(PREF_SSO, sso);
        edit.putInt(PREF_TYPE, type);
        edit.putString(PREF_NAME, name);
        edit.putString(PREF_ORG, organization);
        edit.putString(PREF_EMAIL, email);
        edit.putString(PREF_PHONE, phoneNumber);

    }

}
