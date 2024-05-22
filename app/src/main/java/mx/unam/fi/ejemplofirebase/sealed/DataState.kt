package mx.unam.fi.ejemplofirebase.sealed

import mx.unam.fi.ejemplofirebase.model.Movie

sealed class DataState {
    class Success(val data:MutableList<Movie>):DataState()
    class Failure(val message:String):DataState()

    data object Loading:DataState()
    data object Empty:DataState()
}