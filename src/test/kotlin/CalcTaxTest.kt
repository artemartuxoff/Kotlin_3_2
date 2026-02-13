import org.junit.Assert.*
import org.junit.Test

class CalcTaxTest {

    @Test
    fun calcTax() {
        var preSum = 0
        var sum = 150_000
        var typeCard = "Mastercard"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(470, result)

    }

    @Test
    fun calcTaxMir() {
        var preSum = 0
        var sum = 150_000
        var typeCard = "Mir"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(0, result)

    }

    @Test
    fun calcTaxVisa() {
        var preSum = 0
        var sum = 150_000
        var typeCard = "Visa"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(1125, result)

    }

    @Test
    fun calcTaxPre() {
        var preSum = 75_000
        var sum = 150_000
        var typeCard = "Mastercard"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(920, result)

    }

    @Test
    fun calcTaxMirpre() {
        var preSum = 75_000
        var sum = 150_000
        var typeCard = "Mir"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(0, result)

    }

    @Test
    fun calcTaxVisapre() {
        var preSum = 75_000
        var sum = 150_000
        var typeCard = "Visa"

        val result = calcTax(typeCard, preSum, sum)

        assertEquals(1125, result)

    }

    @Test
    fun limitTransfer(){

        var preSum = 75_000
        var sum = 150_000

        val result = limitTransfer(preSum, sum)

        assertEquals(false,result)
    }

}