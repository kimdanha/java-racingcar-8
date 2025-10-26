package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {

    @Test
    void 전체_자동차_이동_테스트() {
        Race race = new Race(List.of(new Car("pobi"), new Car("woni")));
        race.moveAll(5);
        assertThat(race.getCars().get(0).getLocation()).isEqualTo(1);
        assertThat(race.getCars().get(1).getLocation()).isEqualTo(1);
    }

    @Test
    void 우승자_판별_테스트() {
        Car pobi = new Car("pobi");
        Car woni = new Car("woni");
        pobi.move(5);
        Race race = new Race(List.of(pobi, woni));
        List<String> winners = race.findWinners();
        assertThat(winners).containsExactly("pobi");
    }
}
