fun numberNames(n: Int): String {
    val units = arrayOf(
        "zero", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine"
    )
    val teens = arrayOf(
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "seventeen", "eighteen", "nineteen"
    )
    val tens = arrayOf(
        "zero", "ten", "twenty", "thirty", "forty", "fifhty",
        "sixty", "seventy", "eighty", "ninety"
    )

    val unit = n % 10         // units digit
    val ten = n / 10          // tens digit
    val hundred = n / 100     // hundred digit

    return if (hundred > 0)             // round hundreds
        "${units[hundred]} hundred${if (unit==1) " and one" else ""}"
    else if (unit == 0)                 // round tens
        tens[ten]
    else if (ten == 0)                  // units
        units[unit]
    else if (ten == 1)                  // numbers between 11-19
        teens[unit]
    else                                // numbers from 21 to 99
        "${tens[ten]} ${units[unit]}"
}