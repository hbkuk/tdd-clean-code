package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.Arrays;

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
    
    @Test
    @DisplayName("Car의 이름이 담긴 List를 전달했을때, Car 클래스를 생성하는지 확인")
    void cars_생성_확인() {
        Cars cars = new Cars(Arrays.asList("pobi", "crong", "huni"));
        assertThat(cars.getCars().size()).isEqualTo(3);
        assertThat(cars.getCars().get(0).getName()).isEqualTo("pobi");
    }
    
    @Test
    @DisplayName("Car의 이름을 쉼표로 구분해서 문자열로 전달했을 경우, Car 클래스가 생성되는지 확인")
    void cars_생성_확인_쉼표_구분() {
        Cars cars = new Cars(GenerateUtils.toList("pobi,crong,honux"));
        assertThat(cars.getCars().size()).isEqualTo(3);
    }
    
    @Test
    @DisplayName("Car의 이름을 쉼표로 구분하지 않았을 경우, RuntimeExcpetion이 발생하는지 확인, Message 확인")
    void cars_생성_확인_쉼표_구분하지_않음() {
        assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy(() -> { Cars cars = new Cars(GenerateUtils.toList("pobi:crong:honux"));})
        .withMessageMatching("구분자를 확인하세요");
    }
    
    @Test
    @DisplayName("Car의 이름을 쉼표로 구분, 5개 이하인 경우만 생성하는지 확인")
    void cars_생성_확인_쉼표_구분_5개_이하() {
        Cars cars = new Cars(GenerateUtils.toList("pobi,crong,honux,test1,test2"));
        assertThat(cars.getCars().size()).isEqualTo(5);
    }
    
    @Test
    @DisplayName("Car의 이름을 쉼표로 구분, 5개를 초과한 경우 RuntimeException 발생하는지 확인")
    void cars_생성_확인_쉼표_구분_5개_초과() {
        assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy(() -> {Cars cars = new Cars(GenerateUtils.toList("pobi,crong,honux,test1,test2,test3"));} )
        .withMessageMatching("입력 가능한 자동차의 최대 수는 5입니다.");
        
    }
}
