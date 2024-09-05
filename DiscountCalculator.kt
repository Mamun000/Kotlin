fun main() {


    print("Enter the amount: ")
    val amount = readLine()!!.toInt()

    print("Do you have the membership (y/n)?: ")
    val hasMembership = readLine()

    if (amount >= 1000 && hasMembership == "y") {
        println("Congratulations... 20% discount")
        println("Final price is: ${amount*.8}")
    } else if (amount >= 1000 && hasMembership == "n") {
        println("Congratulations... 10% discount")
        println("Final price is: ${amount*.9}")
    } else {
        println("No discount available... Buy ${1000-amount} more to get more discount")
    }
}
