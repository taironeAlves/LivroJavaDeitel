import java.util.Scanner;
public class Exercicio4417 {
    public static void main(String[] args) {
        
        int kmPecorrido = 0;
        int litrosGasolina = 0;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        String valor = "q";
        while(valor != "q"){

            System.out.println("Digite q para sair");
            
            System.out.println("Quanto KM foram pecorridos? ");
            input.nextInt();

            System.out.println("Quantos litros foram abastecidos? ");
            input1.nextInt();

            if(input.nextInt() == "q" or input1.nextInt() == "q"){
                
            } 

        }
    }
}
