package ChangeBaseNumbers.common;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {

     public void changerBaseNumbers(int input, int output) {
        CheckInput checkInput = new CheckInput();
        Scanner sc = new Scanner(System.in);
        String num = "";

        if (input == 10) {
            do {
                System.out.println("Enter number: ");
                num = sc.nextLine();
            } while (checkInput.checkInput10(num) == 0);
            // numR = Integer.parseInt(num);
           
        }

        if (input == 2) {
            do {
                System.out.println("Enter number: ");
                num = sc.nextLine();
            } while (checkInput.checkInput2(num) == 0);
            // numR = Integer.parseInt(num);
          
        }

        if (input == 16) {
            do {
                System.out.println("Enter number: ");
                num = sc.nextLine();
            } while (checkInput.checkInput16(num) == 0);
        }

        if (input == output) {
            System.out.println(num);
            return;
        }

        ArrayList<Integer> numlist = new ArrayList<>();
        // while (numR > 0) {
        // numlist.add(numR % 10);
        // numR = numR / 10;
        // }
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int numericValue = Character.getNumericValue(c);
    
            if (numericValue >= 0 && numericValue <= 9) {
                // int
                numlist.add(numericValue);
            } else if (c >= 'A' && c <= 'F') {
                // char
                int value = 10 + (c - 'A');
                numlist.add(value);
            }
        }
     
        // chuyen sang he 10 truoc:v
        int k = 1;
        for (int i = 1; i < numlist.size(); i++) {
            k = k * input;
        }

        int he10 = 0;
        for (int i = 0; i < numlist.size(); i++) {
            he10 = he10 + numlist.get(i) * k;
            k = k / input;
        }

        if (output ==10) {
            System.out.println(he10);
            return;
        }

        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        // =>
        String kq = "";
        while (he10 > 0) {
            kq = hex[he10 % output] + kq;
            he10 = he10 / 2;
        }
        System.out.println(kq);
    }
}
