import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Post at5 = new Post("John", 1, "Random");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do autor: ");
        at5.setNome(scan.nextLine());
        System.out.print("Digite a ID do autor: ");
        at5.setId(Integer.parseInt(scan.nextLine())); // parseInt pra evitar bug. nextInt lê até antes do \n, então nextline passa direto.
        System.out.print("Digite o texto: ");
        at5.setTexto(scan.nextLine());
        scan.close();
        at5.imprimeResumo();
    }
}