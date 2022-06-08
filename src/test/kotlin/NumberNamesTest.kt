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
}
