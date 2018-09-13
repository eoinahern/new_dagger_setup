package newdaggersetup.eoinahern.ie.newdaggersetup.di

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import newdaggersetup.eoinahern.ie.newdaggersetup.App


@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, BuildersModule::class])
interface AppComponent {

	fun inject(app: App)

}