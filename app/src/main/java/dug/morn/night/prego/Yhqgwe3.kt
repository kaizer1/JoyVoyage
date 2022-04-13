package dug.morn.night.prego

import android.app.Application
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.firebase.FirebaseApp

class Yhqgwe3 : Application(){


    // appsflyer key = NQchtdmSFJz8kkvbpGHxSn
    private val qhegbdbwqYTWW: String = "895BHzVvzJkVCzxq3cXFwD"

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)

        val conversionDataListener  = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
                data?.let { cvData ->
                    cvData.map {
                        Log.i("f3ff", "conversion_attribute:  ${it.key} = ${it.value}")
                    }
                }
            }

            override fun onConversionDataFail(error: String?) {
                Log.e("df", "error onAttributionFailure :  $error")
            }

            override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
                data?.map {
                    Log.d("df", "onAppOpen_attribute: ${it.key} = ${it.value}")
                }
            }

            override fun onAttributionFailure(error: String?) {
                Log.e("LOG_TAG", "error onAttributionFailure :  $error")
            }
        }

        AppsFlyerLib.getInstance().init(qhegbdbwqYTWW, conversionDataListener, applicationContext)
        AppsFlyerLib.getInstance().startTracking(this)
    }

}