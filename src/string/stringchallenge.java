package string;

class stringchallenge{
    public static String sc(String text){

        String answer;
        //Write code here

        answer = text.trim();
        answer = answer.substring(0, 6);
        answer = answer.toUpperCase();

        //Comment the statement below once you have written your code
        return answer;
        //Uncomment the statement below once you have written your code
        //return answer;

    }

    public static void main(String[] args) {
        String answer = sc("   Names!  Doe   ");
        System.out.println(answer);
    }
}
