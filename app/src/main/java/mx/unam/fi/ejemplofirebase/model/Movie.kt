package mx.unam.fi.ejemplofirebase.model

import java.util.Date

data class Movie(
    var cartel:String?=null,
    var clasificacion:String?=null,
    var estreno: Date?=null,
    var titulo:String?=null
    )
