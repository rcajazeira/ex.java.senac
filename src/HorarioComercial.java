import java.util.Scanner;
 
public class HorarioComercial {
    public static void main(String[] args) {
        8
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Digite a hora em formato de 24 horas (por exemplo, 14 para 14:00): ");
        int hora = scanner.nextInt();
 
       
        scanner.close();
 
        
        if (hora >= 9 && hora < 18) {
            System.out.println("A hora " + hora + " está dentro do horário comercial.");
        } else {
            System.out.println("A hora " + hora + " não está dentro do horário comercial.");
        }
    }
}
