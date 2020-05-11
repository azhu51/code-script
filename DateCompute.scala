
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class DateCompute(startDate: String, currentDate: String) {

  val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
  val oldDate: LocalDate = LocalDate.parse(startDate, formatter)
  val newDate = LocalDate.parse(currentDate, formatter)

  def date_plus(plus_days:Int) : String={
    oldDate.plusDays(plus_days).format(formatter)
  }

  def date_diff(): Long = {
    newDate.toEpochDay() - oldDate.toEpochDay()
  }
}



