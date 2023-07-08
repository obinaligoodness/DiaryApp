package diarytest;

import javax.swing.*;
import java.util.Scanner;

public class Main1 {

        private static DiaryInterface diaryInterface = new Diary();

        public static void main(String[] args) {
            displayMenu();
        }

            private static void displayMenu(){
            Scanner scanner = new Scanner(System.in);
            String mainMenu = """
                Enter 1 to create entry
                Enter 2 to search for entry
                Enter 3 to get number of entry
                Enter 4 to get all entry
                Enter 5 to delete entry
                """;
            String input = input(mainMenu);

            switch (input.charAt(0)) {
                case '1':
                    createEntry();
                    break;
                case '2':
                    search();
                    break;
                case '3':
                    getEntrySize();
                    break;
                case '4':
                    allEntry();
                    break;
                case '5':
                    deleteEntry();
                    break;
                default:
                    System.out.println("invalid input!!!");
                    displayMenu();
            }}

    private static void deleteEntry() {
        int idNo = Integer.parseInt(input("Enter the id number of the entry you want to search for"));
        try {
            diaryInterface.deleteEntry(idNo);
            displayMenu();
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Id number does not exist");
            displayMenu();
        }


    }

    private static void allEntry() {
        System.out.println(diaryInterface.getEntries());
        displayMenu();
    }

    private static void getEntrySize() {
        System.out.println(diaryInterface.getNoOfEntries());
        displayMenu();
    }

    private static void search() {
            int idNo = Integer.parseInt(input("Enter the id number of the entry you want to search for"));
            try {
                System.out.println(diaryInterface.viewEntry(idNo));
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("Id number does not exist");
                displayMenu();
            }
            displayMenu();
    }


    private static void createEntry() {
            String topic = input("Enter topic");
            String content =  input("Enter content");


            String save = input("would you like to save entry");
            if(save.equalsIgnoreCase("yes")){
            diaryInterface.addEntry(topic, content);
            displayMenu();
            }
            else{displayMenu();}

        }

        private static String input(String prompt) {
//        return JOptionPane.showInputDialog(prompt);
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            return scanner  .nextLine();
        }

        private static void display(String message){
            JOptionPane.showMessageDialog(null,message);

        }}

