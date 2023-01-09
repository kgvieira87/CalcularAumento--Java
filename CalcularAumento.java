import java.util.Scanner;

public class CalcularAumento {
    public static void main(String[] args) throws Exception {

      Scanner numeros = new Scanner (System.in);
      double resultado;

      System.out.println("Digite o valor do produto");
      double valorProduto = numeros.nextDouble();

       System.out.println("Digite a taxa de aumento");
      double taxaAumento = numeros.nextDouble();

      resultado = (valorProduto + valorProduto * taxaAumento /100);  
       
              
        System.out.println("Valor original do produto: " + valorProduto );
          System.out.println("Valor da taxa de aumento: " + taxaAumento );
            System.out.println("Valor final do produto: " + resultado );
    }
}

