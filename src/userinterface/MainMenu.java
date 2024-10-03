package userinterface;

import greenhouse.Greenhouse;
import java.util.Scanner;

public class MainMenu extends Menu { //Inheritance
    enum options {EXIT,WATER} //Using enums to limit the amount of menu options available.

    public MainMenu() {
    }

    @Override
    public void run() {
        boolean quit = false;

        while(!quit) {
            System.out.println();
            String header = "\uD835\uDD44\uD835\uDD52\uD835\uDD5A\uD835\uDD5F \uD835\uDD44\uD835\uDD56\uD835\uDD5F\uD835\uDD66\n-----------------";
            System.out.println(header);
            System.out.println("Options:");
            for (options option : options.values()) {
                System.out.printf("-%s\n", option.name());
            }
            System.out.println();

            String input = getValidOption();

            switch (input) {
                case "EXIT": //TODO: maybe change so it actually uses the options?
                    quit = true;
                    break;
                case "WATER":
                    System.out.print("Plant to water: ");
                    String name = getInput();
                    System.out.println();
                    System.out.printf("Instructions for '%s': \n", name);
                    Greenhouse.getInstance().waterByName(name);
            }
        }
    }

    @Override
    public boolean isOption(String s) {
        for (options o : options.values()) {
            if (o.name().equalsIgnoreCase(s)) {
                return true;
            }
        }

        return false;
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
