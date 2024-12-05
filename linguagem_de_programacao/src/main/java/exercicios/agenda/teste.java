package exercicios.agenda;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String nome = rd.nextLine();
        String sobrenome = rd.nextLine();
        String dominio = rd.nextLine();
        Email email = new Email(nome,sobrenome,dominio);
        System.out.println(email.toString());

    }
}
