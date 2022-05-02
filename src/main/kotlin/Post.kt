import java.util.Objects
import kotlin.random.Random

data class Post(
    val id: Int = 0,
    val owner_id: Int = 0,
    val from_id: Int = 0,
    val created_by: Int = 0,
    val date: Int = 0,
    val text: String = "Hello",
    val reply_owner_id: Int = 0,
    val reply_post_id: Int = 0,
    val friends_only: Int = 0,
    val comments: String = "comments",
    val copyright: String = "copyright",
    val likes: Int = 0,
    val reposts: String = "repost",
    val views: Int = 0,
    val post_type: String = "copy",
    val signer_id: Int = 0,
    val can_pin: Boolean = true,
    val can_delete: Boolean = true,
    val can_edit: Boolean = true,
    val is_pinned: Int = 0,
    val is_favorite: Boolean = false,

) {
}
