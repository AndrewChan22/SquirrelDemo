package OOPDemo;
public class SquirrelDemo {

    // instance variable
    int weight;
    int height;
    String colour;
    boolean alive;
    String name;
    double health;;

    // constructor
    public SquirrelDemo(int setWeight, int setHeight, String setColour, String setName) {
        this.weight = setWeight;
        this.height = setHeight;
        this.colour = setColour;
        this.name = setName;
        this.health = 100;
        this.alive = true;
    }

    // instance methods

    public void climb() {
        System.out.println(name + " is climbing...");
    }

    public double eat(double addHealth) {
        return health += addHealth;
    }

    public void getHealth() {
        System.out.println(name + "'s current health: " + health);
    }

    public String changeName(String newName) {
        name = newName;
        return name;
    }

    
    
}