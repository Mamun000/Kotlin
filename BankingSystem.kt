fun main(){
    print("Enter the amount to add: ")
    var amount = readLine()!!.toInt()

    do {
        print("Enter the amount to withdraw: ")
        val withdraw = readLine()!!.toInt()
        if (amount < withdraw) {
            println("Insufficient funds")
        } else {
            amount -= withdraw
            println("You have successfully withdrawn $withdraw. Remaining balance: $amount")
        }
        print("Do you want to withdraw more (yes/no)? ")
        var x = readln()
    }while (x.equals("yes",ignoreCase=true))
}
