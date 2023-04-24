package racing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class WinnersTest {

    @Test
    void 우승자_한명_찾기() {
        List<Car> cars = Arrays.asList(
                    new Car("pobi", 3), 
                    new Car("crong", 2),
                    new Car("honi", 1) );
        
        List<Car> winners = Winners.findWinners(cars);
        assertEquals(new Car("pobi", 3), winners.get(0));
    }
    
    @Test
    void 우승자_여려명_찾기() {
        List<Car> cars = Arrays.asList(
                    new Car("pobi", 3), 
                    new Car("crong", 2),
                    new Car("honi", 3) );
        
        List<Car> winners = Winners.findWinners(cars);
        assertThat(winners)
                .contains(new Car("pobi", 3),new Car("honi", 3))
                .doesNotContain(new Car("crong", 2));
    }
}
