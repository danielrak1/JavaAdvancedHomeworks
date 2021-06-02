package LiveCoding;

import java.util.HashMap;
import java.util.Map;
//Create a Storage class that will have a private Map field,
// a public constructor, and methods:
//addToStorage(String key, String value) → adding elements to the storage
//printValues(String key) → displaying all elements under a given key
//findValues(String value) → displaying all keys that have a given value
//The Storage class should allow you to store multiple
// values under one key.


public class Task4 {
    public static void main(String[] args) throws Exception {
        Storage storage = new Storage();
        storage.addToStorage("1", "one");
        storage.addToStorage("2", "two");
        storage.addToStorage("3", "three");

        storage.printValue("2");
        storage.findValue("two");


    }
}

class Storage {
    //TODO : implement storage in a way that multiple values can be added
    private Map<String, String> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        map.put(key, value);
    }

    public void printValue(String key) {
        System.out.println("Value of " + key + " is " + map.get(key));
    }

    //TODO: implement findValue
    public String findValue(String value) throws Exception {
        if(!map.containsKey(value)){
            throw new Exception("Sorry, such value was not found.");
        }else{
            return map.get(value);
        }

    }
}
