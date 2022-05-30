import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Retangulo at3 = new Retangulo(7, 4);
        at3.imprimeDimensoes();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a nova base do retangulo: ");
        at3.setBase(scan.nextInt());
        System.out.print("Digite a nova altura do retangulo: ");
        at3.setAltura(scan.nextInt());
        scan.close();
        at3.imprimeDimensoes();
    }
}