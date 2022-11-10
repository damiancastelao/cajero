public class Cajero {
    public static void mostrarMenu() {
        System.out.println("1 sacar dinero\n0 salir");
    }

    public static int introducirOpcion() {
        // 1 sacar dinero
        // 0 salir
        return 1;
    }

    public static void preguntarCantidad() {
        System.out.println("Cantidad?");
    }

    public static int introducirCantidad() {
        return 250;
    }

    public static boolean esMultiploCinco(int cantidad) {
        return true;
    }

    public static void contarBilletes(int cantidad) {
        System.out.println("Contando");
    }

    public static void mostrarBilletes() {
        System.out.println("Mostrando");
    }
}
