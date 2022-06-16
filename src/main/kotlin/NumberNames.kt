class NumberNames {
    /* lists of 'atomic' names */
    private val units = listOf(
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    )
    private val teens = listOf(
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "sixteen", "seventeen", "eighteen", "nineteen"
    )
    private val tens = listOf(
        "zero", "ten", "twenty", "thirty", "forty",
        "fifhty", "sixty", "seventy", "eighty", "ninety"
    )

    private fun nameUnits(n: Int): String {
        val unitsDigit = n % 10
        val tensDigit = (n % 100) / 10

        return if ((unitsDigit != 0 || n == 0) && tensDigit != 1)
            units[unitsDigit]
        else ""
    }

    private fun nameTens(n: Int): String {
        val unitsDigit = n % 10

        return when (val tensDigit = (n % 100) / 10) {
            0 -> ""
            1 -> teens[unitsDigit]
            else -> {
                tens[tensDigit] +
                        if (unitsDigit != 0) " "
                        else ""
            }
        }
    }

    private fun nameHundreds(n: Int): String {
        val hundredsDigit = n / 100

        return if (hundredsDigit == 0) ""
        else
            units[hundredsDigit] + " hundred" +
                    (if (n % 100 != 0) " and " else "")
    }

    fun numberNames(n: Int): String {
        return nameHundreds(n) + nameTens(n) + nameUnits(n)
    }
}