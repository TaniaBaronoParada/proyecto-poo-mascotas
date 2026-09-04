 public class Main {
    public static void main(String[] args){

        // Se usa el primer constructor porque en este caso se conocen todos los datos de la mascota
        Mascota mascota1 = new Mascota("Mizun", 24, 4.5,true);
        //Se usa el tercer constructor porque en este caso solo se conocen el nombre y la edad.
        Mascota mascota2= new Mascota("Luci", 6);

        // Se usa el primer constructor porque en este caso se conocen todos los datos del perro
        Perro perro1= new Perro("Adan",36, 12.5, true, "Labrador", 8, 30.5, true);
        // Se usa el segundo constructor porque en este caso no se conoce el peso máximo del perro
        Perro perro2= new Perro("Luka", 18, 12.0,true, "Beagle", 7, false );

        // SE usa el primer constructor porque en este caso se conocen todos los datos del gato
        Gato gato1 = new Gato("Michi", 12, 4.2, true, "Negro", 9, 1.8, true);
        // Se usa el tercer constructor porque en este caso solo se conocen el nombre, la edad y el color del gato.
        Gato gato2 = new Gato("Nala", 8, "Blanco");

        // Se usa el primer constructor porque en este caso se conocen todos los datos del ave
        Ave ave1 = new Ave("Loro", 10, 0.4, true, "Loro", 25, 40.0, true);
        // Se usa el tercer constructor porque en este caso solo se conocen el nombre, la edad y la especie del ave.
        Ave ave2 = new Ave("Pico", 6, "Canario");

        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(gato1);
        System.out.println(gato2);
        System.out.println(ave1);
        System.out.println(ave2);
    }
}