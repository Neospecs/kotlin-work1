// Task 4.2: use of if and ranges

fun main() {
    print("PIZZA MENU (a) Margherita (b) Quattro Stagioni (c) Seafood (d) Hawaiian Choose your pizza (a-d):")
    val choice = readln()  //
    //val length = 
    if (choice.lowercase().toCharArray()[0] in 'a'..'d' && choice.length == 1) { 
        println("Order accepted")
}
else {
    println("Invalid choice!")
}

}

