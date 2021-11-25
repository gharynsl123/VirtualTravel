package com.example.virtualtravel.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Home(
    var name: String?,
    var info: String?,
    var price: String?,
    var photo: String?,
    var desc: String?,
    var locat: String?

) : Parcelable