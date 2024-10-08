package Variables;

public class Main {
    public static void main(String[] args) {
        SimpleVars smv = new SimpleVars("Harry Potter",true);
        System.out.printf("%d, %s, %b",smv.count, smv.title,smv.isAsleep);
    }
}
