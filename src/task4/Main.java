package task4;

public class Main {

    public static void main(String[] args) {
        int infimumNumber = 100;
        int supremumNumber = 999;

        int outcome = calculateQuantityNumbers(infimumNumber, supremumNumber);

        printAnswer(outcome);
    }

    public static int calculateQuantityNumbers(int infimuNumber, int supremuNumber) {
        int quantity = 0;

        while (infimuNumber <= supremuNumber) {
            int firstDigit = infimuNumber % 10;
            int secondDigit = (infimuNumber / 10) % 10;
            int thirdDigit = (infimuNumber / 100) % 10;

            if (checkCondition(firstDigit, secondDigit, thirdDigit)) {
                quantity += 1;
            }
            infimuNumber++;
        }
        return quantity;
    }

    static boolean checkCondition(int firstDigit, int secondDigit, int thirdDigit) {
        return (secondDigit - firstDigit >= 3 && thirdDigit - secondDigit > 3) ||
                (firstDigit - secondDigit >= 3 && secondDigit - thirdDigit > 3) ||
                (secondDigit - firstDigit >= 3 && secondDigit - thirdDigit >= 3) ||
                (firstDigit - secondDigit >= 3 && thirdDigit - secondDigit >= 3);
    }

    public static void printAnswer(int outcome) {
        System.out.println("The number of numbers, differing by three digit: " + outcome);
    }
}
