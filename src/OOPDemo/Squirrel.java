package OOPDemo;

public class Squirrel {
    
    public static void main(String[] args) {
        SquirrelDemo squirrel1 = new SquirrelDemo(200, 100, "brown", "Gary");
        SquirrelDemo squirrel2 = new SquirrelDemo(50, 48, "black", "Gary");
        SquirrelDemo squirrel3 = new SquirrelDemo(400, 10, "grey", "Gary");

        squirrel1.climb();
        squirrel2.climb();
        squirrel3.climb();

        squirrel1.eat(5);
        squirrel1.getHealth();

        squirrel2.changeName("Bob");
        

    }
}