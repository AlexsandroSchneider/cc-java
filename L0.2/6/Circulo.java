public class Circulo {
    private int raio;

    Circulo(int raio) {
        this.raio = raio;
    }
    public Circulo() {
        this.raio = 1;
    }

    double area() {
        return (Math.PI * Math.pow(this.raio, 2)); 
    }
    double circunf() {
        return (2* Math.PI* this.raio);
    }
    int getRaio() {
        return this.raio;
    }
    void setRaio(int raio) {
        this.raio = raio;
    }
}
