package com.Dictionary;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    // 1. create a new dictionary
    // 2. load existing dictionary
    // 3. display the entire dictionary
    // 4. quit

    public static void startChoice () throws IOException{
        Scanner scanner = new Scanner(System.in);
    }

    public static void menu () throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        printMenu();
        choice = scanner.nextInt();
        while (choice != 5){
            switch (choice) {
                case 1:
                    System.out.println("Option 1: Create a new dictionary");
//                    DictionaryMapping.createFile();
//                    DictionaryMapping.loadFile();
                case 2:
                    System.out.println("Option 2: Create a new translation");
                    DictionaryMapping.newTranslation(DictionaryMapping.createFile());
                    break;
                case 3:
                    System.out.println("Option 3: Translate a word from the dictionary");
                    DictionaryMapping.translateWord();
                    break;
                case 4:
                    System.out.println("Option 4: Display the dictionary");
                    DictionaryMapping.displayDictionary();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong choice, try again");
                    menu();
            }
            printMenu();
            choice = scanner.nextInt();
    }
    }

    public static void printMenu(){
        System.out.println("==============\n" +
                "\nChoose an option: " +
                "\n 1. Create a new dictionary" +
                "\n 2. Create a new translation " +
                "\n 3. Translate a word from the dictionary" +
                "\n 4. Display the entire dictionary " +
                "\n 5. Exit the program\n\n============");
    }
}
