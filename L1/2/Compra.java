class Compra {
    private String nomeProduto;
    private float preço;
    private int quantidade;
    public Compra(String produto, float preço, int quantidade) {
        this.nomeProduto = produto;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    public void setNomeProduto(String novo) {
        this.nomeProduto = novo;
    }
    public String getNomeProduto() {
        return this.nomeProduto;

    }
    public void setPreço(float preço) {
        this.preço = preço;
    }
    public float getPreço() {
        return this.preço;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    // Imprime todas as propriedades da classe
    public void imprimeResumo() {
        System.out.printf("Descrição: %s; Preço: R$ %.2f; Quantidade: %d\n", this.nomeProduto, this.preço, this.quantidade);
    }
}