fun main() {
    //when expression-checks a value or condition and runs the matching code

    //a program that asks the user for number then displays the day of the week
    print("enter a number to display the day of the week: ")
    var num=readLine()?.toIntOrNull()
    when(num){
        1 ->println("today is Monday")
        2 ->println("today is Tuesday")
        3 ->println("today is Wednesday")
        4 ->println("today is Thursday")
        5 ->println("today is Friday")
        6 ->println("today is Saturday")
        7 ->println("today is Sunday")
        else ->println("Invalid day")

    }

    //a program that asks user for marks, then prints grade
    print("enter marks to print grade: ")
    var marks=readln().toIntOrNull()?:0
    when{
        marks in 90..100 ->println("GRADE: A")
        marks>=80 ->println("GRADE: B")
        marks>=70 ->println("GRADE: C")
        marks>=60 ->println("GRADE: D")
        else ->println("FAIL")
    }


}