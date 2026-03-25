/*
else..if -test another condition
 if (condition){
    //block of code to be executed if condition1 is true
    }else if(condition2) {
    //block of code to be executed if condition is true
    }else{
    //block of code to be executed if all conditions are false
    }
     */
fun main(){
    print("Enter marks to print grades :")
    var marks = readln(). toIntOrNull() ?:0
    if(marks in 90..100){
        println("GRADE: A")
    }else if(marks>=80){
        println("GRADE:B")
    }else if(marks>=70) {
        println("GRADE:C")
    }else if(marks>=60){
        println("GRADE:D")
    }else{
        println("FAIL")
    }




}