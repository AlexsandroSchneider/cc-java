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

    int area() {
        return (this.base*this.altura);
    }
    int perimetro() {
        return 2*(this.base+this.altura);
    }
    double diagonal() {
        return Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.altura, 2));
    }

    void imprimeDimensoes() {
        System.out.println("Dimensões = Base: " + this.base + " cm, Altura: " + this.altura + " cm");
    }
}