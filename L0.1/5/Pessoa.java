class Pessoa {
    private String nome;
    private double peso;
    private int idade;

    public Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    public Pessoa(String nome, int idade){
        this(nome, idade, 1.0);
    }
    public Pessoa(String nome){
        this(nome, 1);
    }
    String getNome(){
        return this.nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    double getPeso(){
        return this.peso;
    }
    void setPeso(double peso){
        this.peso = peso;
    }
    int getIdade(){
        return this.idade;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
}
    