import java.util.Scanner;
public class Movimento {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Digite a distância percorrida em metros: ");
        double distancia = scanner.nextDouble();
 
        
        System.out.print("Digite o tempo gasto em segundos: ");
        double tempo = scanner.nextDouble();
 
       
        scanner.close();
 
        
        double velocidadeMedia = distancia / tempo;
 
        
        if (velocidadeMedia < 5) {
            System.out.println("Movimento lento");
        } else if (velocidadeMedia >= 5 && velocidadeMedia <= 15) {
            System.out.println("Movimento moderado");
        } else {
            System.out.println("Movimento rápido");
        }
    }
    
}
