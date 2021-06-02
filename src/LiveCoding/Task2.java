package LiveCoding;

//Create a method that takes a string list as a parameter,
// then returns that list sorted alphabetically from Z to
//        A case-insensitive.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Patrik");
        names.add("Karl");
        names.add("Enzo");
        names.add("Arno");

        sortList(names);
//        sortListOtherWay(names);
    }

    public static List<String> sortList(List<String> names) {

        List<String> sortedlist = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        sortedlist.forEach(System.out::println);
        return sortedlist;
    }

//    public static List<String> sortListOtherWay(List<String> names){
//
//        List<String> sortedlist = new ArrayList<>(names);
//        Collections.sort(sortedlist, String.CASE_INSENSITIVE_ORDER);
//        sortedlist.forEach(System.out::println);
//
////        return sortedList;
//    }
}