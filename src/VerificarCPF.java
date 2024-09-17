import java.util.Scanner;
 
public class VerificarCPF {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
       
        System.out.print("Digite o número do CPF (somente os dígitos, sem pontos e traços): ");
        String cpf = scanner.nextLine();
 
        
        scanner.close();
 
        
        if (cpf.length() == 11 && cpf.matches("\\d+")) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
