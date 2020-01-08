package conditionals;

class weekday{
    public static String week_day(int x){

        switch (x) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";
        }

        return "No day";
    }

    public static void main(String[] args){
        int[] daysNumber = {1,2,3,4,5,6,7};

        for (int i = 0; i < daysNumber.length; i++){
            String answer;
            answer = week_day(daysNumber[i]);
            System.out.println(answer);
        }
    }
}