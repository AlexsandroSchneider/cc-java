import java.util.Scanner;

class Autor {
    public String nome;
    public int id;

    String getNome(){
        return this.nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id = id;
    }
    void carregaDoTeclado(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do autor: ");
        this.nome = scan.nextLine();
        System.out.print("Digite a ID do autor: ");
        this.id = scan.nextInt();
        scan.close();
    }
}
    