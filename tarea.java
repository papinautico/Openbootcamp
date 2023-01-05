public class tarea {
        static int suma(int p1, int p2, int p3) {
                int suma = p1 + p2 + p3;
                return suma;
        }

        public static void main(String[] args) {
                int resultado;
                resultado = suma(10, 20, 30);
                System.out.println("El resultado es:" + resultado);
        }
}