package exercicios.refeicoes;

import java.util.Scanner;

public class testaRefeicaoRu { 
    public static void main(String[] args) { 

        Scanner leitor = new Scanner(System.in); 
        System.out.println("Quantas refeições foram servidas hoje?"); 
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());

        RefeicaoRealizada[] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine(); 
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOCO ou JANTAR");
            String tipoRefeicao = leitor.nextLine(); 
            System.out.println("Valor da refeição:");
            double preco = Double.parseDouble(leitor.nextLine());
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao, preco); 
            System.out.printf("%s\n", refeicoes[k].toString()); 
        }
        
        int contAlmoco = 0;
        double gastosAlmocos = 0;
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            String ref = refeicoes[k].getTipoRefeicao();
            if (ref.equalsIgnoreCase("almoco")){
                contAlmoco++;
                gastosAlmocos += refeicoes[k].getPrecoRefeicao();
            }
        }
        System.out.printf("Quantidade de refeiçoes do tipo ALMOÇO: %d\n",contAlmoco);
        System.out.println("Gastos com almoços: R$ "+gastosAlmocos);

        boolean cafe = false;
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            String ref = refeicoes[k].getTipoRefeicao();
            if (ref.equalsIgnoreCase("cafe")){
                cafe = true;
                break;
            }
        }
        if (cafe){
            System.out.println("SIM, houve CAFÉ");
        } else {
            System.out.println("NÃO houve CAFÉ");
        }



        System.out.printf("FIM DO PROGRAMA");
        leitor.close(); 
    }
} 