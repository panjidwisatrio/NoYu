package com.panjidwisatrio.noyu.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieIntent(
    var title : String = "",
    var usia : String = "",
    var genre : String = "",
    var rating : String = "",
    var sinopsis : String = "",
    var negara : String = "",
    var name : String = "",
    var reference : String = "",
    var tahun : String = "",
    var aktor : Int = 0,
    var thumbnail : Int = 0
) : Parcelable
