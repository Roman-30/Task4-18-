package task4;

public class Main {

    public static void main(String[] args) {
        int infimumNumber = 100;
        int supremumNumber = 999;

        int outcome = calculateQuantityNumbers(infimumNumber, supremumNumber);

        printAnswer(outcome);
    }

    public static int calculateQuantityNumbers(int infimumNumber, int supremumNumber) {
        int quantity = 0;

        while (infimumNumber <= supremumNumber) {
            int firstDigit = infimumNumber % 10;
            int secondDigit = (infimumNumber / 10) % 10;
            int thirdDigit = (infimumNumber / 100) % 10;

            if (checkCondition(firstDigit, secondDigit, thirdDigit)) {
                quantity += 1;
            }
            infimumNumber++;
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
