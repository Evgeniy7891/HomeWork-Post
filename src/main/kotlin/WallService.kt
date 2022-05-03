
object WallService {
    var posts = emptyArray<Post>()
    var generateId = 1

    fun add(post: Post): Post {
        val postNew = post.copy(id = generateId)
        posts += postNew
        generateId += 1
        return posts.last()
    }

    fun print() {
        for (post in posts) {
            print(post)
        }
    }

    fun update(post: Post): Boolean {
        for ((index, updatePost) in posts.withIndex()) {
            if (post.id == updatePost.id) {
                posts[index] = updatePost.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }
}
