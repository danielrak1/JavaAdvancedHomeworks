package LiveCoding;

//Create a method that takes the map as a parameter,
// where the key is string and the value number, and then
//prints each map element to the console in the format:
// Key: <k>, Value: <v>. There should be a comma at the
//end of every line except the last, and a period at the last.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(" First", 1);
        map.put(" Second", 2);
        map.put(" Third", 3);

        task3(map);
    }

    public static void task3(Map<String, Integer> map) {
        //This prints comma after every  line. TODO: Make it function so, that after last line you don't have comma
        for(String key : map.keySet()){
            System.out.println("Key: " + key + ", " + "Value: " + map.get(key)+ ", ");
        }

    }
}
