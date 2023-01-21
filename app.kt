fun main(){
    val x = 3
    val y = 1
    /* if (x > y){
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    } */

    // New more concise way of the same above

    println(if( x > y) "x is greater than y" else "x is not greater than y")
    println("This line runs no matter what")
}