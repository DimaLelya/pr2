import java.time.Month

fun main(args: Array<String>) {
    //pl1
    val age1:Int = 42
    val age2:Int = 21
    //pl2,3
    val avg1:Double
    avg1 = (age1.toDouble()+age2.toDouble())/2
    println(avg1)
    //pl4
    val firstName:String ="Dmitrii"
    val lastName:String ="Lelya"
    //pl5
    val fullName: String
    fullName = firstName + " " + lastName
    println(fullName)
    //pl6
    val myDetails:String = "Привет, меня зовут $fullName"
    println(myDetails)
    //pl7
    val data = Triple (29, 6, 2004)
    println(data)
    //pl8
    val day:Int = data.first
    val month:Int = data.second
    val year:Int = data.third
    println (day)
    println (month)
    println (year)
    //pl9
    val bigString = """
        | $month
        | $year
        """.trimMargin()
    println(bigString)





}