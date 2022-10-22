import java.util.Scanner;
/**
 * Exercicio230
 */
public class Exercicio230 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num, unid, dezena, centena,unidMilhar,dezMilhar;
        System.out.print("Digite um nmúmero com 5 digitos: ");
        num = input.nextInt();
        //96754
        dezMilhar = num/10000;
        unidMilhar = (num%10000)/1000;
        centena = (num%1000)/100;
        dezena = (num%100)/10;
        unid = num%10;
        
        System.out.println(dezMilhar+" "+unidMilhar+" "+centena+" "+dezena+" "+unid);
    }
}