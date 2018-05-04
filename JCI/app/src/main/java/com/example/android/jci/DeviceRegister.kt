package com.example.android.jci
/**3/5/18*/

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.android.jci.SharedPreferenceHelper.Companion.setBooleanPreference
import com.example.android.jci.SharedPreferenceHelper.Companion.setStringPreference
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit


class DeviceRegister : AppCompatActivity() {

/*    internal var deviceModelName: String? = null
    internal var deviceManufacturer: String? = null
    internal var deviceAndroidVersion: String? = null
    internal var androidDeviceId: String? = null*/


    private val TAG = DeviceRegister::class.java.simpleName

    private val BASE_URL = "http://jcizone18.org/api/1/"

    //private var mCompositeDisposable: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_register)

        val requestInterface = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiInterface::class.java)

        /*requestInterface.pushData("Zen","android","android","english","marshmellow","india","21","0987654","123576778","j@gmail.com","asus")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError)
                //.subscribe({})*/

        requestInterface.pushData("Zen","android","android","english","marshmellow","india","21","0987654","123576778","j@gmail.com","asus")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        { result ->
                    //Log.e(TAG,result.errorBody().toString())
                            //Log.e(TAG,result.code().toString())
                            //Log.e(TAG,result.message())
                            setBooleanPreference(this,"isDeviceRegister",true)
                            setStringPreference(this,"app_id",result.app_id)


                },
                        {error ->
                           Log.e(TAG,"ERROR ${error.message}")

                })

    }

   /* private fun handleResponse(result : DeviceRegisterResult) {
        Toast.makeText(this,"Success : ${result.app_id}",Toast.LENGTH_LONG).show()
        setBooleanPreference(this,"isDeviceRegister",true)
        setStringPreference(this,"app_id",result.app_id)
    }

    private fun handleError(error: Throwable) {
        Toast.makeText(this,"Error",Toast.LENGTH_LONG).show()
    }*/
}
