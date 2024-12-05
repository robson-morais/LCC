package exercicios.produtos;

import java.util.Scanner; 

public class testandoProduto2 { 

    // Aplicando os descontos ao valor inicial do produto:
    public static double calculaValorComDesconto(double valorProduto){

        if (valorProduto < 50){ 
            return (valorProduto); 

        } else if (valorProduto < 100){ 
            return (valorProduto - (valorProduto*0.05)); 
            //5% de desconto se valor entre 50 e 100 (sem incluir 100) 

        } else { 
            return (valorProduto - (valorProduto*0.10)); 
            //10% de desconto 
        }
    } 

    // Calculando quanto foi descontado do valor total da compra:
    public static double calculaDescontos(Produto [] produtos){

        double valorFinalSemDesconto = 0;
        double valorFinalComDesconto = 0;

        for (int i=0; i<produtos.length;i++){
            valorFinalSemDesconto += produtos[i].getPreco();
            valorFinalComDesconto += calculaValorComDesconto(produtos[i].getPreco());
        }
        double descontosAplicados = valorFinalSemDesconto - valorFinalComDesconto;
        return descontosAplicados;

    }
    // Verificando qual produto comprado teve o maior desconto:
    public static String verificaProdutoComMaiorDesconto(Produto [] produtos){
        int cont = produtos.length;
        String produtoComMaiorDesconto = "";
        double [] valoresComDesconto = new double[cont];
        for (int k=0; k<cont; k++){
            valoresComDesconto[k] = calculaValorComDesconto(produtos[k].getPreco());
        }
        double maiorValor = 0;
        for (int i=0; i<cont; i++){
            if (valoresComDesconto[i]>maiorValor){
                maiorValor = valoresComDesconto[i];
                produtoComMaiorDesconto = produtos[i].getNome();
            }
        
        }
        return produtoComMaiorDesconto;
    }


    public static void main(String [] args){

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos produtos você quer comprar?"); 
        int quant = Integer.parseInt(leitor.nextLine()); 
        Produto [] produtos = new Produto [quant]; 

        double valorSemDesconto = 0;

        for (int k=0; k<quant; k++){ 

            Produto p = new Produto();

            System.out.println("Qual o nome do produto?"); 
            p.setNome(leitor.nextLine()); 

            System.out.println("Qual o preço original do produto?"); 
            p.setPreco(Double.parseDouble(leitor.nextLine())); 

            double valorComDesconto = calculaValorComDesconto(p.getPreco()); 
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n",valorComDesconto); 

            produtos[k] = p;
            valorSemDesconto += p.getPreco();
            
        }

        
        
        System.out.println("Produto que obteve o maior desconto: "+verificaProdutoComMaiorDesconto(produtos)+"\n"+
        "Valores descontados nesta compra: R$ "+calculaDescontos(produtos));

        double descontosAplicados = calculaDescontos(produtos);
        double valorComDesconto = valorSemDesconto - descontosAplicados;

        System.out.println("O valor total sem descontos era de: R$ "+valorSemDesconto+"\n"
        +"Valor final com descontos aplicados: R$ "+valorComDesconto);
    
        leitor.close(); 
    } 
} 