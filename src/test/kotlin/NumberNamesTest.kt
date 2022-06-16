import kotlin.test.Test
import kotlin.test.assertEquals

class NumberNamesTest {
    @Test
    fun `testa 1`() {
        assertEquals("one", numberNames(1))
    }
    @Test
    fun `testa 2`() {
        assertEquals("two", numberNames(2))
    }
    @Test
    fun `testa 3`() {
        assertEquals("three", numberNames(3))
    }
    @Test
    fun `testa 4`() {
        assertEquals("four", numberNames(4))
    }
    @Test
    fun `testa 5`() {
        assertEquals("five", numberNames(5))
    }
    @Test
    fun `testa 10`() {
        assertEquals("ten", numberNames(10))
    }
    @Test
    fun `testa 11`() {
        assertEquals("eleven", numberNames(11))
    }
    @Test
    fun `testa 20`() {
        assertEquals("twenty", numberNames(20))
    }
    @Test
    fun `testa 21`() {
        assertEquals("twenty one", numberNames(21))
    }
    @Test
    fun `testa 30`() {
        assertEquals("thirty", numberNames(30))
    }
    @Test
    fun `testa 31`() {
        assertEquals("thirty one", numberNames(31))
    }
    @Test
    fun `testa 100`() {
        assertEquals("one hundred", numberNames(100))
    }
    @Test
    fun `testa 200`() {
        assertEquals("two hundred", numberNames(200))
    }
    @Test
    fun `testa 101`() {
        assertEquals("one hundred and one", numberNames(101))
    }
    @Test
    fun `testa 102`() {
        assertEquals("one hundred and two", numberNames(102))
    }
    @Test
    fun `testa 110`() {
        assertEquals("one hundred and ten", numberNames(110))
    }
    @Test
    fun `testa 111`() {
        assertEquals("one hundred and eleven", numberNames(111))
    }
    @Test
    fun `testa 121` () {
        assertEquals("one hundred and twenty one", numberNames(121))
    }
    @Test
    fun `testa 8` () {
        assertEquals("eight", numberNames(8))
    }
    @Test
    fun `testa 17` () {
        assertEquals("seventeen", numberNames(17))
    }
    @Test
    fun `testa 36` () {
        assertEquals("thirty six", numberNames(36))
    }
    @Test
    fun `testa 440` () {
        assertEquals("four hundred and forty", numberNames(440))
    }
    @Test
    fun `testa 999` () {
        assertEquals("nine hundred and ninety nine", numberNames(999))
    }
}
