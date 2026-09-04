    public class Perro extends Mascota{

    private String raza;
    private int nivelEnergia;
    private double pesoMaximo;
    private boolean entrenado;


    //constructores
    public Perro(String nombre, int edad, double peso, boolean vacuna,
                 String raza, int nivelEnergia, double pesoMaximo, boolean entrenado){
        super(nombre, edad, peso, vacuna);

        this.raza=raza;
        this.nivelEnergia=nivelEnergia;
        this.pesoMaximo=pesoMaximo;
        this.entrenado=entrenado;
    }
     public Perro(String nombre, int edad, double peso, boolean vacuna,
                  String raza, int nivelEnergia, boolean entrenado){
        super(nombre, edad, peso, vacuna);

        this.raza=raza;
        this.nivelEnergia=nivelEnergia;
        this.entrenado=entrenado;
        this.pesoMaximo=0.0;

     }
     public Perro(String nombre, int edad, String raza){
        super(nombre, edad);

        this.raza=raza;
        this.nivelEnergia=5;
        this.pesoMaximo=0.0;
        this.entrenado=false;

     }
     //getter y setter

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public int getNivelEnergia() {
            return nivelEnergia;
        }

        public void setNivelEnergia(int nivelEnergia) {
            this.nivelEnergia = nivelEnergia;
        }

        public double getPesoMaximo() {
            return pesoMaximo;
        }

        public void setPesoMaximo(double pesoMaximo) {
            this.pesoMaximo = pesoMaximo;
        }

        public boolean isEntrenado() {
            return entrenado;
        }

        public void setEntrenado(boolean entrenado) {
            this.entrenado = entrenado;
        }
        @Override
        public String toString() {
            return "OK OK OK En la clase Perro tienes:\n" +
                    super.toString() + "\n" +
                    "raza='" + raza +
                    ", nivelEnergia=" + nivelEnergia +
                    ", pesoMaximo=" + pesoMaximo +
                    ", entrenado=" + entrenado;
        }
    }

