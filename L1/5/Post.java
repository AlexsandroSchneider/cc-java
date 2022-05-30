class Post {
    private Autor autor;
    private String texto;

    public Post(String nome, int id, String texto) {
        this.autor = new Autor(nome, id);
        this.texto = texto;
    }

    void setNome(String nome) {
        this.autor.setAutorNome(nome);
    }
    String getNome() {
        return this.autor.getAutorNome();
    }

    void setId(int id) {
        this.autor.setAutorId(id);
    }
    int getId() {
        return this.autor.getAutorId();
    }
    
    void setTexto(String texto) {
        this.texto = texto;
    }
    String getTexto() {
        return this.texto;
    }

    public void imprimeResumo() {
        System.out.printf("\nTexto: %s\nPor: %s, ID: %d", this.getTexto(), this.getNome(), this.getId());
    }
}