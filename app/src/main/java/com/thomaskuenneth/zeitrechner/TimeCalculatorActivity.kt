package com.thomaskuenneth.zeitrechner

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import eu.thomaskuenneth.adaptivescaffold.defaultColorScheme
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
class TimeCalculatorActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try{

            lifecycleScope.launch {
                lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    setContent {
                        MaterialTheme(
                            content = { TimeCalculatorScreen() },
                            colorScheme = defaultColorScheme()
                        )
                    }
                }
            }

        }catch (e: Exception){

            // Log.e("TAG", "Exception occurred, stack trace: " + e.getStackTraceString())

        }finally {

        }

    }
}
