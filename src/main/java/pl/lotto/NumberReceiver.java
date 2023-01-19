package pl.lotto;

import pl.lotto.messanger.Messanger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberReceiver {

    Messanger messanger = new Messanger();
      int[] retrieveNumberFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int[] userNumber = new int[6];
        for (int i = 0; i < 6; i++) {
           displayNumberReceiveSixNumbersFromUserMessage();
            while (true) {
                try {
                    number = scanner.nextInt();
                    userNumber[i]= number;
                    break;

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("This is not a number. Please try again.");
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("This is not a number. Please try again.");
                    scanner.nextLine();
                    break;
                }
            }
        }

        return userNumber;
    }

    private  void displayNumberReceiveSixNumbersFromUserMessage(){
          messanger.makeMessage("Please enter 6 numbers beetween 1 and 99 (inclusive)");
    }
}
