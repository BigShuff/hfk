import kotlin.system.exitProcess

fun main() {
    var retAnswer = rpsQuestion()
    if (retAnswer == "y") {
        playGame()
    } else {
        println("unrecognised answer")
        rpsQuestion()
    }
}

fun rpsQuestion(): String {
    println("Do you want to play Rock, paper, scissors with me?")
    println("Enter y or n ")
    var answer = readln()
    if (answer == "n") {
        println("See ya later!")
        exitProcess(0)
    } else return answer
}

fun playGame() {
    val optionsArray = arrayOf("Rock", "Paper", "Scissors")
    val randomInt = (0..2).random()
    val computerSelection = optionsArray[randomInt]
    println("I have chosen now it's your turn. Do you want 'rock', 'paper' or 'scissors'")
    println("Enter r, p or s")
    var humanSelection = readln()
    if (humanSelection == "r") {
        if (computerSelection.equals(optionsArray[0])) {
            println("I chose rock and you chose rock it's a draw")
        }
        if (computerSelection.equals(optionsArray[1])) {
            println("I chose paper and you chose rock I WIN")
        }
        if (computerSelection.equals(optionsArray[2])) {
            println("I chose scissors and you chose rock YOU WIN! well done")
        }
    }

    if (humanSelection == "p") {
        if (computerSelection.equals(optionsArray[0])) {
            println("I chose rock and you chose paper YOU WIN well done!")
        }
        if (computerSelection.equals(optionsArray[1])) {
            println("I chose paper and you chose paper it's a draw")
        }
        if (computerSelection.equals(optionsArray[2])) {
            println("I chose scissors and you chose paper I WIN")
        }
    }

    if (humanSelection == "s") {
        if (computerSelection.equals(optionsArray[0])) {
            println("I chose rock and you chose scissors I WIN")
        }
        if (computerSelection.equals(optionsArray[1])) {
            println("I chose paper and you chose scissors YOU WIN Well done!")
        }
        if (computerSelection.equals(optionsArray[2])) {
            println("I chose scissors and you chose scissors it's a draw")
        }
    }
}
