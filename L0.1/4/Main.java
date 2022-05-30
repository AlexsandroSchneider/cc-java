public class Main{
    public static void main(String[] args){
        Compra c1 = new Compra("Feijão", 5.6f), c2 = new Compra("Livro");
        Compra c3 = new Compra("Arroz", 2.5f, 3);
        System.out.printf("Produto: %s\nPreço: %.2f\nQuantidade: %d\n\n", c1.getNomeProduto(), c1.getPreco(), c1.getQuantidade());
        System.out.printf("Produto: %s\nPreço: %.2f\nQuantidade: %d\n\n", c2.getNomeProduto(), c2.getPreco(), c2.getQuantidade());
        System.out.printf("Produto: %s\nPreço: %.2f\nQuantidade: %d\n\n", c3.getNomeProduto(), c3.getPreco(), c3.getQuantidade());
    }
}