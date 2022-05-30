class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    Data nascimento;

    public Pessoa(String name, int x, int y, int z){
        this.nome = new String(name);
        this.nascimento = new Data(x, y, z);
    }
    public Pessoa(){
        this.nome = new String("John Doe");
        this.idade = 25;
        this.nascimento = new Data();
    }

    void print(){
        System.out.println("Idade: " + this.idade);
    }
    double imc(){
        return this.peso/(this.altura * this.altura);
    }
    void imprimeImc(){
        System.out.println("IMC: " + this.imc());        
    }
}

public class Teste {
    public static void main(String args[]) {
        Pessoa alguem = new Pessoa("Tati" ,21, 1, 1990);
        alguem.idade = 25;
        alguem.peso = 63.5;
        alguem.altura = 1.75;
        //System.out.printf("%d anos de idade\nPeso: %.1fkg\nAltura: %dcm", alguem.idade, alguem.peso, alguem.altura);

        Pessoa nova = new Pessoa("Alex", 27, 9, 1994);
        nova.altura = 1.50;
        nova.idade = 18;
        nova.peso = 59.8;
        //System.out.printf("\n\n%d anos de idade\nPeso: %.1fkg\nAltura: %dcm\n", nova.idade, nova.peso, nova.altura);
        nova.print();
        alguem.print();
        alguem.imprimeImc();
        System.out.println("Nome: " + nova.nome + ", dia de nascimento: " + nova.nascimento.dia);
    }
}
