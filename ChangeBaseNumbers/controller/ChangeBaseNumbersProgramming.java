package ChangeBaseNumbers.controller;

import java.util.Scanner;

import ChangeBaseNumbers.common.Algorithm;
import ChangeBaseNumbers.common.Library;
import ChangeBaseNumbers.view.Menu;

public class ChangeBaseNumbersProgramming extends Menu<String> {
    Scanner sc = new Scanner(System.in);

    static String[] mc = { "Binary", "Decimal", "Hexadecimal", "Exit" };
    protected Library library;
    protected Algorithm algorithm;

    public ChangeBaseNumbersProgramming() {
        super("Change Base Numbers Project\n", mc);
        this.library = new Library();
        this.algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                enterOutput(2);
                break;
            }
            case 2: {
                enterOutput(10);
                break;
            }
            case 3: {
                enterOutput(16);
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }
    public void enterOutput(int input) {
        final String[] outputlist = { "Binary", "Decimal", "Hexadecimal" };
        class Output extends Menu<String> {
            public Output() {
                super("Choice output base system\n"
                +"Enter another number to return\n", outputlist);
            }
            
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        algorithm.changerBaseNumbers(input, 2);
                        break;
                    }
                    case 2: {
                        algorithm.changerBaseNumbers(input, 10);
                        break;
                    }
                    case 3: {
                        algorithm.changerBaseNumbers(input, 16);
                        break;
                    }
                }
            }
        }
        // run
        Output output = new Output();
        output.run();
    }

}
