package br.com.luis.bank.programs;

import Utilitarios.Utils;

public class User {
    private String name;
    private String cpf;

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;

    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

}
