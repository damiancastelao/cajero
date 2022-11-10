package programacion;

import programacion.CajeroOriginal;

public class FiguraGeometrica {

    public static float areaCirculo(float radio){
        float area = 0;
        area = (float) Math.PI * (radio * radio);
        return area;
    }

    public static float areaRectangulo(float base, float altura){
        float area = 0;
        area = base * altura;
        return area;
    }

    public static void menu(){
        int eleccion_usuario = 0;
        float n1,n2;
        n1=0;
        n2=0;
        eleccion_usuario= CajeroOriginal.pedirDinero("0- Circulo\n1- Rectangulo");
        switch(eleccion_usuario){
            case 0:
                    n1=(float) CajeroOriginal.pedirDinero("Introduce el radio");
                    float area=0;
                    System.out.println("El area del circulo es " +area);
                break;
            case 1:
                break;


        }
    }
}
