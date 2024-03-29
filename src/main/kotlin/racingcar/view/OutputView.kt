package racingcar.view

class OutputView(){

    fun printCarMove(name: String, position: Int){
        println("$name : ${"-".repeat(position)}")
    }
    fun printWinnersName(winners: List<String>){
        println("\n최종 우승자 : ${winners.joinToString(",")}")
    }
}