fun numberNames (n : Int): String {
    val units = arrayOf("zero", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine")
    val tens = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "seventeen", "eighteen", "nineteen")

    val unit = n % 10     // units digit
    val ten = n / 10      // tens digit

    return when (ten) {
        0 -> {
            units[unit]
        }
        1 -> {
            tens[unit]
        }
        2 -> {
            if (unit == 0) "twenty"
            else "twenty ${units[unit]}"
        }
        else -> ""
    }
}