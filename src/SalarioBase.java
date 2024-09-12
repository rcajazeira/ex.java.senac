import java.util.Scanner;

public class SalarioBase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        double valorSalario;
        String desempenho;

        System.out.println("Nome do funcionário por favor?");
        nomeFuncionario = sc.nextLine();

        System.out.println("Qual valor do salário do funcionário?");
        valorSalario = sc.nextDouble();

        sc.nextLine();

        System.out.println("Qual foi o desempenho do funcionário, Ótimo, Bom ou Regular?");
        desempenho = sc.nextLine().trim();

        System.out.println("Desempenho lido: " + desempenho);

        switch (desempenho) {
            case "Ótimo":
                valorSalario = (valorSalario * 0.10) + valorSalario;
                break;
            case "Bom":
            valorSalario = (valorSalario * 0.05) + valorSalario;
                break;
                case "Regular":
           System.out.println("Tente melhorar seu desempenho");
                break;
            
            default:
            System.out.println("Desempenho inválido");
                break;
        }
        System.out.println("Então o " + nomeFuncionario + " ficou com esse desempenho " + desempenho + " e salário " + valorSalario);

        sc.close();
    } 
}

