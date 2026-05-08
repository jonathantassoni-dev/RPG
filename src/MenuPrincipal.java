import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuPrincipal() {
        MenuClasses menuClasses = new MenuClasses(scanner);
        int opcao;

            System.out.println("\n------ MENU ------");
            System.out.println("1. Escolha sua classe");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //Acessa o menu de classes
                    menuClasses.exibirMenuClasses();
                    break;
                case 0:
                    System.out.println("Você saiu do RPG!");
                    break;
                default:
                    System.out.println("Valor Incorreto!");
                    break;
            }
    }
}
