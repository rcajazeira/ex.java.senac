import java.util.Scanner;
 
public class SomaArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        
        int[] numeros = new int[5];
 
     
        System.out.println("Digite 5 números inteiros:");
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
 
        
        scanner.close();
 
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
 
        
        System.out.println("A soma de todos os elementos do array é: " + soma);
    }
}
