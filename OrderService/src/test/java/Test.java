import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class Pojo{
    private final Date value;
    private final Integer length;

    public Pojo(Date value, Integer length) {
        this.value = value;
        this.length = length;
    }
    public Date getValue(){
        return value;
    }

//getter for length, equals, hashcode

    public static void main(String[] args){
        Map<Pojo, Integer> map = new HashMap();
        Pojo key = new Pojo(new Date(), 3);
        map.put(key, 1);
        key.getValue().setTime(123);
        Integer result = map.get(key);
        System.out.println(result);
    }
}