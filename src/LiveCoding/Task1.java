package LiveCoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Create a method that takes a string list as a parameter,
// then returns the list sorted alphabetically from Z to
//A.
public class Task1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Patrik");
        names.add("Karl");
        names.add("Enzo");
        names.add("Arno");

        sortList(names);
    }

    public static List<String> sortList(List<String> names){

        List<String> sortedlist = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedlist.forEach(System.out::println);
        return sortedlist;
    }

//    public static List<String> otherMethodForSorting(List<String> names){
//        List<String> sortedList;
//
//    }
}
