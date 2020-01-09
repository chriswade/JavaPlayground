package loops;

class MultiplicationTable {
    public static String test(int num)
    {
        String table = "";
        int i = 1;
        int k = 10;
        while (k > 0) {
            int answer = num * i;
            System.out.println(num + " x " + i + " = " + answer);
            table += answer + " ";
            i++;
            k--;
        }
        return table;
    }

    public static void main(String[] args) {
        String answer = test(9);
        System.out.println(answer);
    }
}
