fun agoToText(second: Int) {
    val minute = 60
    val hour = 3600
    val days = 86400

    val resultTime = when {
        second < minute -> "был(а) только что"
        second < hour -> "«был(а) ${second / minute} ${showMinuteText(second)} назад»"
        second < days -> "«был(а) ${second / hour} ${showHoursText(second)} назад»"
        second < days * 2 -> "«был(а) вчера»"
        second < days * 3 -> "«был(а) позавчера»"
        else -> "«был(а) давно»"

    }
    println(resultTime)
}

fun showMinuteText(second: Int): String = when (second / 60) {
    in 11..14 -> "минут"
    else -> when ((second / 60) % 10) {
        1 -> "минуту"
        in 2..4 -> "минуты"
        else -> "минут"
    }

}

fun showHoursText(second: Int): String = when (second / 3600) {
    1, 21 -> "час"
    in 5..20 -> "часов"
    else -> "часа"
}



