import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("DIGITE O ANO DE SEU NASCIMENTO: ");
        int anoNascimento = s.nextInt();
        s.close();
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Ano atual (" + anoAtual + ") - ano de nascimento (" + anoNascimento + ") = idade (" + (anoAtual-anoNascimento) + ")");
    }
}
