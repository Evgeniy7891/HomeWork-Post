import org.jetbrains.annotations.NotNull
import org.junit.Test
import org.junit.Assert.*


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
    fun updateTrueTest() {
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
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = service.update(update)
        assertTrue(result)
    }

    // тест что возращается false
    @Test
    fun updateFalseTest() {
        val service = WallService
        val test1 = Post(
            1,
            12345689,
            12345689,
            111111,
            1460041200,
            "Текст поста",
            6,
            7,
            8,
            "9",
            "10",
            11,
            "12",
            13,
            "14",
            15,
            true,
            false,
            true,
            16,
            true
        )
        val test2 =
            Post(
                2,
                12345665,
                12345665,
                111111,
                1460041200,
                "Текст поста",
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
                789,
                12345670,
                12345555,
                111111,
                1460041200,
                "Текст поста",
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
            256,
            99999999,
            99999999,
            99999999,
            1460041200,
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
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentThrowException() {
        val postTest = Post(1, 1, 1, 1, 1, "!", 1, 1, 1, "1", "1", 1, "1", 1, "1", 1, true, true, false, 1, false)
        val testComment = Comment(33, 33, 33, "Not")
        WallService.add(postTest)
        WallService.createComment(testComment)
    }

    @Test
    fun createCommentTest() {
        val postTest = Post(1, 1, 1, 1, 1, "!", 1, 1, 1, "1", "1", 1, "1", 1, "1", 1, true, true, false, 1, false)
        val testComment = Comment(1, 1, 1, "Yes")
        WallService.add(postTest)
        val result = WallService.createComment(testComment)
        assertTrue(result)
    }

    @Test(expected = ErrorCommentException::class)
    fun createComplaintReasonTest() {
        val postTest = Post(1, 1, 1, 1, 1, "!", 1, 1, 1, "1", "1", 1, "1", 1, "1", 1, true, true, false, 1, false)
        val testComment = Comment(1, 1, 1, "Yes")
        WallService.add(postTest)
        WallService.createComment(testComment)
        val complaintTest = ComplaintComment(1, 2, 9)
        WallService.createComplaint(complaintTest)
    }

    @Test(expected = ErrorCommentException::class)
    fun createComplaintCommentTest() {
        val postTest = Post(1, 1, 1, 1, 1, "!", 1, 1, 1, "1", "1", 1, "1", 1, "1", 1, true, true, false, 1, false)
        val testComment = Comment(1, 1, 1, "Yes")
        WallService.add(postTest)
        WallService.createComment(testComment)
        val complaintTest = ComplaintComment(66, 2, 5)
        WallService.createComplaint(complaintTest)
    }

    @Test
    fun createComplaintTest() {
        val postTest = Post(1, 1, 1, 1, 1, "!", 1, 1, 1, "1", "1", 1, "1", 1, "1", 1, true, true, false, 1, false)
        val testComment = Comment(1, 1, 1, "Yes")
        WallService.add(postTest)
        WallService.createComment(testComment)
        val complaintTest = ComplaintComment(1, 2, 5)
        val result = WallService.createComplaint(complaintTest)
        assertEquals("Жалоба по причине - Оскорбление", result)
    }
}