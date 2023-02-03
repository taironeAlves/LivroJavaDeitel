/**
 * Exercicio4431
 */
public class Exercicio4431 {

    public static void main(String[] args) {
        int integerNumber = 1101001100;
        int multiplicador = 1;
        int decimal = 0;
        int total = 0;
        while(integerNumber != 0) {
            int ultimoNumero = integerNumber % 10;
            if(multiplicador == 1){
                decimal = ultimoNumero * 1;
                total += decimal;
                multiplicador += 1;
            }else {
                decimal = ultimoNumero * multiplicador;
                total += decimal;
                multiplicador *= 2; 
            }
            integerNumber /= 10;
        }
        System.out.printf("O numero decimail é %s%n", total);
    }
}