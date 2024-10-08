public class Main {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.color = "Red";
        m.make = "Honda";
        m.engineState = false;
        m.showAtts();
        m.startEngine();
        m.showAtts();
    }
}
