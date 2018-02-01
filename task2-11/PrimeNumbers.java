public class PrimeNumbers {
    public static void main(String[] args) {
        int currentNumber;
        boolean question = false;
        for (currentNumber = 2; currentNumber <=100; currentNumber++){
            for (int i = 2; i < currentNumber; i++){
                if (currentNumber % i != 0){
                    question = true;
                }
                else{
                    question = false;
                    break;
                }
            }
            if (question){
                System.out.println(currentNumber);
            }
        }
    }
}
