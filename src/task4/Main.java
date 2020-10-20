package task4;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        int quantity = calculateQuantityNumbers(number);

        printAnswer(quantity);
    }

    public static  int calculateQuantityNumbers(int number) {
        int quantity = 0;

        while (number >= 100 & number <= 999) {
            int firstDigit = number % 10;
            int secondDigit = (number / 10) % 10;
            int thirdDigit = (number / 100) % 10;

            if (mustDo(firstDigit, secondDigit, thirdDigit) ) {
                quantity += 1;
                number++;

            } else {
                number++;
            }
        }
        return quantity;
    }


    static boolean  mustDo(int firstDigit, int secondDigit, int thirdDigit) {
        return (secondDigit - firstDigit >= 3 && thirdDigit - secondDigit > 3) ||
                (firstDigit - secondDigit >= 3 && secondDigit - thirdDigit > 3) ||
                (secondDigit - firstDigit >= 3 && secondDigit - thirdDigit >= 3) ||
                (firstDigit - secondDigit >= 3 && thirdDigit - secondDigit >= 3);

    }

    public static void printAnswer(int quantity) {
            System.out.println("The number of numbers, differing by three digit: " + quantity);
    }
}
