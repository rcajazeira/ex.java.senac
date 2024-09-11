import java.util.Scanner;
public class emprestimoBancario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double valorEmprestimo;
        int numeroParcelas;
        double salario;
        double limiteParcelas;

        System.out.println("Qual valor do emprestimo?");
        valorEmprestimo = sc.nextDouble();

        System.out.println("Qual a quantidade de parcelas?");
        numeroParcelas = sc.nextInt();

        System.out.println("Qual salário do solicitante?");
        salario = sc.nextDouble();

        limiteParcelas = salario * 0.30;

        if (valorEmprestimo <= limiteParcelas) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();


    }
    
}
