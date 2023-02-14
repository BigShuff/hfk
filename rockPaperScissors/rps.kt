import kotlin.system.exitProcess
fun main(){
    var retAnswer = rpsQuestion()
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
    //var output = retAnswer
    // println("$retAnswer")
    val optionsArray = arrayOf("Rock", "Paper", "Scissors") 
    val randomInt = (0..2).random()
   println("I have chosen now it's your turn. Do you want 'rock', 'paper' or 'scissors'")
   println("Enter r, p or s")
   var selection = readln()
   if (selection == "r") {
    selection = "rock"
   } else if (selection == "p"){
    selection = "paper"
   } else if (selection == "s"){
    selection = "scissors"
   } else{
    println("Sorry unrecognised input")
   }
   println("You chose $selection and I chose ${optionsArray[randomInt]}")
}