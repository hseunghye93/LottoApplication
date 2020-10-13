package hsh.com.lottoapplication.util

import android.widget.Toast
import hsh.com.lottoapplication.MainApplication

class ShowToast{
	companion object{
		fun LongToast(message: String){
			Toast.makeText(MainApplication.instance, message, Toast.LENGTH_LONG).show()
		}
		fun ShortToast(message: String){
			Toast.makeText(MainApplication.instance, message, Toast.LENGTH_SHORT).show()
		}
	}
}
