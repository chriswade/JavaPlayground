package loops;

public class Fibonacci {
    public static String main(int n) {
        String fib = "";
        int first = 0, second = 1, fibonacci;
        System.out.println("loops.Fibonacci to the value of " + n + " terms");
        for(int c = 0; c < n; c++) {
            if(c <= 1) {
                fibonacci = c;
                fib += fibonacci + " ";
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
                fib += fibonacci + " ";
            }
            System.out.println(fibonacci + " ");
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.main(10));
    }

}




