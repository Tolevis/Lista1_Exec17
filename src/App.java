import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);    
 
        System.out.println("Digite o tamanho da área em metros quadrados");
        double area = entrada.nextDouble();
       
        double tintaNecessaria = Math.ceil(area * 1.1/6.0);
       
        int latas = (int) Math.ceil(tintaNecessaria / 18.0);
        
        int galoes = (int) Math.ceil(tintaNecessaria / 3.6);
        
        int latasMistas = (int) (tintaNecessaria / 18.0);
        int galoesMistos = (int) Math.ceil((tintaNecessaria % 18.0) / 3.6);
        
        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;
        double precoMisto = latasMistas * 80.0 + galoesMistos * 25.0;
        
        System.out.println("\nOpção 1 - Apenas latas de 18 litros:");
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço total: R$" + precoLatas);
        
        System.out.println("\nOpção 2 - Apenas galões de 3,6 litros:");
        System.out.println("Quantidade de galões: " + galoes);
        System.out.println("Preço total: R$" + precoGaloes);
        
        System.out.println("\nOpção 3 - Misturar latas e galões:");
        System.out.println("Quantidade de latas: " + latasMistas);
        System.out.println("Quantidade de galões: " + galoesMistos);
        System.out.println("Preço total: R$" + precoMisto);
        entrada.close();
    }
}