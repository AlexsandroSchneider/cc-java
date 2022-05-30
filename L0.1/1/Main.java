import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Autor novo = new Autor();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do autor: ");
        novo.nome = scan.nextLine();
        System.out.print("Digite a id do autor: ");
        novo.id = scan.nextInt();
        scan.close();
    }
}