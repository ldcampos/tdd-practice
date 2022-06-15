fun numberNames(n: Int): String {
    val units = listOf(
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    )
    val teens = listOf(
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "seventeen", "eighteen", "nineteen"
    )
    val tens = listOf(
        "zero", "ten", "twenty", "thirty", "forty",
        "fifhty", "sixty", "seventy", "eighty", "ninety"
    )

    val unit = n % 10         // units digit
    val ten = n / 10          // tens digit
    val hundred = n / 100     // hundred digit

    return if (ten == 0)                             // n < 10
        units[unit]
    else if (ten == 1)                               // 10 < n <= 19
        teens[unit]
    else if (ten <= 9)                               // 20 <= n < 100
        tens[ten] +
                if (unit > 0) " ${units[unit]}"
                else ""
    else                                             // n >= 100
        units[hundred] + " hundred" +
                if (unit > 0)
                    if (ten%10 == 0) " and ${units[unit]}"
                    else " and ${teens[unit]}"
                else if (ten%10 > 0) " and ${tens[ten%10]}"
                else ""
}