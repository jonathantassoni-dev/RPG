import java.util.Scanner;

public class MenuPrincipal {


    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

            System.out.println("\n------ MENU ------");
            System.out.println("1. Escolha sua classe:");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Acessar menu de classes");
                    break;
                case 0:
                    System.out.println("Você saiu do RPG!");
                    break;
                default:
                    System.out.println("Valor Incorreto!");
                    break;
            }
            scanner.close();
    }





}
