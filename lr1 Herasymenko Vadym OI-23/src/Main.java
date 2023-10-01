import java.util.*;

/**
 * The user enters the number N and the program outputs a list of the first N prime Fibonacci numbers
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть число N");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Fibonacci> list = new ArrayList<>();
        findAllPrime(list, N);

        System.out.println("Прості числа серед перших " + N + " чисел Фібоначі:");
        for (Fibonacci fibonacci : list) {
            System.out.println(fibonacci.getValue());
        }
    }

    /**
     * @param list is an array of Fibonacci prime number objects
     * @param N number of first Fibonacci numbers
     */
    public static void findAllPrime(List<Fibonacci> list, int N){
        for(int i=1; i<=N; i++){
            Fibonacci fibonacci = new Fibonacci(i);
            if (fibonacci.checkPrime()){
                list.add(fibonacci);
            }
        }
    }
}

