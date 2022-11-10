package programacion;

import java.util.Scanner;

public class CajeroOriginal {

    static Scanner entrada = new Scanner(System.in);

    public static int pedirDinero(String mensaje){
        int cantidad = 0;
        System.out.println(mensaje);
        cantidad = entrada.nextInt();
        return cantidad;
    }

    public static int cantidadDeBilletes(int valor_billete, int cantidad){
        int cantidad_billetes = 0;
        if (cantidad >= valor_billete){
            cantidad_billetes = cantidad / valor_billete;
        }
        return cantidad_billetes;
    }

    public static int elegirValorBillete(int vuelta_bucle){
        int valor_billete = 0;
        switch(vuelta_bucle){
            case 0:
                valor_billete=500;
                break;
            case 1:
                valor_billete=200;
                break;
            case 2:
                valor_billete=100;
                break;
            case 3:
                valor_billete=50;
                break;
            case 4:
                valor_billete=20;
                break;
            case 5:
                valor_billete=10;
                break;
            case 6:
                valor_billete=5;
                break;
            default:
                System.out.println("Error en la seleccion de billetes");
                break;
        }

        return valor_billete;
    }

}
