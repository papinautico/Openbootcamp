public class coches {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarpuerta();
        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 4;

    public void sumarpuerta() {
        this.puertas++;
    }
}
