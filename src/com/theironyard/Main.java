package com.theironyard;

import java.util.Scanner;

/** Riggins 2016
 *  Text Adventure 2
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println();
        System.out.println("TEXT DUNGEON 1");
        System.out.println();
        System.out.println();
        System.out.println("Type 'START' to begin.");

        String start = scanner.nextLine();
        if (start.isEmpty() || !(start.equalsIgnoreCase("start"))) {
            throw new Exception("Game Over");
        }
        System.out.println();
        System.out.println();
        System.out.println("You are slowly gaining consciousness...");
        System.out.println();
        System.out.println();
        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            name = "Frank";
            System.out.println();
            System.out.println("Your character's name will be " + name + ".");
        }
        else {
            System.out.println();
            System.out.println("Your name is " + name + ".");
        }

        System.out.println();
        System.out.println("Select your character's race:");
        System.out.println("1 - Human");
        System.out.println("2 - Orc");
        System.out.println("3 - Goblin");

        System.out.println();
        String race = scanner.nextLine();

        if (race.isEmpty()) {
            race = "Human";
        }
        if (race.equals("2") || (race.equalsIgnoreCase("orc"))) {
            race = "Orc";
        }
        else if (race.equals("3") || (race.equalsIgnoreCase("goblin"))) {
            race = "Goblin";
        }
        else {
            race = "Human";
        }
        System.out.println("You are a " + race + ".");

        System.out.println();
        System.out.println("Select your gender:");
        System.out.println("1 - Male");
        System.out.println("2 - Female");

        String gender = scanner.nextLine();

        if (gender.equals("2") || (gender.equalsIgnoreCase("Female"))) {
            gender = "Female";
        }
        else {
            gender = "Male";
        }

        if (race.equalsIgnoreCase("orc") || (race.equals("Alien"))) {
            System.out.println("You are an " + race + " " + gender + " named " + name + ".");
        }
        else {
            System.out.println("You are a " + race + " " + gender + " named " + name + ".");
        }

        System.out.println("As you come to, you notice that you're in a dark dungeon.");
        System.out.println();
        System.out.println("Before you is a sword, a bow, and an axe. Which weapon do you pick up?");
        System.out.println("1 - Sword");
        System.out.println("2 - Bow");
        System.out.println("3 - Axe");

        String weapon = scanner.nextLine();

        System.out.println("You equipped the " + weapon + ".");

        //continue with restrictions for weapon
    }
}
