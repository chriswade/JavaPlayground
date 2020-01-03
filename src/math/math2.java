package math;

class math2{

    public static boolean logic(boolean x, boolean y){

        boolean answer;

        //Write your code below this
        //Hint: You can make extra variables if need be

        boolean not_x=!x;
        boolean xor_x= not_x ^ x;
        boolean and_xy= xor_x && y;
        answer=!and_xy;

        return answer;
    }
    public static void main(String[] args) {
        boolean answer = logic(true, false);
        System.out.println(answer);
    }
}