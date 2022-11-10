public class Main {
    private static int opcion;
    private static int cantidad;
    private static boolean multiplo;

    public static void main(String[] args) {
        Cajero.mostrarMenu();
        opcion = Cajero.introducirOpcion();
        if (opcion == 1) {
            do {
                Cajero.preguntarCantidad();
                cantidad = Cajero.introducirCantidad();
                multiplo = Cajero.esMultiploCinco(cantidad);
            } while (!multiplo);
            Cajero.contarBilletes(cantidad);
            Cajero.mostrarBilletes();
            exit();
        } else {
            exit();
        }
    }

    private static void exit() {
    }

}
