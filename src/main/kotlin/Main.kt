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
    val post2 = Post()
    // работа функции add
    WallService.add(post1)
    WallService.add(post2)
    WallService.print()
    // работа функции update
    if (WallService.update(post2))WallService.print()
    }
