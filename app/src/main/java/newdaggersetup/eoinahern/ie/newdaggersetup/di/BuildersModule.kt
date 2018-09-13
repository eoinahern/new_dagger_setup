package newdaggersetup.eoinahern.ie.newdaggersetup.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import newdaggersetup.eoinahern.ie.newdaggersetup.activity.MainActivity
import newdaggersetup.eoinahern.ie.newdaggersetup.activity.OtherActivity


@Module
abstract class BuildersModule {

	@ContributesAndroidInjector
	abstract fun bindsMainActivity(): MainActivity

	@ContributesAndroidInjector(modules= [OtherModule::class])
	abstract fun bindOtherActivity() : OtherActivity
}