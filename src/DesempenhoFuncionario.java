import java.util.Scanner;

public class DesempenhoFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String funcionario;
        int pontuacao;
        

        System.out.println("Digite o nome do funcionário");
        funcionario = sc.nextLine();

        System.out.println("Qual foi a pontuação dele?");
        pontuacao = sc.nextInt();

        if (pontuacao >= 0 && pontuacao <= 10 ) {
            System.out.println("Insatisfatório");

        } else if (pontuacao >= 11 && pontuacao <=30) {
            System.out.println("Regular");
        } else if (pontuacao >= 31 && pontuacao <= 50) {
        System.out.println("Bom");
    } else if (pontuacao >= 51 && pontuacao <= 100 ) {
        System.out.println("Ótimo");
    } else{
        System.out.println("Pontuação fora do intervalo permitido");

    }

    System.out.println("Então o funcionário " + funcionario + ", ficou com a nota " + pontuacao + ".Gabriel");

    sc.close();
    
        }
        
}
