import kotlin.math.max

const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2

fun commissn(typeCard: String, transfer: Int, previous: Int): Int {
    val monthlyLimit = 600_000
    val dayLimit = 150_000
    val minVisaCommissn = 35
    val percentVisaCommissn = 0.0075
    val visaCommissn = max(minVisaCommissn, (transfer * percentVisaCommissn).toInt())
    val freePayMastercard = 75_000
    val percentMastercardCommissn = 0.0006
    val masterCardCommissn = when {
        previous + transfer < freePayMastercard -> 0
        previous > freePayMastercard -> (transfer * percentMastercardCommissn).toInt()
        previous + transfer > freePayMastercard -> ((previous + transfer) * percentMastercardCommissn).toInt()
        else -> ERROR_LIMIT
    }
    val mirCommissn = 0

    if (transfer > dayLimit || (transfer + previous) > monthlyLimit) return ERROR_LIMIT

    return when (typeCard) {
        "Visa" -> visaCommissn
        "Mastercard" -> masterCardCommissn
        "Mir" -> mirCommissn
        else -> ERROR_TYPE
    }
}