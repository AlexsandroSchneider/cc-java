public class Main{
    public static void main(String[] args){
        Retangulo rat6 = new Retangulo();
        rat6.setAltura(8);
        rat6.setBase(10);
        Circulo cat6 = new Circulo();
        cat6.setRaio(7);
        rat6.imprimeDimensoes();
        rat6.aumentaParaConterCirculo(cat6);
        rat6.imprimeDimensoes();
    }
}