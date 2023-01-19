package pl.lotto;

class NumberValidator {


     public static final int LOWEST_POSSIBLE_NUMBER_FROM_USER = 1;
     public static final int HIGHEST_POSSIBLE_NUMBER_FROM_USER = 99;

      boolean validateNumbers(int[] userNumber) {
        for (int i = 0; i < 6; i++) {

            if (!isNumberInCorrectRange(userNumber[i])) {

                return false;

            } else {
                System.out.println(userNumber[i] + " is not between 1 and 99. Please try again.");
            }

        }

        return true;
    }

     private  boolean isNumberInCorrectRange(int number) {
         return number >= LOWEST_POSSIBLE_NUMBER_FROM_USER && number <= HIGHEST_POSSIBLE_NUMBER_FROM_USER;
     }
}


