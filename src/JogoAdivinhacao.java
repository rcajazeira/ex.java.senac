import java.util.Random;
import java.util.Scanner;
 
public class JogoAdivinhacao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        Random random = new Random();
 
        
        int numeroAleatorio = random.nextInt(100) + 1;
 
        int palpite = 0;
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu gerei um número entre 1 e 100. Tente adivinhar qual é!");
 
        
        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
 
            
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        }
 
       
        scanner.close();
    }
}