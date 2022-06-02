public class Test1 {

    public void name() {
        int k = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("My name is Rajesh " + k);
                k++;
            }
        }
    }

    public void number() {
        for (int a = 100; a >= 0; a--) {
            System.out.println(a);
        }

    }

    public void additions() {
        int sum = 0;
        for (int b = 0; b < 10; b++) {

            sum = b + sum;

        }
        System.out.println("Sum of 9 number is " + sum);
    }
}
