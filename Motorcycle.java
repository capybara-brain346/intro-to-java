public class Motorcycle {
    String make;
    String color;
    boolean engineState;

    void startEngine(){
        if (engineState){
            System.out.print("The engine is already on!");
        } else{
            engineState = true;
            System.out.println("The engine is on now!");
        }
    }

    void showAtts(){
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState){
            System.out.println("The engine is on.");
        } else {
            System.out.println("The engine is off");
        }
    }
}
