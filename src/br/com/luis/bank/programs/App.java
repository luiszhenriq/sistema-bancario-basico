package br.com.luis.bank.programs;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("\nDigite seu nome: ");
        String userName = sc.nextLine();
        System.out.println("\nDigite sua senha: ");
        String userPassword = sc.next();
        System.out.println("\nDigite seu CPF: ");
        String userCpf = sc.next();

        User user = new User(userName, userCpf);
        Account account = new Account(0, userPassword, user);
        System.out.println(account.toString());

        do {
            System.out.println("- - - - - - - - Bem vindo ao Banco - - - - - - - -");
            System.out.println();
            System.out.println("Selecione a opção que deseja realizar\n- - - - - - - - - - - - - - - - - - -");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Extrato");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nQual o valor que deseja sacar?");
                    double withDrawValue = sc.nextDouble();
                    account.withDraw(withDrawValue);
                    break;
                case 2:
                    System.out.println("\nQual valor deseja depositar?");
                    double depositValue = sc.nextDouble();
                    account.deposit(depositValue);
                    break;
                case 3:
                    System.out.println("\nPara que conta deseja efetuar a transferencia?");
                    String numberAccount = sc.next();
                    System.out.println("\nQual valor deseja transferir?");
                    double transferValue = sc.nextDouble();
                    account.transfer(numberAccount, transferValue);
                    break;
                case 4:
                    account.extract();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
            }
        } while (option != 5);
    }
}
