package com.example.alab7

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GalleryItem(
    @PrimaryKey var id: String = "",
    var title: String = "",
    @SerializedName("url_s") var url: String = ""
)