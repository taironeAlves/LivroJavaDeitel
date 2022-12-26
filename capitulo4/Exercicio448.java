public class Exercicio448 {
    public static void main(String[] args) {
        int c = 1;
        int product = 6;
        
        
        while (c <= 5) {
           
            product *= c;
            
            System.out.println(product);
            System.out.println(c);
            
            ++c;
           
        }

        int gender = 1;

        if(gender == 1){
            System.out.println("Woman");
        }else {
            System.out.println("man");
        }
    }
}
