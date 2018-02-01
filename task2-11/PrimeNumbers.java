public class PrimeNumbers {
    public static void primeNumbers(int number){
    boolean question = false;
        for (number = 2; number <=100; number++) {
            for (int i = 2; i < number; i++) {
                if (number % i != 0) {
                    question = true;
                } else {
                    question = false;
                    break;
                }
            }
            if (question) {
                System.out.println(number);
            }
        }
    }
}
