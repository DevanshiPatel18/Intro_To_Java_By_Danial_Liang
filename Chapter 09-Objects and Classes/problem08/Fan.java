package problem8;

public class Fan {
    
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public int getSpeed(){
        return speed;
    }


    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Fan(){
        speed = 1;
        on = false;
        radius = 5;
    }

    public String toString(){
        if (on)
            return ("The fan speed is "+getSpeed()+" color is "+color+" radius is "+getRadius());
        else
            return ("The fan is off. The fan color is "+color+" radius is "+radius);
    }
}