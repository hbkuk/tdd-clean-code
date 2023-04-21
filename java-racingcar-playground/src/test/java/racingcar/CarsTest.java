package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    void Cars_생성_Car_리스트로_전달() {
        Cars newCars = new Cars(Arrays.asList("pobi","crong","honi"));
        assertThat( newCars.getCars().size() ).isEqualTo(3);
        assertThat( newCars.getCars().get(0).getName() ).isEqualTo("pobi");
        assertThat( newCars.getCars().get(1).getName() ).isEqualTo("crong");
        assertThat( newCars.getCars().get(2).getName() ).isEqualTo("honi");
    }

}
