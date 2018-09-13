package newdaggersetup.eoinahern.ie.newdaggersetup

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import newdaggersetup.eoinahern.ie.newdaggersetup.di.AppModule
import newdaggersetup.eoinahern.ie.newdaggersetup.di.DaggerAppComponent
import javax.inject.Inject

class App : Application(), HasActivityInjector{

	@Inject lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Activity>

	override fun onCreate() {
		super.onCreate()
		DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)
	}

	override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}