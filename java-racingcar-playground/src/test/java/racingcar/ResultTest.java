package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ResultTest {

    @Test
    void Cars_가장_큰_position_값_출력() {
        Cars newCars = new Cars(Arrays.asList("pobi","crong","honi"));
        Car pobi = newCars.getCars().get(0);
        Car crong = newCars.getCars().get(1);
        Car honi = newCars.getCars().get(2);
        
        pobi.move(4);
        pobi.move(5);
        pobi.move(6);
        
        crong.move(1);
        crong.move(3);
        
        honi.move(4);
        honi.move(5);
        honi.move(6);
        
        int maxPositionValue = Result.maxPositionValue(newCars);
        assertThat(maxPositionValue).isEqualTo(3);
    }
    
    @Test
    void Cars_가장_큰_position인_Car_name_출력() {
        Cars newCars = new Cars(Arrays.asList("pobi","crong","honi"));
        Car pobi = newCars.getCars().get(0);
        Car crong = newCars.getCars().get(1);
        Car honi = newCars.getCars().get(2);
        
        pobi.move(4);
        pobi.move(5);
        pobi.move(3);
        
        crong.move(3);
        crong.move(4);
        crong.move(5);
        crong.move(9);
        
        honi.move(4);
        honi.move(5);
        honi.move(3);
        
        List<Car> winningCars = 
            Result.getWinningCars(newCars);
        
        assertThat(winningCars.get(0).getName()).isEqualTo("crong");
        assertThat(winningCars.get(0).getPosition()).isEqualTo(3);
    }

}
