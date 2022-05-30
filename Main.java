import java.util.Scanner;

class First {
    int a, b, c, d;

    int soma(int x, int y){
        return x+y;
    }
    void printar(int x){
        System.out.println("Minha idade é "+x);
    }
    String nome(String x){
        String nome = x;
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        int Algo = 1;
        String nome = "Alexsandro";
        First objeto = new First();
        System.out.println(objeto.soma(12, 13) + " " + nome + " " + Algo);
        objeto.printar(27);
        Scanner s = new Scanner(System.in);
        String asd = s.nextLine();
        int[] vetor = new int[25];
        for(int i=0; i<vetor.length; i++){
            vetor[i] = i*10;
        }
        for(int i=0; i<vetor.length; i++){
            System.out.println(i + " " + vetor[i]);;
        }
    }
}