package ro.fasttrackit.proiect;

import java.util.Scanner;

public class BebeJunior {
    public static void main(String[] args) {
        int input;
        do {
            printProduse();
            input = askforInput();
            handleInput(input);

        } while (input != 8);
    }

    static void handleInput(int userInput) {
        String message = switch (userInput) {
            case 1 -> "Ati ales Salopeta bebe";
            case 2 -> "Ati ales Body";
            case 3 -> "Ati ales Pantaloni";
            case 4 -> "Ati ales Rochita";
            case 5 -> "Ati ales Sosete";
            case 6 -> "Ati ales Caciula";
            case 7 -> "Ati ales Papuci";
            case 8 -> "Ati ales Exit";
            default -> "Invalid input";
        };
        System.out.println(message + " ,Va multumim!");
    }

    static void printProduse() {
        System.out.println("1)Salopeta bebe");
        System.out.println("2)Body");
        System.out.println("3)Pantaloni");
        System.out.println("4)Rochita");
        System.out.println("5)Sosete");
        System.out.println("6)Caciula");
        System.out.println("7)Papuci");
        System.out.println("8)Exit");
    }

    static int askforInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("Alegeti produsul: ");
        return console.nextInt();
    }
}

