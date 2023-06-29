package br.com.luis.bank.programs;

import java.util.ArrayList;
import java.util.List;

import Utilitarios.Utils;

public class Account {
    private double balance;
    private String password;
    private List<Operation> operations = new ArrayList<Operation>();
    private User user;

    public Account(double balance, String password, User user) {
        this.balance = balance;
        this.password = password;
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void withDraw(double value) {
        if (value > 0 && getBalance() >= value) {
            balance -= value;
            System.out.println("\nSaque efetuado com sucesso!\n");

            Operation operation = new Operation("Saque", this.user.getCpf(), value);

            operations.add(operation);

        } else {
            System.out.println("\nNão foi possivel realizar o saque!\n");
        }

    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("\nDeposito efetuado com sucesso!\n");

            Operation operation = new Operation("Deposito", this.user.getCpf(), value);
            operations.add(operation);

        } else {
            System.out.println("\nNão foi possivel realizar o deposito!\n");
        }

    }

    public void transfer(String target, double value) {
        if (value == 0 || value > balance) {
            System.out.println("Não foi possivel realizar sua transferencia!\n");

        } else {
            balance -= value;
            System.out.println("\nTransferencia efetuada com sucesso!\n");
            Operation operation = new Operation("Transferencia", target, value);
            operations.add(operation);

        }

    }

    public void extract() {
        if (operations.size() > 0) {
            System.out.println("Extrato da conta: \n");

            for (Operation op : operations) {
                System.out.println(op);
            }
        } else {
            System.out.println("\nNenhuma operação realizada!\n");

        }
    }

    @Override
    public String toString() {
        return "\nNome do Usuário: " + this.user.getName() + "\nCPF: " + this.user.getCpf() + "\nSenha: "
                + Utils.hiddenPassword(this.getPassword()) + "\nSaldo: "
                + Utils.doubleToString(this.getBalance());

    }

}
