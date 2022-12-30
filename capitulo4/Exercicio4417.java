import java.util.Scanner;
public class Exercicio4417 {
    public static void main(String[] args) {
        
        int kmPecorrido = 0;
        int litrosGasolina = 0;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        int valor = 0;
        while(valor == 0){

            System.out.println("Digite -1 para sair");

            System.out.println("Quanto KM foram pecorridos? ");
            double s = input.nextInt();
            kmPecorrido += s;

            if(s == -1 || s == -1){
                break;
            } 

            System.out.println("Quantos litros foram abastecidos? ");
            double z = input1.nextInt();
            litrosGasolina += z;
            
            if(s == -1 || s == -1){
                break;
            } 

            double media = s / z;
            
            System.out.printf("O Consumo desta viagem foi %s Quilometros por Litro %n", media);
            System.out.printf("Você ja percorreu %s quilometros e utilizou %s litros de gasolina %n", kmPecorrido, litrosGasolina);

        }
    }
}

