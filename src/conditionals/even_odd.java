package conditionals;

class even_odd{
    public static String evenodd(int x){

        String answer;

        answer = (x % 2 == 0) ? "even" : "odd";

        return answer;

    }
    public static void main(String[] args) {
        String answer = evenodd(3);
        System.out.println(answer);
    }
}