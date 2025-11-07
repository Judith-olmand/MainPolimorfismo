public class MainPolimorfismo  {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro(),
                new Gato(),
                new AnimalGenerico(),
        };

        //Se invoca el metodo sobrescrito correspondiente a cada objeto
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}