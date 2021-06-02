package com.Dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMapping {


    public static void map() throws IOException {
        File file = createFile();
        newTranslation(file);
    }

    protected static File createFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to be created");
        String input = scanner.next();

        File file = new File(input);
        return file;
    }

    public static void loadFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name to be loaded:");
        String input = scanner.next();

        try {
            InputStream is = new FileInputStream(input);
            System.out.println(input + " was loaded");
            is.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void newTranslation(File file) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the English word:");
        String string1 = scanner.next();
        System.out.println("Enter the Estonian word:");
        String string2 = scanner.next();

        HashMap<String, String> map = new HashMap<>();
        map.put(string1, string2);

        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(file, true));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bf.write(entry.getKey() + ":" + entry.getValue());
                bf.newLine();
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
    }

    public static void displayDictionary() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void translateWord() throws FileNotFoundException {
        Map<String, String> mapFromFile = getHashMapFromTextFile();
        for(Map.Entry<String, String> entry : mapFromFile.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static Map<String, String> getHashMapFromTextFile() throws FileNotFoundException {
        HashMap<String, String> mapFileContents = new HashMap<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                String englishWord = parts[0].trim();
                String estonianWord = parts[1].trim();

                if (!englishWord.equals("") && !estonianWord.equals(""))
                    mapFileContents.put(englishWord, estonianWord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
                ;
            }
        }
        return mapFileContents;
    }
}



