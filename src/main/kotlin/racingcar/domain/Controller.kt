package racingcar

import racingcar.view.InputView
import racingcar.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun start() {
//        val names: List<String> = inputNames()
        val cars = createCars()
        val repeatInput = roundCount()
        game(repeatInput, cars)
        val winners = Jugdement().winner(cars)
        outputView.printWinnersName(winners.map {car -> car.name})

    }

    private fun createCars(): List<Car> {
        val names = inputView.inputCarNames()
        return names.map { name -> Car(name) }
    }

    private fun roundCount(): Int {
        val repeatInput = inputView.inputRoundCount()
        return repeatInput
    }

fun game(repeatInput: Int, cars: List<Car>) {
    for (round in 1..repeatInput) {
        println("  ")
        round(cars)
    }
}

    private fun round(cars: List<Car>) {
//        for (car in cars) {
//            car.move()
//            print("${car.name} : ")
//            repeat(car.position) {
//                print("-")
//            }
//            println("")
//        }
        cars.forEach { car ->
            car.move()
            outputView.printCarMove(car.name, car.position)
        }
    }
    return cars
}

fun inputNames(): List<String> {
    // 자동차 이름을 입력해서 자동차의 개수를 정해주기
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input: String = readln()
    val names: List<String> = input.split(",")
    return names
}

fun roundCount(): Int {
    // 시도하는 횟수를 받아내기
    println("시도할 횟수는 몇 회인가요?")
    val repeatInput: Int = readln().toInt()
    return repeatInput
}

fun winner(cars: List<Car>) {
    val maxPosition = cars.maxOf { it.position }
    val answer = mutableListOf<String>()
    comparePosition(cars, maxPosition, answer)
    print("\n최종 우승자 : ")
    println(answer.joinToString(","))
}

fun comparePosition(cars:List<Car>, maxPosition:Int, answer:MutableList<String>): List<String> {
    for (i in 0..<cars.size) {
        if (cars[i].position == maxPosition) {
            answer.add(cars[i].name)
        }
    }
    return answer
}