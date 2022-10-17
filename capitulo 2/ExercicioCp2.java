import java.util.Scanner;
public class ExercicioCp2 {
    
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int x;
    int y;
    int z;
    int result;

    System.out.print("Digite o primeiro valor: ");
    x = input.nextInt();

    System.out.print("Digite o segundo valor: ");
    y = input.nextInt();

    System.out.print("Digite o terceiro valor: ");
    z = input.nextInt();

    result = x * y * z;

    System.out.printf("Product is %d%n ", result);

}
}
