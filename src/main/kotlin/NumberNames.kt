fun numberNames (n : Int): String {
    val units = arrayOf("zero", "one", "two", "three",
        "four", "five", "six", "seven", "eight", "nine")
    val dozens = arrayOf("ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifhteen", "seventeen", "eighteen", "nineteen")
    return if (n < 10) units[n]
    else dozens[n%10]
}
