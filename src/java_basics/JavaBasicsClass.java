public class JavaBasicsClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int sum1 = a + b;
        System.out.println(sum1 + "\n");

        double c = 1;
        double d = 5;
        double sum2 = c + d;
        System.out.println(sum2);
        System.out.println(a +d);
        double div = d/c;

        System.out.println((int)div);

        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println(q);
        q = y;
        System.out.println(q);

        final double SALES_TAX = 0.1;
        double chai = 3.35;
        double latte = 6.735;
        double mocha = 5.859;
        double subtotal = 3 * chai + 4 * latte + 2 * mocha;
        System.out.printf("%.2f%n", subtotal + subtotal * SALES_TAX);



    }
}
