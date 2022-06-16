import kotlin.test.Test
import kotlin.test.assertEquals

class NumberNamesTest {
    private val testNames: NumberNames = NumberNames()

    @Test
    fun `testa 1`() {
        assertEquals("one", testNames.numberNames(1))
    }
    @Test
    fun `testa 2`() {
        assertEquals("two", testNames.numberNames(2))
    }
    @Test
    fun `testa 3`() {
        assertEquals("three", testNames.numberNames(3))
    }
    @Test
    fun `testa 4`() {
        assertEquals("four", testNames.numberNames(4))
    }
    @Test
    fun `testa 5`() {
        assertEquals("five", testNames.numberNames(5))
    }
    @Test
    fun `testa 10`() {
        assertEquals("ten", testNames.numberNames(10))
    }
    @Test
    fun `testa 11`() {
        assertEquals("eleven", testNames.numberNames(11))
    }
    @Test
    fun `testa 20`() {
        assertEquals("twenty", testNames.numberNames(20))
    }
    @Test
    fun `testa 21`() {
        assertEquals("twenty one", testNames.numberNames(21))
    }
    @Test
    fun `testa 30`() {
        assertEquals("thirty", testNames.numberNames(30))
    }
    @Test
    fun `testa 31`() {
        assertEquals("thirty one", testNames.numberNames(31))
    }
    @Test
    fun `testa 100`() {
        assertEquals("one hundred", testNames.numberNames(100))
    }
    @Test
    fun `testa 200`() {
        assertEquals("two hundred", testNames.numberNames(200))
    }
    @Test
    fun `testa 101`() {
        assertEquals("one hundred and one", testNames.numberNames(101))
    }
    @Test
    fun `testa 102`() {
        assertEquals("one hundred and two", testNames.numberNames(102))
    }
    @Test
    fun `testa 110`() {
        assertEquals("one hundred and ten", testNames.numberNames(110))
    }
    @Test
    fun `testa 111`() {
        assertEquals("one hundred and eleven", testNames.numberNames(111))
    }
    @Test
    fun `testa 121` () {
        assertEquals("one hundred and twenty one", testNames.numberNames(121))
    }
    @Test
    fun `testa 8` () {
        assertEquals("eight", testNames.numberNames(8))
    }
    @Test
    fun `testa 17` () {
        assertEquals("seventeen", testNames.numberNames(17))
    }
    @Test
    fun `testa 36` () {
        assertEquals("thirty six", testNames.numberNames(36))
    }
    @Test
    fun `testa 440` () {
        assertEquals("four hundred and forty", testNames.numberNames(440))
    }
    @Test
    fun `testa 999` () {
        assertEquals("nine hundred and ninety nine", testNames.numberNames(999))
    }
}
