package racing;

public class Car {
    private static final int MAX_NAME_LENGTH_VALUE = 5;
    private String name;

    public Car(String name) {
        if( StringUtils.isBlanck(name) ) 
            throw new IllegalArgumentException("1글자 이상을 입력해야 합니다.");
        
        if( isInvalidNameLegnth(name) )
            throw new IllegalArgumentException("5글자를 초과할 수 없습니다.");
        
        this.name = name;
    }

    private boolean isInvalidNameLegnth(String name) {
        return name.length() > MAX_NAME_LENGTH_VALUE;
    }
}
