package hsh.com.lottoapplication

import android.app.Application

open class MainApplication: Application() {
	companion object{
		lateinit var instance: MainApplication
		private set
	}

	override fun onCreate() {
		super.onCreate()
		instance = this
	}
}