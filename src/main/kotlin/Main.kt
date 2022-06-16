fun main () {
    println("Type a number")
    val number : Int = readln().toInt()
    val numberName : String = NumberNames().numberNames(number)
    print("Number '$number' spelling is: ")
    println(numberName)
}