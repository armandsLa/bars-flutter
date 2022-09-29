package com.example.bars

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()
        splashScreen.setOnExitAnimationListener { splashScreenView -> splashScreenView.remove() }

        super.onCreate(savedInstanceState)
    }

}
