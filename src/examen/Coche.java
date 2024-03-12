package examen;

public class Coche {
    private String marca;
    private String modelo;
    private double precio;
    private int km;

    private static int kmTotales = 0;
    public Coche(String marca, String modelo, double precio, int km) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.km = km;
    }
    public static int getKmTotales() 
    {
        return Coche.kmTotales;
    } 
    public double precioConIva(boolean ivareducido) 
    {
        /* si el impuesto es reducido, el precio con iva es el precio del coche incrementado un 10%
           si no es reducido, el precio con iva es el precio del coche incrementado un 21%
        */
        if (ivareducido){
            return getPrecio() * 1.10;
        }else {
            return getPrecio()* 1.21;
        }
    }
    public void aplicarDescuento() 
    {
        /*si el precio del coche es menor a 10.000€ se aplica un descuento del 15%
          sino se aplica un descuento del 7%
        */
        if (getPrecio()<10000){
            this.precio = getPrecio() * 0.85;
        }else {
            this.precio = getPrecio() * 0.93;
        }
    }
    public void recorrerKm(int km) {
        this.km += km;
        Coche.kmTotales += km;
  }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }
}

