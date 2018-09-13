package newdaggersetup.eoinahern.ie.newdaggersetup.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import newdaggersetup.eoinahern.ie.newdaggersetup.App
import newdaggersetup.eoinahern.ie.newdaggersetup.common.CommonHelloService
import javax.inject.Singleton


@Module
class AppModule constructor(private val myApp: App) {

	@Singleton
	@Provides
	fun getContext(): Context = myApp.applicationContext

	@Singleton
	@Provides
	fun getHelloService() = CommonHelloService()

	@Singleton
	@Provides
	fun getSharedPrefs(context: Context): SharedPreferences {
		return PreferenceManager.getDefaultSharedPreferences(context)
	}

	@Singleton
	@Provides
	fun getEdit(sharedPrefs: SharedPreferences): SharedPreferences.Editor = sharedPrefs.edit()


}