package mx.unam.fi.ejemplofirebase.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import mx.unam.fi.ejemplofirebase.model.Movie

@Composable
fun CardItem(movie: Movie){
    Card(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(horizontal=20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
            )
            {

                AsyncImage(model = movie.cartel ,
                    contentDescription =movie.titulo )

            }
            Spacer(modifier = Modifier.height(22.dp))
            TextMovie(label = "Título", title = movie.titulo )
            Spacer(modifier = Modifier.height(22.dp))
            TextMovie(label = "Clasificación", title = movie.clasificacion )
            Spacer(modifier = Modifier.height(22.dp))
            TextMovie(label = "Estreno", title = movie.estreno.toString() )

        }

    }
}
