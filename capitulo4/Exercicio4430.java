/**
 * Exercicio4430
 */
public class Exercicio4430 {

    public static void main(String[] args) {
        
        int num  =  12345;

        int dig1 = num % 10000;
        int dig2 = num / 1000;
        int dig3 = num / 100;
        int dig4 = num % 100;
        int dig5 = num % 10;

        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
        System.out.println(dig4);
        System.out.println(dig5);

    }
}