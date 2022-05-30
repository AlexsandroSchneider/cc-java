import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Compra at2 = new Compra("algo", 0f, 0);
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        at2.setNomeProduto(scan.nextLine());
        System.out.print("Digite o preço do produto: ");
        at2.setPreço(scan.nextFloat());
        System.out.print("Digite a quantidade de estoque do produto: ");
        at2.setQuantidade(scan.nextInt());
        scan.close();
        at2.imprimeResumo();
    }
}