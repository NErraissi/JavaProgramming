public class MethodExemple {
    public static void main(String[] args) {
        int[] b = MyArrayInt(3);
        System.out.println(b[1]);

    }
    public static int[] MyArrayInt(int number){
        int[] a = new int[number];
        for(int i = 0; i < number; i++)
            a[i] = i;
        return a;

    }
}
