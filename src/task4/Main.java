package task4;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        int quantity = iterateOverNumbers(number);

        printAnswer(quantity);
    }

    public static int iterateOverNumbers(int number) {
        int quantity = 0;
        while (number <= 999) {
            int firstdigit = number % 10;
            int seconddigit = (number / 10) % 10;
            int thirddigit = (number / 100) % 10;

            if ( establishCondition(firstdigit, seconddigit,thirddigit)) {
                quantity += 1;
                number++;
            } else {
                number++;
            }
        }
        return quantity;
    }

    static boolean  establishCondition(int firstdigit, int seconddigit, int thirddigit) {
        return (seconddigit - firstdigit >= 3 && thirddigit - seconddigit > 3) ||
                (firstdigit - seconddigit >= 3 && seconddigit - thirddigit > 3) ||
                (seconddigit - firstdigit >= 3 && seconddigit - thirddigit >= 3) ||
                (firstdigit - seconddigit >= 3 && thirddigit - seconddigit >= 3);
    }

    public static void printAnswer(int quantity) {
            System.out.println("The number of numbers, differing by three digit: " + quantity);
    }
}

