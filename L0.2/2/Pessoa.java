public class Pessoa {
    private String nome;
    private int idade;
    private float peso;

    public Pessoa() {
        this.nome = "John Doe";
        this.idade = 30;
        this.peso = 71.5f;
    }

    String getNome() {
        return this.nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    int getIdade() {
        return this.idade;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    float getPeso() {
        return this.peso;
    }
    void setPeso(float peso) {
        this.peso = peso;
    }
    // Imprime todas as propriedades da classe
    void imprimeDados() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + ", Peso: " + this.peso);
    }
}