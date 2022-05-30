public class Main{
    static void imprimeObjeto(int area, int perimetro, double diagonal){
        System.out.println("Área " + area + " cm²");
        System.out.println("Perímetro " + perimetro + " cm");
        System.out.printf("Diagonal %.2f cm\n\n", diagonal);
    }
    public static void main(String[] args){
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo(7,4);
        Retangulo ret3 = new Retangulo(14,8);
        Retangulo ret4 = new Retangulo(21,12);
        ret1.imprimeDimensoes();
        imprimeObjeto(ret1.area(), ret1.perimetro(), ret1.diagonal());
        ret2.imprimeDimensoes();
        imprimeObjeto(ret2.area(), ret2.perimetro(), ret2.diagonal());
        ret3.imprimeDimensoes();
        imprimeObjeto(ret3.area(), ret3.perimetro(), ret3.diagonal());
        ret4.imprimeDimensoes();
        imprimeObjeto(ret4.area(), ret4.perimetro(), ret4.diagonal());
    }
}