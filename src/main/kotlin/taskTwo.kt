import kotlin.math.max
const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2
fun commissn (typeCard : String, transfer : Int, previous : Int): Int {
    if (transfer > 150_000 || (transfer + previous) > 600_000) return ERROR_LIMIT

   return when (typeCard) {
        "Visa" -> max(35, (transfer * 0.0075).toInt())
        "Mastercard" -> if ((previous + transfer) < 75_000) return 0 else return (transfer * 0.0006).toInt()
        "Mir" -> 0
        else -> ERROR_TYPE
    }
}