import java.util.Scanner;

public class MenuClasses {
    Scanner scanner = new Scanner(System.in);
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    int opcao;

    public void exibirMenuClasses() {
        System.out.println("\n------ CLASSES ------");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Paladino");
        System.out.println("0. Voltar");
        exibirStatusClasses();
        }

    public void exibirStatusClasses() {
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                Guerreiro g1 = new Guerreiro();
                System.out.println("\n------ GUERREIRO ------");
                System.out.println("Vida: " + g1.getVida());
                System.out.println("Stamina: " + g1.getEstamina());
                System.out.println(String.format("Bloqueio: %.0f%%", g1.getBLOQUEIO() * 100));
                break;
            case 2:
                Mago m1 = new Mago();
                System.out.println("\n------ MAGO ------");
                System.out.println("Vida: " + m1.getVida());
                System.out.println("Mana: " + m1.getMana());
                System.out.println(String.format("Bloqueio: %.0f%%", m1.getBLOQUEIO() * 100));
                break;
            case 3:
                Paladino p1 = new Paladino();
                System.out.println("\n------ PALADINO ------");
                System.out.println("Vida: " + p1.getVida());
                System.out.println("Estamina: " + p1.getEstamina());
                System.out.println("Mana: " + p1.getMana());
                System.out.println(String.format("Bloqueio: %.0f%%", p1.getBLOQUEIO() * 100));
                break;
            case 0:
                //Volta o menu
                menuPrincipal.exibirMenuPrincipal();
                break;
            default:
                System.out.println("Valor Invalido!");
                break;
        }
    }

    public void confirmarClasse() {
        //Criar confirmação de classe
    }
}
