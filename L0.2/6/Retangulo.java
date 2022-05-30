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

    void aumenta(int valor) {
        this.base = this.base + valor;
        this.altura = this.altura + valor;
    }
    void aumentaParaConterCirculo(Circulo circulo) {
        int medida = 2*circulo.getRaio();
        if(this.base < medida){
            aumenta(medida - this.base);
        }
        if (this.altura < medida){
            aumenta(medida - this.altura);
        }
    }

    void imprimeDimensoes() {
        System.out.println("Dimensões = Base: " + this.base + " cm, Altura: " + this.altura + " cm");
    }
}