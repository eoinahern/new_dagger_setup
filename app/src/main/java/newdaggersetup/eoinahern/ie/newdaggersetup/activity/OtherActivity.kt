package newdaggersetup.eoinahern.ie.newdaggersetup.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import newdaggersetup.eoinahern.ie.newdaggersetup.R
import dagger.android.AndroidInjection
import newdaggersetup.eoinahern.ie.newdaggersetup.common.OtherSayHelloHelper
import javax.inject.Inject

class OtherActivity : AppCompatActivity() {

	@Inject lateinit var otherHelloHelper : OtherSayHelloHelper

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_other)
		println(otherHelloHelper.sayHelloAgain())
	}
}
