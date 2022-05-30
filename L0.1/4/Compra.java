public class Compra {
    private String nomeProduto;
    private float preco;
    private int quantidade;

    public Compra(String produto, float preco, int quantidade) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Compra(String produto, float preco) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.quantidade = 0;
    }
    public Compra(String produto) {
        this.nomeProduto = produto;
        this.preco = 5.0f;
        this.quantidade = 0;
    }
    public Compra() {
        this.nomeProduto = "Nenhum";
        this.preco = 2.0f;
        this.quantidade = 0;
    }
    
    String getNomeProduto(){
        return this.nomeProduto;
    }
    void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }
    float getPreco(){
        return this.preco;
    }
    void setPreco(float preco){
        this.preco = preco;
    }
    int getQuantidade(){
        return this.quantidade;
    }
    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}