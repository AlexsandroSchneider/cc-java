public class Update {
    void update(Animal[] lista) {
        for (Animal animal : lista) {
            animal.respirar(); animal.andar();
            if (animal instanceof Morcego) {
                Morcego x = (Morcego)animal;
                x.voar();
            } else if (animal instanceof Mamifero) {
                Mamifero x = (Mamifero)animal;
                x.mamar();
            }
        }        
    }
}
