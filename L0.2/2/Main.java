import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Pessoa at2 = new Pessoa();
        at2.imprimeDados();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        at2.setNome(scan.nextLine());
        System.out.print("Digite a idade: ");
        at2.setIdade(scan.nextInt());
        System.out.print("Digite o peso: ");
        at2.setPeso(scan.nextFloat());
        scan.close();
        at2.imprimeDados();
    }
}