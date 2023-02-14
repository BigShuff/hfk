import kotlin.system.exitProcess
fun main(){
    
    var retAnswer = rpsQuestion()
    println("you entered $retAnswer")
    playGame(retAnswer)
}

fun rpsQuestion():String{
    println("Do you want to play Rock, paper, scissors with me?")
    println("Enter y or n ")
    var answer = readln()
    if (answer == "n"){
        println("See ya later!")
        exitProcess(0)
    } else
    return answer
}

fun playGame(retAnswer: String){
    var output = retAnswer
    println("$output")
    val optionsArray = arrayOf("Rock", "Paper", "Scissors") 
    // create random number
   val randomInt = (0..2).random()
   println("random number is $randomInt")
   println("I have chosen ${optionsArray[randomInt]}")
}