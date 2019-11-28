public class Exercise {
    private String exName;
    private String desc;
    private int duration; //in sec
    private String position; //floor or standup
    //SETTERS
    public void setName(String name){
        this.exName = name;
    }
    public void setDesc(String descr){
        this.desc = descr;
    }
    public void setDur(int dur){
        this.duration = dur;
    }
    public void setPosition(String position){
        this.position = position;
    }
    //GETTERS
    public String getName(){
        return exName;
    }
    public String getDesc(){
        return desc;
    }
    public int getDur(){
        return duration;
    }
    public String getPosition(){
        return position;
    }
    //MAIN
    public static void main(String[] args) {
        //CREATE DATA
        Exercise pushups = new Exercise();
        Exercise planks = new Exercise();
        Exercise squats = new Exercise();
        Exercise backwardKick = new Exercise();
        Exercise legCurl = new Exercise();
        Exercise sidewardBackStretch = new Exercise();
        //FILL WITH DATA
        pushups.setName("Push-ups");
        pushups.setDesc("Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.");
        pushups.setDur(30);
        pushups.setPosition("floor");
        planks.setName("Planks");
        planks.setDesc("Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.");
        planks.setDur(90);
        planks.setPosition("floor");
        squats.setName("Squats");
        squats.setDesc("Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.");
        squats.setDur(45);
        squats.setPosition("standup");
        backwardKick.setName("Backward Kick");
        backwardKick.setDesc("Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat. ");
        backwardKick.setDur(60);
        backwardKick.setPosition("floor");
        legCurl.setName("Leg Curl");
        legCurl.setDesc("Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.");
        legCurl.setDur(90);
        legCurl.setPosition("standup");
        sidewardBackStretch.setName("Sidewards Back Stretch");
        sidewardBackStretch.setDesc("Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.");
        sidewardBackStretch.setDur(60);
        sidewardBackStretch.setPosition("standup");
        //PUT IN ARRAY
        Exercise[] exercises = {pushups, planks, squats, backwardKick, legCurl, sidewardBackStretch};
        //PRINT
        System.out.println("===== LOOP OF ALL =====");
        for (Exercise x : exercises) {
            System.out.println(x.getName() + "\t\t\tDURATION: " + x.getDur() + " seconds.\n---------------------------------\nDESCRIPTION: " + x.getDesc());
        }
        System.out.println("===== LOOP ONLY ON FLOOR =====");
        for (Exercise x : exercises) {
            if (x.getPosition().toLowerCase().equals("floor")) {
                System.out.println(x.getName() + "\t\t\tDURATION: " + x.getDur() + " seconds.\n---------------------------------\nDESCRIPTION: " + x.getDesc());
            }
        }
        System.out.println("===== LOOP ONLY ON FLOOR AND LONGER THAN 1 Minute =====");
        for (Exercise x : exercises) {
            if (x.getPosition().toLowerCase().equals("floor") && x.getDur() >= 60) {
                System.out.println(x.getName() + "\t\t\tDURATION: " + x.getDur() + " seconds.\n---------------------------------\nDESCRIPTION: " + x.getDesc());
            }
        }
    }
}