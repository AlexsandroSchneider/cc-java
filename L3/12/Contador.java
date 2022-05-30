interface Rastreador {
}

class Animal {
    private int idade, tamanho;
    public void respirar() {
        System.out.println("Respirando");
    }
    public void andar() {
        System.out.println("Andando");
        
    }
}

class Mamifero extends Animal {
    public void respirar(int i) {
        super.respirar();
        System.out.println("Respirando mamifero " + i);
    }
    public void respirar() {
        super.respirar();
        System.out.println("Respirando mamifero ");
    }
    public void mamar() {
        System.out.println("Mamando");
    }
}

class Morcego extends Mamifero implements Rastreador {
    private float sonar;
    public void voar() {
        System.out.println("Voar");
    }
    public void andar(float f) {
        super.andar();
        String ff = String.format("%.2f", f);
        System.out.println("Morcego andando no ar por " + ff);
    }
}

class NaoPodeAlterar {
    public static void main(String args[]) {
        Animal a = new Animal();
        Mamifero m = new Mamifero();
        Morcego o = new Morcego();
        a.respirar();
        m.mamar();
        m.respirar(2);
        o.voar();
        o.andar(3.14f);
        o.voar();
        m.respirar();
    }
}
    