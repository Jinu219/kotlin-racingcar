package racingcar

import racingcar.domain.GameController
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    GameController(InputView(), OutputView()).start()
}