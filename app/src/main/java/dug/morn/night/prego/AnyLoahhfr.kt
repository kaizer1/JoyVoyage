package dug.morn.night.prego

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import java.lang.Exception
import java.net.URL

class AnyLoahhfr(st : String) : AsyncTask<String, Unit, Bitmap>() {

    var dell : Ooopwiec? = null

    override fun doInBackground(vararg p0: String?): Bitmap? {
        //
        val njew : String? = p0[0]
        var kldjnMap : Bitmap? = null

        try{
            var nbcb4 = URL(njew).openStream()
            kldjnMap = BitmapFactory.decodeStream(nbcb4)
            return kldjnMap

        }catch (dkek : Exception){
            println(" Error and mistakees == ${dkek.message}")
        }
        return null
    }


    override fun onPostExecute(ihqbe: Bitmap) {
        //super.onPostExecute(result)
       dell!!.callNNe(ihqbe)
    }

}