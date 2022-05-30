public class Son extends Father {
    public Son(){
        super();
    }
    public void escala(double valor) {
        this.setLado((int)(this.getLado()*valor));
    }
    public int area() {
        return -(this.getLado()*this.getLado());
    }
}
