import java.util.Scanner;

public class MenuClasses {


    public void exibirMenuClasses() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("\n------ CLASSES ------");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Paladino");
        System.out.println("0. <Voltar>");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Mostra Guerreiro");
                break;
            case 2:
                System.out.println("Mostra Mago");
                break;
            case 3:
                System.out.println("Mostra Paladino");
                break;
            case 0:
                System.out.println("Volta o menu");
                break;
            default:
                System.out.println("Valor Invalido!");
                break;
        }


    }

    public void exibirStatusClasses() {

    }
}
