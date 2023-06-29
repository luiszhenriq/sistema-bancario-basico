package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    static NumberFormat balanceFormat = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double balance) {
        return balanceFormat.format(balance);
    }

    public static String hiddenPassword(String password) {
        StringBuilder hiddenPassword = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            hiddenPassword.append("*");
        }

        return hiddenPassword.toString();
    }

    public static LocalDateTime now = LocalDateTime.now();
    public static DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

}
