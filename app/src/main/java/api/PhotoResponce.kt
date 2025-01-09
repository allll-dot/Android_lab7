package api
import com.example.alab7.GalleryItem
import com.google.gson.annotations.SerializedName
class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems : List<GalleryItem>
}