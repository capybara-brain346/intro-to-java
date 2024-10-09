package Vehicle;

public class RangeClass {
    static int[] makeRange(int low, int high) {
        int[] range = new int[high - low + 1];
        for (int i = low; i < high; i++) {
            range[i] = i+1;
        }
        return range;
    }

    public static void main(String[] args) {
        int[] range = makeRange(1,10);

        for (int i : range){
            System.out.println(i);
        }
    }
}
