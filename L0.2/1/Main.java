import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Pessoa at1 = new Pessoa();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        at1.setNome(scan.nextLine());
        System.out.print("Digite a idade: ");
        at1.setIdade(scan.nextInt());
        System.out.print("Digite o peso: ");
        at1.setPeso(scan.nextFloat());
        scan.close();
        at1.imprimeDados();
    }
}