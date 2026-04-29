import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;


        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Escolha de classe:");
            System.out.println("2. Opção 2");
            System.out.println("0. Sair");


            opcao = scanner.nextInt();



        }while(opcao != 0);


    }
}