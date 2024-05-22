package mx.unam.fi.ejemplofirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import mx.unam.fi.ejemplofirebase.ui.components.SetData
import mx.unam.fi.ejemplofirebase.ui.theme.EjemploFirebaseTheme
import mx.unam.fi.ejemplofirebase.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel:MainViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploFirebaseTheme {
                Column(){
                    TopAppBar(
                        title = {
                            Text(text = "Películas de Estreno")
                        },
                        Modifier.background(Color.Black)
                    )
                    SetData(viewModel = viewModel)
                }
            }
        }
    }
}
