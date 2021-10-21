import com.google.gson.Gson
import java.io.File

fun main() {
    val post = "post.json"
    val posts = PostData.getPostBase()
    val json = Gson().toJson(posts)
    File(post).writeText(json)
}