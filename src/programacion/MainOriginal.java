package programacion;

public class MainOriginal {

    public static void main(String[] args) {
        String mensaje_pedir = "Introduce una cantidad a retirar:";
        int dinero_a_sacar = 0;

        int cantidad_billetes = -1;
        int valor_billete=-1;

        boolean isContinuar = true;
        int eleccion_usuario = -1;

        while(isContinuar) {
            dinero_a_sacar = CajeroOriginal.pedirDinero(mensaje_pedir);

            for (int i = 0; i < 7; i++) {
                valor_billete = CajeroOriginal.elegirValorBillete(i);
                cantidad_billetes = CajeroOriginal.cantidadDeBilletes(valor_billete, dinero_a_sacar);
                System.out.println(cantidad_billetes + " de " + valor_billete + "€");
                dinero_a_sacar = dinero_a_sacar - (cantidad_billetes * valor_billete);
            }

            eleccion_usuario= CajeroOriginal.pedirDinero("¿Quieres continuar?\n0-Si\n1-No");

            if(eleccion_usuario==1){
                isContinuar=false;
            }
        }
    }

}