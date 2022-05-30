import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Circulo at5 = new Circulo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        at5.setRaio(scan.nextInt());
        scan.close();
        System.out.printf("\nRaio: %d cm\nÁrea: %.2f cm²\nCírcunferência: %.2f cm\n\n", at5.getRaio(), at5.area(), at5.circunf());
    }
}