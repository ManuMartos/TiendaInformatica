package com.company.datos;

/**
 * Created by Manu on 22/05/2017.
 */
public class Hardware extends Articulos {

    private boolean perisferico;

    public Hardware() {
    }

    public Hardware(char codigo, double precio, String descripcion, boolean perisferico) {
        super(codigo, precio, descripcion);
        this.perisferico = perisferico;
    }

    public boolean isPerisferico() {
        return perisferico;
    }

    public void setPerisferico(boolean perisferico) {
        this.perisferico = perisferico;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "Perisferico=" + perisferico +
                ". Codigo: " + getCodigo() + ". Precio: " + getPrecio() +
                ". Descripcion: " + getDescripcion() +
                '}';
    }

    @Override
    public double calcularPrecio() {

        double precioFinal = 0;

        if (getCodigo() == 'A' || getCodigo() == 'a'){

            precioFinal = getPrecio() * 1.10;

        }else if (getCodigo() == 'B' || getCodigo() == 'b'){

            precioFinal =getPrecio() * 1.15;
        }

        if (perisferico){
            precioFinal = precioFinal * 1.30;
        }

        return precioFinal;
    }
}
