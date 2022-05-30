public class Retangulo {
    private int base;
    private int altura;

    Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        this.base = 1;
        this.altura = 1;
    }

    int getBase() {
        return this.base;
    }
    void setBase(int base) {
        this.base = base;
    }
    int getAltura() {
        return this.altura;
    }
    void setAltura(int altura) {
        this.altura = altura;
    }
    void imprimeDimensoes() {
        System.out.println("Base: " + this.base + ", Altura: " + this.altura);
    }
}