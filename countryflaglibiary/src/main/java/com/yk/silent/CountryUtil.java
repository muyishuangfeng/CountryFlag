package com.yk.silent;


import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;

public class CountryUtil {

    public static void getCountry(Context context, AppCompatImageView mImgCountry) {
        if (!TextUtils.isEmpty(getCountryName(context))) {
            String country = getCountryName(context);
            int flag = context.getResources().getIdentifier("flag_" + country.toLowerCase(),
                    "drawable",
                    context.getPackageName());
            mImgCountry.setImageResource(flag);
        }
    }

    public static void getCountryFlag( Context context, String countryCode,AppCompatImageView mImgCountry) {
        if (!TextUtils.isEmpty(countryCode)) {
            int flag = context.getResources().getIdentifier("flag_" + countryCode.toLowerCase(),
                    "drawable",
                    context.getPackageName());
            mImgCountry.setImageResource(flag);
        }
    }

    public static void getCountry(Context context,String countryCode,  AppCompatImageView mImgCountry) {
        Type mType = new TypeToken<List<PhoneModel>>() {
        }.getType();
        List<PhoneModel> mList = new Gson().fromJson(JsonUtils.getJson(context, "sms.json"), mType);
        for (int i = 0; i <mList.size() ; i++) {
            if (countryCode.equals(mList.get(i).getCode())){
                int flag = context.getResources().getIdentifier("flag_" + mList.get(i).getAbbr().toLowerCase(),
                        "drawable",
                        context.getPackageName());
                mImgCountry.setImageResource(flag);
                return;
            }
        }
    }


    /**
     * 获取设备的国家缩写
     */
    private static String getCountryName(Context context) {
        String countryZipCode = "";
        Locale locale = context.getResources().getConfiguration().locale;
        countryZipCode = locale.getCountry();
        return countryZipCode;
    }
}
