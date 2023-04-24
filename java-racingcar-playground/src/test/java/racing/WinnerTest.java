package racing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WinnerTest {
    
    @Test
    void 단독_우승자_찾기() {
        List<Car> cars = Arrays.asList(
                         new Car("pobi", 3),
                         new Car("crong", 2),
                         new Car("honi", 1));
        
        List<Car> winners = Winners.findWinners(cars);
        assertThat(winners)
                .contains(new Car("pobi", 3))
                .doesNotContain(new Car("crong", 2), new Car("honi", 1));
    }
    
    @Test
    void 공동_우승자_찾기() {
        List<Car> cars = Arrays.asList(
                         new Car("pobi", 3),
                         new Car("crong", 2),
                         new Car("honi", 3));
        
        List<Car> winners = Winners.findWinners(cars);
        assertThat(winners)
                .contains(new Car("pobi", 3), new Car("honi", 3))
                .doesNotContain(new Car("crong", 2) );
    }
}
