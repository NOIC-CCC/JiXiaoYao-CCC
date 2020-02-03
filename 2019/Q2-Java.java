import java.util.*;


public class Main {
    static boolean[] Primes;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<Integer> Data = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            Data.add(sc.nextInt() * 2);
            //Data.add("//");
        }
        CalculatePrimes(Collections.max(Data));
        for (int i :Data) {
            Run(i);
        }
        /*for (String D : Data)
            System.out.print(D + "\r\n");*/
        // write your code here
    }

    public static void CalculatePrimes(int max) {
        boolean[] primes = new boolean[max + 1];
        Arrays.fill(primes, true);
        for (int k = 2; k <= max / k; k++) {
            if (primes[k]) {
                for (int i = k; i <= max / k; i++) {
                    primes[k * i] = false; // k * i is not prime
                }
            }
        }
        Primes = primes;
    }

    public static boolean IsPrimes(int number) {
        //  int l = (int)Math.ceil(Math.sqrt(number));
       // for (int i = 2; i < number; i++)
        //    if (number % i == 0) {
        //        return false;
        //    }
        return Primes[number];
    }

    public static void Run(int Number) {
        for (int j = 2; j < Number; j++) {
            if (IsPrimes(j))
                if (IsPrimes(Number - j)) {
                    System.out.print(j + " " + (Number - j) + "\r\n");
                    //Data.add(j + " " + (data - j));
                    break;
                }
        }
    }

    static int[] PrimesList = {};
}
