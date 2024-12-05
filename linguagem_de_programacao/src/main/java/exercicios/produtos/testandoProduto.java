package exercicios.produtos;
import java.util.Scanner;

public class testandoProduto {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        Produto product = new Produto();

        String nomep = rd.nextLine();
        double precop = Double.parseDouble(rd.nextLine());
        int codp = Integer.parseInt(rd.nextLine());

        product = new Produto(nomep, precop, codp);

        System.out.println(product.toString());
    
    }

    
}
