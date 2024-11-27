package com.aluracursos.converter.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private int valueInput;
    LookAndFeel lf = new LookAndFeel();

    public int Numero(String inputMessage, String errorMessage, int option) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(lf.blue(inputMessage));
            try {
                valueInput = scanner.nextInt();
                if (valueInput > option && option != 0) {
                    throw new InputMismatchException();
                }
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println(lf.red(errorMessage));
                scanner.nextLine();
            }
        }
        return valueInput;
    }
}
