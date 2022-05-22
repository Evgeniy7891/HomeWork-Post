fun main() {
    val post1 = Post(
        0,
        1,
        2,
        3,
        4,
        "Hello",
        5,
        6,
        7,
        "Comment",
        "original",
        8,
        "repost",
        10,
        "first",
        11,
        true,
        true,
        true,
        15,
        true,
    )
    val (_, _, _, _, date, text) = post1  // эксперемнтировал с деструктиризацией
    println("$date, $text")
    val post2 = Post()// работа функции add
    WallService.add(post1)
    WallService.add(post2)
    WallService.print()
    val a = post1.copy(id = 2)
    // работа функции update
    if (WallService.update(a)) WallService.print()
    val nulll: String? = post1.comments // nullable
    val nulll2 = post1.comments?.length  // saf call
    val nulll3 = post1.comments ?: "Elvis" // elvis operator

    val newComment1: Comment = Comment(1, 1, 3, "Привет")
    WallService.createComment(newComment1)
    val newComment2 = Comment(33, 33, 33, "Пока")
   // WallService.createComment(newComment2)

    val complaint1 = ComplaintComment(1, 2, 5)
    println("\n" + WallService.createComplaint(complaint1))
    val complaint2 = ComplaintComment(23,23,3)
    WallService.createComplaint(complaint2)
}

