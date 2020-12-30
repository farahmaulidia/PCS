package com.appserba.app.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data  class News (
    val nama_makanan: String = "",
    val harga: String = "",
    val jumlah: String = "",
    val gambar: String = ""
) : Parcelable