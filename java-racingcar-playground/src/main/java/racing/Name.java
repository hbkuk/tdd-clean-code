package racing;

import java.util.Objects;

public class Name {
    private static final int MAX_NAME_LENGTH_VALUE = 5;
    private String name;

    public Name(String name) {
        if( StringUtils.isBlanck(name) ) 
            throw new IllegalArgumentException("1글자 이상을 입력해야 합니다.");
        
        if( isInvalidNameLegnth(name) )
            throw new IllegalArgumentException("5글자를 초과할 수 없습니다.");
        this.name = name;
    }
    
    private boolean isInvalidNameLegnth(String name) {
        return name.length() > MAX_NAME_LENGTH_VALUE;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        return Objects.equals(name, other.name);
    }

    public String getName() {
        return this.name;
    }
    
}
