import kotlin.random.Random

object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postNew = post.copy(id = Random.nextInt(1, 10))
        posts += postNew
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
                posts[index] = updatePost.copy(id = post.id, date = post.id)
                return true
            }
        }
        return false
    }
}

