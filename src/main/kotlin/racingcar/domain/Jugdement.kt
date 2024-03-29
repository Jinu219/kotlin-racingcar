package racingcar.domain

class Jugdement {
    fun winner(cars:List<Car>): List<Car> {
        val maxPosition = cars.maxOf { it.position }
        return cars.filter{car -> car.position == maxPosition }
//        val answer = mutableListOf<String>()
//        for (i in 0..<cars.size) {
//            if (cars[i].position == maxPosition) {
//                answer.add(cars[i].name)
//            }
//        }
    }
}