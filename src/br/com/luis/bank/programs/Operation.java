package br.com.luis.bank.programs;

import Utilitarios.Utils;

public class Operation {
    private String type;
    private String target;
    private double amount;

    public Operation(String type, String target, double amount) {
        this.type = type;
        this.target = target;
        this.amount = amount;

    }

    public String getType() {
        return type;
    }

    public String getTarget() {
        return target;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Operação realizada: " + this.getType() + " de " + Utils.doubleToString(this.getAmount()) + " ás "
                + "[" + Utils.now.format(Utils.format) + "]";
    }

}
