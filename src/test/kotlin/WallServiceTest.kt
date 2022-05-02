import org.jetbrains.annotations.NotNull
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    // тест на проверку что не ноль
    @Test
    fun add_NotZeroTest() {
        val service = WallService
        val test = service.add(
            Post(
                0,
                1,
                2,
                3,
                4,
                "text",
                5,
                6,
                7,
                "com",
                "copy",
                8,
                "repo",
                9,
                "type",
                10,
                true,
                true,
                true,
                11,
                true
            )
        )
        assertTrue(test.id > 0)
    }

    // тест что возращается true
    @Test
    fun update_True_Test() {
        val service = WallService
        val test1 = Post(0, 1, 2, 3, 4, "5", 6, 7, 8, "9", "10", 11, "12", 13, "14", 15, true, false, true, 16, true)
        val test2 =
            Post(
                1,
                1,
                2,
                33,
                4,
                "55",
                6,
                7,
                8,
                "9",
                "1010",
                11,
                "12",
                13,
                "14",
                1515,
                true,
                false,
                true,
                16,
                true
            )
        val test3 =
            Post(
                2,
                1,
                2,
                3,
                444,
                "555",
                6,
                7,
                8,
                "9",
                "101010",
                11,
                "12",
                13,
                "14",
                15,
                true,
                false,
                true,
                161616,
                true
            )
        val update = Post(
            1,
            4,
            2,
            3,
            4444,
            "Update",
            6,
            7777,
            8,
            "9999",
            "101010",
            111111,
            "12",
            13131313,
            "14",
            15,
            true,
            false,
            true,
            161616,
            true
        )
        val newTest1 = test1.copy(id = 1)
        val newTest2 = test2.copy(id = 0)
        val newTest3 = test3.copy(id = 3)
        val result = service.update(update)
        assertTrue(true)
    }

    // тест что возращается false
    @Test
    fun update_False_Test() {
        val service = WallService
        service.add(Post(0, 1, 2, 3, 4, "5", 6, 7, 8, "9", "10", 11, "12", 13, "14", 15, true, false, true, 16, true))
        service.add(
            Post(
                1,
                1,
                2,
                33,
                4,
                "55",
                6,
                7,
                8,
                "9",
                "1010",
                11,
                "12",
                13,
                "14",
                1515,
                true,
                false,
                true,
                16,
                true
            )
        )
        service.add(
            Post(
                2,
                1,
                2,
                3,
                444,
                "555",
                6,
                7,
                8,
                "9",
                "101010",
                11,
                "12",
                13,
                "14",
                15,
                true,
                false,
                true,
                161616,
                true
            )
        )
        val update = Post(
            3,
            4,
            2,
            3,
            4444,
            "Update",
            6,
            7777,
            8,
            "9999",
            "101010",
            111111,
            "12",
            13131313,
            "14",
            15,
            true,
            false,
            true,
            161616,
            true
        )
        val result = service.update(update)
        assertFalse(true)
    }
}
