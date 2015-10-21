package boletin5;

import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
       int velocidad;
       
        coche coche1 = new coche();
        Scanner obx = new Scanner (System.in);
        System.out.println("Introduzca la velocidad a la que circula");
        velocidad=obx.nextInt();
        coche1.acelerar(velocidad);
        System.out.println("la velocidad cuando aceleras sera "+ coche1.getvelocidad());
        System.out.println("Cuanto quieres frenar?");
        int frenada = obx.nextInt();
        coche1.frenar(frenada);
        System.out.println("La velocidad cuando frenas sera "+ coche1.getvelocidad());
    }

}
    

