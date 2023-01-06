public class punto5S {
    public static void main(String[] args) {
        String estacion = "Verano";
        switch (estacion) {
            case "Verano":
                System.out.println("La estación es Verano.");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno.");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño.");
                break;
            case "Primavera":
                System.out.println("La estación es Primavera.");
                break;
            default:
                System.out.println("El valor varible no es una estación");
                break;
        }

    }
}
