import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, fat = 1;
        int contagem = 1;

        do{
            System.out.println("Digite um número:");
            numero = entrada.nextInt();

            for(int i = 1; i <= numero; i++){
                fat = fat * i;
            
                
            
            }
                
            System.out.println("!" + numero + "=" + fat);
        }while(contagem < 2);

    

    }
    
}
