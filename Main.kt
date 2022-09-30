import java.util.Calendar

fun main() {
    val calendar = Calendar.getInstance()
    if(calendar.firstDayOfWeek==Calendar.SUNDAY){
        calendar.firstDayOfWeek=Calendar.MONDAY
    }
    if(!calendar.isLenient) {
        calendar.isLenient = true
    }
    println(calendar)
}