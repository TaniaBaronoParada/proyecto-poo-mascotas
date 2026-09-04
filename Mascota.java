public class Mascota {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacuna;

    public Mascota (String nombre, int edad, double peso, boolean vacuna){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.vacuna=vacuna;

    }
    public Mascota(String nombre, int edad,boolean vacuna){
        this.nombre=nombre;
        this.edad=edad;
        this.vacuna=vacuna;
        this.peso=0.0;


    }
    public Mascota(String nombre, int edad){
        this(nombre, edad,0.0,false);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "En la clase Mascota tienes:\n" +
                "nombre='" + nombre +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacuna=" + vacuna;
    }
}
