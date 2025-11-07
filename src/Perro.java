public class Perro extends Animal {
    private String raza;
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;

    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + get.edad +
                "} " + super.toString();
    }
}
