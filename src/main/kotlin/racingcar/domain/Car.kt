package racingcar.domain

class Car(val name: String) {
    var position = 0

    init {
        if (name.length > MAX_NAME_LENGTH) throw IllegalArgumentException()
    }

    // 자동차 끼리의 위치를 정해주는 변수 position
    fun move() {
        // 임의의 값을 받아서 조건에 맞게 이동하는 함수 만들기
        // import random -> (0..9).random()
        val randomValue = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        // randomValue 변수를 만들어서 임의의 0~9까지 임의의 정수를 받음
        if (randomValue >= RANDOM_CONDITION) {
            // 임의의 숫자가 4를 넘을때에 위치 한칸을 이동하는 시스템
            position++
        }
    }

    companion object {
        private const val MAX_NAME_LENGTH = 5
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_RANDOM_NUMBER = 9
        private const val RANDOM_CONDITION = 4
    }
}
