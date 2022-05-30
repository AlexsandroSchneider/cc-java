class Autor {
    private String nome;
    private int id;

    public Autor(String nome, int id) {
        this.setAutorNome(nome);
        this.setAutorId(id);
    }

    void setAutorNome(String nome) {
        this.nome = nome;
    }
    String getAutorNome() {
        return this.nome;
    }

    void setAutorId(int id) {
        this.id = id;
    }
    int getAutorId() {
        return this.id;
    }
}