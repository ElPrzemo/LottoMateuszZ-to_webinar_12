package pl.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {


    public static void main(String[] lotteryGame) {
        NumberReceiver numberReceiver = new NumberReceiver();

        int[] userNumber = numberReceiver.retrieveNumberFromTheUser();
        NumberValidator numberValidator = new NumberValidator();
        boolean valid = numberValidator.validateNumbers(userNumber);
        if (!valid){
            return;
        }

        System.out.println("Your numbers are:");
        for (int i : userNumber) {
            System.out.print(i + " ");
        }

        System.out.println();

        List <Integer> lotteryNumbers = new ArrayList<>();
        int randomNum;
        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 99);
            for (int x = 0; x < i; x++) {
                if (lotteryNumbers.get(x) == randomNum) {
                    randomNum = (int) (Math.random() * 99);
                    x = -1;
                }
            }
            lotteryNumbers.add(randomNum);
        }


        System.out.println("Draw numbers are:");
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");

        }

        System.out.println();

        if (lotteryNumbers.`equals(userNumber))
            System.out.println("Congratulations, you have won!");
        else {
            System.out.println("Sorry, but you didn't win. It's not you lucky day perhaps. Try your luck next time. ");
        }
    }





}
