package LiveCoding;


//Implement the SDAHashSet<E> class that will implement
// the HashSet<E> logic.
// It should support methods:
//        • add
//        • remove
//        • size
//        • contains
//        • clear

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSet<>();
        set.add("Daniel");
        set.add("Daniel");
        set.add("Patrik");
        System.out.println(set.size());

    }
}

class SDAHashSet<T> {

    private List<T> objects;

    public SDAHashSet() {
        objects = new ArrayList<>();
    }

    public void add(T t) {
        if(objects.contains(t)){
            objects.remove(t);
            objects.add(t);
            return;
        }
        objects.add(t);
    }

    public void remove(T t) {
        objects.remove(t);

    }

    public int size() {
        return objects.size();
    }

    public boolean contains(T t) {
        return objects.contains(t);

    }

    public void clear() {
        objects.clear();

    }
}
