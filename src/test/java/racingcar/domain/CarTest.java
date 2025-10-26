package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void 이동_성공_테스트() {
        Car car = new Car("pobi");
        car.move(4);
        assertThat(car.getLocation()).isEqualTo(1);
    }

    @Test
    void 이동_실패_테스트() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getLocation()).isEqualTo(0);
    }

    @Test
    void 이름_길이_예외_테스트() {
        assertThatThrownBy(() -> new Car("longname"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 1~5자 이내여야 합니다.");
    }
}
