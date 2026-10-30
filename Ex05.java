import java.util.Scanner;

public class Ex05 {
    
    public static double somaImposto(double taxaImposto, double custo) {
        return custo * taxaImposto;
    }
  
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
     
     double valor;
     double imposto;
     
     System.out.println("Digite o valor original do produto:");
     valor = scanner.nextDouble();
     
     while(valor <=0) {
         System.out.println("O valor precisa ser maior que 0.");
         valor = scanner.nextDouble();
     }
     
     System.out.println("Digite a taxa do imposto:");
     imposto = scanner.nextDouble();
     
     while(imposto <= 0) {
         System.out.println("O valor precisa ser maior que 0.");
         imposto = scanner.nextDouble();
     }
     
     double imp = imposto;
     
     imposto = imposto / 100;
     double preco = valor + somaImposto(imposto, valor);
     
     System.out.println("====RESULTADOS====");
     System.out.println("Valor original do produto R$: " + valor);
     System.out.println("Taxação: " + imp + "%");
     System.out.println("Valor com impostos R$: " + preco);
    }
}
