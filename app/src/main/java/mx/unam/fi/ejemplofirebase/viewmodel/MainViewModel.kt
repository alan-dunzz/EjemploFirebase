package mx.unam.fi.ejemplofirebase.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import mx.unam.fi.ejemplofirebase.model.Movie
import mx.unam.fi.ejemplofirebase.sealed.DataState

class MainViewModel: ViewModel() {
    private val db = Firebase.firestore
    val response: MutableState<DataState> = mutableStateOf(DataState.Empty)
    init{
        fetchDataFromFirebase()
    }

    private fun fetchDataFromFirebase(){
        val tempList = mutableListOf<Movie>()
        response.value = DataState.Loading
        db.collection("Cine")
            .get()
            .addOnSuccessListener {
                    document ->

                for( dataSnap in document  ){

                    val movieItem = dataSnap.toObject(Movie::class.java)
                    Log.d("getFirebase",movieItem.titulo.toString() )
                    Log.d("getFirebase",movieItem.clasificacion.toString() )
                    Log.d("getFirebase",movieItem.cartel.toString() )
                    tempList.add(movieItem)
                }
                response.value = DataState.Success(tempList)



            }.addOnCanceledListener {
                response.value = DataState.Failure(error("Error"))
            }

    }

}