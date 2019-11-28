public class IntervalWorkout {
    int repetition;
    int breaktime = 30; //sec
    String[] exercises;
    public void setRep(int rep){
        this.repetition = rep;
    }
    public int getRep(){
        return repetition;
    }
    public void setBreak(int breaktime){
        this.breaktime = breaktime;
    }
    public int getBreak(){
        return breaktime;
    }
    public void setExercises(String[] exercises){
        this.exercises = exercises;
    }
    public String[] getExercises(){
        return exercises;
    }

    public static void main(String[] args) {
        IntervalWorkout example = new IntervalWorkout();
        example.setRep(4);
        example.setBreak(30);
        example.setExercises(new String[]{"Push-ups", "Squats", "Planks"});
        System.out.println("****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("****************************");
        int count = 1;
        for (int i=0; i<example.getRep(); i++){
            System.out.println("============================");
            System.out.println("ROUND "+count+":");
            for (String x : example.getExercises()){
                System.out.println(x);
            }
            if (i<example.getRep()-1){
                System.out.println("============================");
                System.out.println("DO THE BREAK ("+example.getBreak()+" SECONDS)");
            }
        }
        System.out.println("****************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!!");
        System.out.println("****************************");
    }
}
