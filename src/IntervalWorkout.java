public class IntervalWorkout {
    int repetition = 4;
    int breaktime = 30; //sec
    String[] exercises = {"Push-ups", "Squats", "Planks"};

    public void main(String[] args) {
        System.out.println("****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("****************************");
        int count = 1;
        for (int i=0; i<repetition; i++){
            System.out.println("============================");
            System.out.println("Round "+count+":");
            for (String x : exercises){
                System.out.println(x);
            }
            if (i<repetition-1){
                System.out.println("============================");
                System.out.println("DO THE BREAK ("+breaktime+" SECONDS)");
            }
        }
        System.out.println("****************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!!");
        System.out.println("****************************");
    }
}
