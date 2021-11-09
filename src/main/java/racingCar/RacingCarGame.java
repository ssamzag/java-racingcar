package racingCar;

import racingCar.ui.InputView;
import racingCar.ui.ResultView;
import racingCar.utils.NumberUtils;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGame {
    private int carNumbers;
    private int tryTimes;
    private List<Car> raceCar = new ArrayList<Car>();

    RacingCarGame() {
        InputView inputView = new InputView();
        carNumbers = inputView.inputCarNumbers();
        tryTimes = inputView.inputTryTimes();
    }

    RacingCarGame(int carNumbers, int tryTimes) {
        this.carNumbers = carNumbers;
        this.tryTimes = tryTimes;
    }

    public void play() {
        setRaceCar();
        playRace();
    }

    private void playRace() {
        ResultView resultView = new ResultView();
        for (int i = 0; i < tryTimes; i++) {
            resultView.printCarRace(raceCar);
        }
    }

    public List<Car> setRaceCar() {
        raceCar = new ArrayList<Car>();
        for (int i = 0; i < carNumbers; i++) {
            raceCar.add(new Car());
        }

        return raceCar;
    }
}
