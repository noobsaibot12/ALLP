open class Vehicle ( val name: String , val color: String ) {

    open fun start() {

        println ( "${name} is starting!!" )

    }

    open fun stop () {

        println ( "${name} is stopped" )

    }

    open fun info () {

        println ( "Name :- ${name}" )
        println ( "Color :- ${color}" )

    }

}

class Bike ( name: String , color: String , val engine: Int , val doors: Int ) : Vehicle ( name , color ) {

    override fun info() {

        println ( "Name :- ${name}" )
        println ( "Color :- ${color}" )
        println ( "Engine :- ${engine}" )
        println ( "Doors :- ${doors}" )

    }

}

class Plane ( name: String , color: String , val engine: Int , val doors: Int ) : Vehicle ( name , color ) {

    override fun info() {

        println ( "Name :- ${name}" )
        println ( "Color :- ${color}" )
        println ( "Engine :- ${engine}" )
        println ( "Doors :- ${doors}" )

    }

}

open class Fruits ( protected val name: String) {

    open fun print () {}

}

class Apple ( name: String ) : Fruits ( name ) {

    override fun print () = println ( "This is $name Apple" )

}

class Finder ( private val list: List < String > ) {

    fun findItem ( element: String , foundItem: ( element: String? ) -> Unit ) {

        val itemFoundList = list.filter {

            it == element

        }

        if ( itemFoundList.isNullOrEmpty() ) foundItem ( null )
        else foundItem ( itemFoundList.first() )

    }

}

fun main () {

//    val splender: Bike = Bike ( "Splender" , "Orange and Black" , 1 , 0 )
//    val boeing: Plane = Plane ( "Boeing" , "White" , 4 , 2 )
//
//    splender.start()
//    splender.stop()
//    splender.info()
//
//    boeing.start()
//    boeing.stop()
//    boeing.info()

//    val newlist = mutableListOf< String >()
//    newlist.add( "Heyy" )
//    newlist.add( "There" )
//    newlist.add( 1 , "Here" )
//
//    println( newlist )

    val apple: Apple = Apple( "green" )
    apple.print()

}