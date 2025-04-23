fun agoToText(second: Int) {
    val minutes = 60
    val hours =  3600
    val days =  86400

    val resultTime = when{
        second < minutes -> "был(а) только что"
        second <  hours-> "«был(а) ${second/minutes} минут назад»"
        second < days -> "«был(а) ${second/hours} часов назад»"
        second < days*2 -> "«был(а) вчера»"
        second < days*3 -> "«был(а) позавчера»"
        else -> "«был(а) давно»"

    }
println(resultTime)
}


