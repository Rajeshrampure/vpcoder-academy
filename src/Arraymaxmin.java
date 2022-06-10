import java.sql.SQLOutput;

public class Arraymaxmin {
    public static void main(String[] args) {
        int[] a={1,25,-1,66,0,55};
        int max = a[0];
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }
}
