package math;

class math1 {
    public static double exercise_one(double x, double y, double z){

        double answer;

        double sum = Math.pow(x,2) + Math.pow(y,2);
        double sub = sum - Math.abs(z);
        answer = Math.cbrt(sub);

        return answer;
    }

    public static void main(String[] args){

        double answer = exercise_one(5,3,-7);
        System.out.println(answer);
    }
}
