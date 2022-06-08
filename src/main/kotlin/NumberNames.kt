fun numberNames (n : Int): String {
    val units = arrayOf("zero", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine")
    val teens = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "seventeen", "eighteen", "nineteen")
    val tens = arrayOf("zero", "ten", "twenty", "thirty", "forty", "fifhty",
        "sixty", "seventy", "eighty", "ninety")

    val unit = n % 10     // units digit
    val ten = n / 10      // tens digit

    return when (ten) {
        0 -> {
            units[unit]
        }
        1 -> {
            teens[unit]
        }
        else -> {
            val tensName = tens[ten]

            if (unit>0) "$tensName ${units[unit]}"
            else tensName
        }
    }
}