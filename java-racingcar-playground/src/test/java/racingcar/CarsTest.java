package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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
    
    @Test
    void Cars_생성_문자열_쉼표로_구분해서_전달() {
        String names = "pobi,crong,honi";
        Cars newCars = new Cars(CarsGenerateUtils.toList(names));
        assertThat( newCars.getCars().size() ).isEqualTo(3);
        assertThat( newCars.getCars().get(0).getName() ).isEqualTo("pobi");
        assertThat( newCars.getCars().get(1).getName() ).isEqualTo("crong");
        assertThat( newCars.getCars().get(2).getName() ).isEqualTo("honi");
    }
    
    @Test
    void Cars_생성_문자열_쉼표로_구분하지_않고_전달() {
        String names = "pobi:crong:honi";
        assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy( () -> {new Cars(CarsGenerateUtils.toList(names));})
        .withMessageMatching("구분자로 이름을 나누어서 입력해야 합니다.");
    }
}
