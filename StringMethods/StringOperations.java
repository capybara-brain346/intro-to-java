package StringMethods;

public class StringOperations {
    public static void main(String[] args) {
        String str = "Now is the winter of our discontent";

        System.out.println("String: "+str);
        System.out.println("Length: "+str.length());
        System.out.println("Char at 5: "+str.charAt(5));
        System.out.println("Substring: "+str.substring(4,12));
        System.out.println("Index of d: "+str.indexOf("d"));
        System.out.println("Uppercase: "+str.toUpperCase());
    }
}
