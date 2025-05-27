package array;

public class Array1 {
    public static void main(String[] args) {

        int[] a; // stack, address
        a = new int[5]; // heap
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int[] b = new int[] {1,2,3,4,5};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        int[] c = {1,2,3,4,5};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
