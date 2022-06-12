public class Appendarray {
    public static void main(String[] args) {
        int [] a = {1,2,4,3};
        int [] b = {5,6,8,7};
        int [] c = new int[a.length+b.length];
        int m=0;
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
            m++;
        }
        for (int j = 0; j < b.length; j++) {
            c[m++]=b[j];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
