package com.example.android.jci
/**3/5/18*/
import retrofit2.http.Field
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface {

    @POST("register")
    @FormUrlEncoded
    fun pushData(@Field("device_model") device_model : String,
                 @Field("device_type") device_type:String,
                 @Field("device_os")device_os: String,
                 @Field("device_language")device_language:String,
                 @Field("device_os_version")device_os_version:String,
                 @Field("device_region")device_region:String,
                 @Field("device_sdk_version")device_sdk_version:String,
                 @Field("device_imei_number")device_imei_number:String,
                 @Field("device_id")device_id:String,
                 @Field("email_address")email_address:String,
                 @Field("device_manufacturer")device_manufacturer:String) : Observable<DeviceRegisterResult>
}