object WallService {
    var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    var generateId = 1
    private var complaints = emptyArray<ComplaintComment>()

    fun createComment(comment: Comment): Boolean {
        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Невозмoжно добавить коментарий")
    }

    fun createComplaint(complaint: ComplaintComment): String {
        var x: String = " "
        when (complaint.reason) {
            0 -> x = "Спам"
            1 -> x = "Детская порнография"
            2 -> x = "Экстремизм"
            3 -> x = "Насилие"
            4 -> x = "Пропаганда наркотиков"
            5 -> x = "Оскорбление"
            6 -> x = "Материал для взрослых"
            7 -> x = "Призыв к суициду"
            else -> throw ErrorCommentException("Ошибка - не найдена причина жалобы")
        }
        for (comment in comments) {
            if (comment.ownerId == complaint.ownerId) {
                complaints += complaint
                return "Жалоба по причине - $x"
            }
        }
        throw ErrorCommentException("Жалоба не принята")
    }


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
