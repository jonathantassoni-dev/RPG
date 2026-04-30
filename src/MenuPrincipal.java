import java.util.Scanner;

public class MenuPrincipal {


    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Escolha sua classe:");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Acessar menu de classes");
                    break;
                case 2:
                    System.out.println("Você saiu do RPG!");

            }

        }while(opcao != 0);
    }





}
