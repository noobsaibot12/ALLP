fun main () {

    val payment1: PaymentStatus.Success = PaymentStatus.Success ( "SUCCESS!!" , "TX001" , 10000 )
    val payment2: PaymentStatus.Failed = PaymentStatus.Failed ( "FAILED!!" , "F404" , "SORRY TRY AGAIN LATER!!" )
    val payment3: PaymentStatus.Pending = PaymentStatus.Pending ( "PENDING!!" )

    handlePaymentStatus ( payment1 )
    handlePaymentStatus ( payment2 )
    handlePaymentStatus ( payment3 )

}

fun handlePaymentStatus ( status: PaymentStatus ) {

    when ( status ) {
        is PaymentStatus.Failed -> {

            status.display()
            println ( "Error Code: ${status.errorCode}, Message: ${status.errorMessage}" )

        }
        is PaymentStatus.Pending -> {

            status.display()
            println ( "Please wait." )

        }
        is PaymentStatus.Success -> {

            status.display()
            println ( "Transaction ID: ${status.transactionId}, Amount: ${status.amount}" )

        }
    }

}

sealed class PaymentStatus ( val status: String ) {

    fun display () {

        println ( "Payment $status" )

    }

    class Success ( status: String , val transactionId: String , val amount: Int ) : PaymentStatus ( status )
    class Failed ( status: String , val errorCode: String , val errorMessage: String ) : PaymentStatus ( status )
    class Pending ( status: String ) : PaymentStatus( status )

}
