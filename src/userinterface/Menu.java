package userinterface;

import java.util.Scanner;

public abstract class Menu {
    public abstract void run();

    public abstract boolean isOption(String s);

    public String getValidOption() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select an option: ");
        String input = scan.nextLine();

        while (!isOption(input)) {
            System.out.print("Invalid, please try again: ");
            input = scan.nextLine();
        }

        return input.toUpperCase();
    }
}
