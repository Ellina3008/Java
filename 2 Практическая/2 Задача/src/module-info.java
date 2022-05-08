import java.util.Random;
import java.util.Arrays;
 
class Test {
    private static final int n = 6;
 
    public static void main(String[] args) {
        int[] a = new Random().ints(n, -10, 11).toArray();
        int[] b = new int[n];
 
        Arrays.setAll(b, i -> { return (a[i] < 0)? a[i] : 0; });
        Arrays.sort(b);
 
        print_array(a);
        print_array(b);
    }
 
    private static void print_array(int[] a) {
        Arrays.stream(a).forEach(e -> System.out.printf("% 4d", e));
        System.out.println();
    }
}
