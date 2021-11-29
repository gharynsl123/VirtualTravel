package com.example.virtualtravel.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Home(
    var nameHom: String,
    var infoHom: String,
    var priceHom: String,
    var descHom: String,
    var locatHom: String,
    var photoHom: Int

) : Parcelable