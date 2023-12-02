package app;

import java.util.Scanner;

public class Main {
    static String text;
    static String fileName;
    static Scanner scanner;

    public static void main(String[] args) {
        runOption(getOption());

    }

    private static int getOption() {
        System.out.println("Choose an option : " + "\n1 - create file and enter data." +
                "\n2 - read file.");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void runOption(int option) {
        switch (option) {
            case 1 -> {
                doWriteFile();
                getOutput(handleWriteData());

            }
            case 2 -> {
                doReadFile();
                getOutput(handleReadData());
            }
        }

    }


    private static void doWriteFile() {
        scanner = new Scanner(System.in);
        System.out.print("Enter text : ");
        text = scanner.nextLine();
        System.out.print("Enter file name : ");
        fileName = scanner.nextLine() + Constants.EXTENTION;


    }

    private static String handleWriteData() {
        return new FileWriteService().writeFile(text, fileName);
    }

    private static void doReadFile() {
        scanner = new Scanner(System.in);
        System.out.print("Enter file name from which you need to read data : ");
        fileName = scanner.nextLine() + Constants.EXTENTION;
    }

    private static String handleReadData() {
        return new FileReadService().readFile(fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
