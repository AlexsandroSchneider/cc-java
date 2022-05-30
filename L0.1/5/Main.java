public class Main{
    public static void imprimeDados(Pessoa x){
        System.out.printf("Nome: %s\nIdade: %d\nPeso: %.1f\n\n", x.getNome(), x.getIdade(), x.getPeso());
    }
    public static void main(String[] args){
        Pessoa fulano = new Pessoa("Elon", 50, 82.5);
        Pessoa sicrano = new Pessoa("Carla", 19);
        Pessoa beltrano = new Pessoa("João");
        imprimeDados(fulano);
        imprimeDados(sicrano);
        imprimeDados(beltrano);
    }
}