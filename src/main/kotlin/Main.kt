fun main(args: Array<String>) {

    //№1
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " " + lastName)
    }
    printFullName("Stas", "Kilin")

    //№2
    val firstName = "Stas"
    val lastName = "Kilin"
    printFullName(firstName, lastName)

    //№3
    fun calculateFullName(firstName:String, lastName:String): String {
        return "$firstName $lastName"
    }
    val myName:String = calculateFullName(firstName,lastName)

    //№4
    fun calculateFullNameAndLengthName (firstName:String, lastName:String): Pair<String,Int> {
        return Pair("$firstName $lastName", (firstName+lastName).length)
    }
    println(calculateFullNameAndLengthName(firstName, lastName))

    //№5
    fun isPrime(number: Int): Boolean {
        if (number <= 1){
            return false
        }
        for (i in 2..<number){
            if (number % i == 0){
                return false
            }
        }
        return true
    }
    println(isPrime(7))

}