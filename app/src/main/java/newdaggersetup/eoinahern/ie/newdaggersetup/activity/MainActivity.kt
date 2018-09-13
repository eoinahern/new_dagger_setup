package newdaggersetup.eoinahern.ie.newdaggersetup.activity

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import newdaggersetup.eoinahern.ie.newdaggersetup.R
import newdaggersetup.eoinahern.ie.newdaggersetup.common.CommonHelloService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

	@Inject
	lateinit var commonHelloService: CommonHelloService

	@Inject
	lateinit var sharedPrefs: SharedPreferences

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		println(commonHelloService.sayHello())
	}
}
