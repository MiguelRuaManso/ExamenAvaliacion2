package examen;

public class GestiónCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche cocheDeMaria = new Coche ("Ford", "Focus",5000, 0);
        Coche cocheDeMercedes = new Coche ("Audi", "A3", 34000,0);
        
        cocheDeMercedes.recorrerKm(43);
        cocheDeMercedes.recorrerKm(240);
        cocheDeMaria.recorrerKm(150);
        cocheDeMercedes.recorrerKm(200);
        cocheDeMaria.recorrerKm(65);
        cocheDeMaria.recorrerKm(92);
        System.out.println ("El km del cocheDeMaria es "+ cocheDeMaria.getKm()+"Km");
        System.out.println ("El km del cocheDeMercedes es "+ cocheDeMercedes.getKm()+"Km");
        System.out.println("El kilometraje total recorrido por los coches ha sido de " + Coche.getKmTotales() + "Km");
        
        //cocheDeMaria.aplicarDescuento();
        //cocheDeMercedes.aplicarDescuento();
        System.out.println ("El precio de venta del cocheDeMaria es "+ cocheDeMaria.precioConIva(true) +"€");
        System.out.println ("El precio de venta del cocheDeMercedes es "+ cocheDeMercedes.precioConIva(false) +"€");
    }
    
}
