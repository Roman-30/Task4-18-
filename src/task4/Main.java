package task4;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        int quantity = iterateovernumbers(number);
        printanswer(quantity);
    }

    public static int iterateovernumbers(int number) {
        int quantity = 0;
        while (number <= 999) {
            int firstdigit = number % 10;
            int seconddigit = (number / 10) % 10;
            int thirddigit = (number / 100) % 10;
            if ((seconddigit - firstdigit >= 3 && thirddigit - seconddigit > 3) ||
                    (firstdigit - seconddigit >= 3 && seconddigit - thirddigit > 3) ||
                    (seconddigit - firstdigit >= 3 && seconddigit - thirddigit >= 3) ||
                    (firstdigit - seconddigit >= 3 && thirddigit - seconddigit >= 3)) {
                quantity += 1;
                number++;
            } else {
                number++;
            }
        }
        return quantity;
    }

    public static void printanswer(int quantity){
        if (quantity > 0){
            System.out.println("The number of numbers, differing by three digit: " + quantity);
        } else {
            System.out.println("Error");
        }
    }


}

