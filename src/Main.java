import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String , Integer> ages = new TreeMap<>();
        ages.put( "Paul", 45 );
        ages.put( "Jane", 26 );
        ages.put( "Alban", 55 );
        System.out.println(ages);
        ages.remove("John");
        System.out.println(ages);

    }
}