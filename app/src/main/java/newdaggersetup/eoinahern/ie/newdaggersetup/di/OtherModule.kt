package newdaggersetup.eoinahern.ie.newdaggersetup.di

import dagger.Module
import dagger.Provides
import newdaggersetup.eoinahern.ie.newdaggersetup.common.OtherSayHelloHelper

@Module
class OtherModule {

	@Provides
	fun getSayHelloOther() : OtherSayHelloHelper {
		return OtherSayHelloHelper()
	}
}