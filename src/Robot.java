public class Robot {
    private int MaxSpeed;
    public Robot(){
        this.MaxSpeed = 1;
    }
    public int getMaxSpeed(){
        return MaxSpeed;
    }

    public void setMaxSpeed(int MaxSpeed) {
        if(MaxSpeed >= 0)
        this.MaxSpeed = MaxSpeed;
        else
            this.MaxSpeed = 0;
    }
    public void travel(){
        System.out.println(" the robot moves by " +MaxSpeed + " unit");
    }
}
