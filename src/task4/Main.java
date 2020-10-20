package task4;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        int quantity = calculateQuantityNumbers(number);

        printAnswer(quantity);
    }

    public static  int calculateQuantityNumbers(int number) {
        int quantity = 0;

<<<<<<< HEAD
        while (number >= 100 & number <= 999) {
            int firstDigit = number % 10;
            int secondDigit = (number / 10) % 10;
            int thirdDigit = (number / 100) % 10;

            if ( mustDo(firstDigit, secondDigit, thirdDigit)) {
=======
            if ( readCondition(firstdigit, seconddigit, thirddigit)) {
>>>>>>> a2fbd7976c16ed848bfff1c0b532069b157767b3
                quantity += 1;
                number++;

            } else {
                number++;
            }
        }
        return quantity;
    }

<<<<<<< HEAD
    static boolean  mustDo(int firstDigit, int secondDigit, int thirdDigit) {
        return (secondDigit - firstDigit >= 3 && thirdDigit - secondDigit > 3) ||
                (firstDigit - secondDigit >= 3 && secondDigit - thirdDigit > 3) ||
                (secondDigit - firstDigit >= 3 && secondDigit - thirdDigit >= 3) ||
                (firstDigit - secondDigit >= 3 && thirdDigit - secondDigit >= 3);
=======
    static boolean  readCondition(int firstdigit, int seconddigit, int thirddigit) {
        return (seconddigit - firstdigit >= 3 && thirddigit - seconddigit > 3) ||
                (firstdigit - seconddigit >= 3 && seconddigit - thirddigit > 3) ||
                (seconddigit - firstdigit >= 3 && seconddigit - thirddigit >= 3) ||
                (firstdigit - seconddigit >= 3 && thirddigit - seconddigit >= 3);
>>>>>>> a2fbd7976c16ed848bfff1c0b532069b157767b3
    }

    public static void printAnswer(int quantity) {
            System.out.println("The number of numbers, differing by three digit: " + quantity);
    }
}

