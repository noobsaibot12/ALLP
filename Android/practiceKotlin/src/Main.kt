class User ( firstName: String = "User" , var lastName: String = "User" , age: Int = 0 ) {

//    constructor ( fName: String ): this( fName , "LastName" , 0 )   //SECONDARY CONSTRUCTOR
    //CALLED WHEN ONLY FIRST NAME IS PASSED TO CONSTRUCTOR

    var firstName: String
    var age: Int

    init {

        if ( firstName.lowercase().startsWith( 'a' )) {

            this.firstName = firstName

        } else {

            this.firstName = "User"
            println ( "User name ${firstName} do not starts wits a the new name is :- ${this.firstName}" )

        }

    }

    init {

        if ( age <= 50 ) {

            this.age = age
            println ( "Employee ${this.firstName} ${lastName} can work as his age is ${age}" )

        } else {

            this.age = age
            println ( "Employee is out of expiry cauze his age is ${age}" )

        }

    }

}

fun matrix () {
    var nums = mutableListOf<MutableList<Int>>()

    for (r in 1..3) {
        var n = mutableListOf<Int>() // Initialize as an empty mutable list

        for (c in 1..3) {

            println("Enter value for nums[${r - 1}][${c - 1}] :- ")
            val input = readln().toInt()
            n.add(input)

        }

        nums.add(n)
    }

    // Iterate over each list in nums and print each element
    for (row in nums) {
        for (element in row) {
            print("${element} ")
        }
        println()
    }
}

class Car ( var name: String , var color: String , var price: Int ) {

    init {
        println ( "$name car with $color color costs $price" )
    }

}

//fun main( arge: Array<String> ) {

//    val car1 = Car ( "Suzuki" , "White" , 700000 )
//    val car2 by lazy {
//        Car ( "Hundai" , "Grey" , 800000 )
//    }
//
//    val car3 = Car ( "Mahendra" , "Black" , 1000000 )
//    car1.price = 9000000
//    println ( car1.price )
//

    

//}


class Outer {

    var outerProperty: String = "This is outer class property!!"

    inner class Inner {

        fun accessouter(): String {

            return outerProperty

        }

    }

}

fun main() {
//    println("Start")
//    val myValue: String by lazy {
//        println("Initializing")
//        "Lazy Initialized Value"
//    }
//    println("After lazy declaration")
//    println(myValue)  // The initialization happens here
//    println(myValue)  // This time, it uses the already computed value

    var outer: Outer = Outer()
    var inner: Outer.Inner = outer.Inner()

    


}
