package com.company.datos;

/**
 * Created by Manu on 22/05/2017.
 */
public class Principal {

    public static void main(String[] args) {

        Articulos soft1 = new Software('B', 130, "Windows", "Sistema Operativo");
        Articulos soft2 = new Software('B', 130, "Tetris", "ProgramaJuegos");

        Articulos hard1 = new Hardware('A', 400, "Tarjeta Video", false);
        Articulos hard2 = new Hardware('B', 100, "Impresora", true);

        mostrarArticulo(soft1, soft2, hard1, hard2);

        System.out.println();

        calcular(soft1, soft2, hard1, hard2);
    }

    private static void calcular(Articulos soft1, Articulos soft2, Articulos hard1, Articulos hard2) {
        System.out.println("Precio de Soft1: " + soft1.calcularPrecio() + "€");
        System.out.println("Precio de Soft2: " + soft2.calcularPrecio() + "€");
        System.out.println("Precio de Hard1: " + hard1.calcularPrecio() + "€");
        System.out.println("Precio de Hard2: " + hard2.calcularPrecio() + "€");
    }

    private static void mostrarArticulo(Articulos soft1, Articulos soft2, Articulos hard1, Articulos hard2) {
        System.out.println("Soft1: " + soft1);
        System.out.println("Soft2: " + soft2);
        System.out.println("Hard1: " + hard1);
        System.out.println("Hard2: " + hard2);
    }
}
