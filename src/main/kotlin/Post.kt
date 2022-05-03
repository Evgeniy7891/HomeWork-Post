import java.util.Objects

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "Hello",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Int = 0,
    val comments: String = "comments",
    val copyRight: String = "copyright",
    val likes: Int = 0,
    val reposts: String = "repost",
    val views: Int = 0,
    val postType: String = "copy",
    val signerId: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Int = 0,
    val isFavorite: Boolean = false,

) {
}
