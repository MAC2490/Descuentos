import java.util.Scanner;
public class Descuentos{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su nombre");
        String nombre = entrada.next();
        System.out.println("Digite el monto a pagar");
        float monto = entrada.nextFloat();

        float descuento = 0;
        float valorDescuento = 0;
        if (monto >= 200000){
            valorDescuento = monto*0.15f;
            descuento = monto - valorDescuento;
        }else if (monto >= 50000 && monto < 200000){
            valorDescuento = monto*0.2f;
            descuento = monto - valorDescuento;
        }else if (monto >= 20000 && monto < 50000){
            valorDescuento = monto*0.015f;
            descuento = monto - valorDescuento;
        }

        System.out.println();
        System.out.println("Valor bono: "+valorDescuento+" -- Valor a pagar: "+descuento+" -- Nombre comprador: "+nombre);
    }
}