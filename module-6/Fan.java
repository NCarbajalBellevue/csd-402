/*
 * Name: Natalia Carbajal
 * Date: 9/20/2026
 * Assignment: Module 6.2 
 */

public class Fan {

    // Fan speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan information
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Sets the default fan values
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Allows the fan to be created with custom values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Displays the current fan information
    @Override
    public String toString() {
        return "Fan speed: " + speed
                + ", on: " + on
                + ", radius: " + radius
                + ", color: " + color;
    }
}

// Tests the Fan class
class FanTest {

    public static void main(String[] args) {

        // Fan using the default constructor
        Fan fan1 = new Fan();

        System.out.println("Default Fan:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
        System.out.println();

        // Fan using the constructor with arguments
        Fan fan2 = new Fan(Fan.FAST, true, 10, "black");

        System.out.println("Custom Fan:");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
        System.out.println();

        // Change the second fan's values
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(8);
        fan2.setColor("blue");

        System.out.println("Updated Fan:");
        System.out.println(fan2);
    }
}