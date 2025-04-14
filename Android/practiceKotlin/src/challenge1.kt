class UserAccount ( var accountName: String ) {

    private var balance: Int = 0
    private var transactions: MutableList<Int> = mutableListOf <Int>()

    fun deposit ( amount: Int ) {

        if ( amount <= 0 )
            println( "Amount should be greater than ${0}" )

        balance = balance + amount
        transactions.add ( amount )

        println( "Deposited || Balance is ${this.balance}" )

    }

    fun withdraw ( amount: Int ) {

        if ( amount <= 0 )
            println( "Amount should be greater than ${0}" )

        transactions.add ( -amount  )
        balance = balance - amount

        println ( "Withdraw || Balance ${balance} " )

    }

    fun transactionsList () {

        println( transactions )

    }

}

fun main(){

    var user1: UserAccount = UserAccount ( "Shashank" )
    var user2: UserAccount = UserAccount ( "Sharvary" )

    user1.deposit( 1000 )
    user1.deposit( 2000 )
    user1.deposit( 6000 )
    user1.deposit( 1000 )

    user1.withdraw( 2000 )
    user1.deposit( 2000 )

    user1.transactionsList()

}