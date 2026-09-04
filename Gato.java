public class Gato extends Mascota {
    private String color;
    private int vidas;
    private double alturaSalto;
    private boolean domestico;

    //constructores
    public Gato(String nombre, int edad, double peso,boolean vacuna,
                String color, int vidas,double alturaSalto, boolean domestico) {

        super(nombre, edad, peso, vacuna);

        this.color=color;
        this.vidas=vidas;
        this.alturaSalto=alturaSalto;
        this.domestico=domestico;
    }
    public Gato(String nombre, int edad, double peso, boolean vacuna,
                String color,int vidas, boolean domestico) {

        super(nombre, edad, peso, vacuna);

        this.color=color;
        this.vidas=vidas;
        this.alturaSalto= 0.0;
        this.domestico=domestico;
    }
    public Gato(String nombre, int edad, String color) {

        super(nombre, edad);

        this.color=color;
        this.vidas=9;
        this.alturaSalto=0.0;
        this.domestico=true;
    }
    //getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }
    @Override
    public String toString() {
        return "Me encanta!!! En la clase Gato tienes:\n" +
                super.toString() + "\n" +
                "color='" + color +
                ", vidas=" + vidas +
                ", alturaSalto=" + alturaSalto +
                ", domestico=" + domestico;
    }
}
