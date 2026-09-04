public class Ave extends Mascota{
    private String especie;
    private int longitudAlas;
    private double velocidadVuelo;
    private boolean puedeVolar;

    //constructires
    public Ave(String nombre, int edad, double peso, boolean vacuna,
               String especie, int longitudAlas, double velocidadVuelo, boolean puedeVolar) {

        super(nombre, edad, peso, vacuna);

        this.especie=especie;
        this.longitudAlas=longitudAlas;
        this.velocidadVuelo=velocidadVuelo;
        this.puedeVolar=puedeVolar;
    }
    public Ave(String nombre, int edad, double peso, boolean vacuna,
               String especie, int longitudAlas, boolean puedeVolar) {

        super(nombre, edad, peso, vacuna);

        this.especie= especie;
        this.longitudAlas=longitudAlas;
        this.velocidadVuelo=0.0;
        this.puedeVolar=puedeVolar;
    }
    public Ave(String nombre, int edad,String especie) {

        super(nombre, edad);

        this.especie=especie;
        this.longitudAlas=0;
        this.velocidadVuelo=0.0;
        this.puedeVolar=true;
    }

    //getters y setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(double velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public int getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(int longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Super! En la clase Ave tienes:\n" +
                super.toString() + "\n" +
                "especie='" + especie +
                ", longitudAlas=" + longitudAlas +
                ", velocidadVuelo=" + velocidadVuelo +
                ", puedeVolar=" + puedeVolar;
    }
}
