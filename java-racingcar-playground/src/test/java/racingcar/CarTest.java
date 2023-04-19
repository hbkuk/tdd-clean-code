package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("생성자를 통해서 멤버 변수에 이름이 제대로 할당되는지 확인")
    void car생성_이름확인() {
        String carName = "pobi";
        Car car = new Car(carName);
        assertThat(car.getName()).isEqualTo(carName);
    }
    
    @Test
    @DisplayName("5글자를 초과해서 이름으로 입력했을 때 Exception이 발생하는 확인")
    void carName_5글자_이상() {
        String carName = "pobipo";
        assertThatExceptionOfType(InvalidCarNameException.class)
                .isThrownBy(() -> {Car car = new Car(carName);});
    }
}
