package LiveCoding;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        String [] arr = new String[]{"Giorgi","Daniel","Enzo","Enzo","Daniel"};
        System.out.println(getUniqueItems(arr));
        System.out.println(getNonUniqueItems(arr));


    }

    public static List<String> getUniqueItems(String[] strings){
        return new ArrayList<>(new HashSet<>(Arrays.asList(strings)));
    }

    public static List<String> getNonUniqueItems(String[] strings){
        Map<String, Integer> frequencies = new HashMap<>();

        for(String string : strings) {
            if (frequencies.containsKey(string)) {
                frequencies.put(string, frequencies.get(string) + 1);
            } else {
                frequencies.put(string, 1);
            }
        }
        List<String> nonUniquesToReturn = new ArrayList<>();

        for(String key : frequencies.keySet()){
            if(frequencies.get(key)>1){
                nonUniquesToReturn.add(key);
            }
        }
        return nonUniquesToReturn;
    }

//    public static List<String> mostFrequent25RecurringItems(String [] strings){
//
//    }
//        Set<String> uniques = new HashSet<>(Arrays.asList(strings));
//        List<String> anwser = new ArrayList<>();
//
//        for(String string : strings){
//            uniques.contains(string);


}
