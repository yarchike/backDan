data class Post(
    val id: Int,
    val author: String,
    val data: Long,
    val txt: String,
    var like: Boolean,
    val comment: Boolean,
    val share: Boolean,
    var likeTxt: Int,
    val commentTxt: Int,
    val shareTxt: Int,
    val adress: String,
    val coordinates: Pair<Double, Double>,
    val type: Types,
    val url: String? = null,
    val dateRepost: Long? = null,
    val autorRepost: String? = null,
    var hidePost: Boolean = false
)
enum class Types {
    Reposts,
    YoutubeVideo,
    SponsoredPosts
}