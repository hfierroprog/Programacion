package prueba;

public class Repuesto {
    private String Color;
    private int cantidad,precio;
    
    final String local = "Santiago";
    final String categoria = "Cascos bicicleta";
    
    public void setColor(String color){
        this.Color = color;
        System.out.println("Ingresado correctamente!");
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
        System.out.println("Ingresado correctamente!");
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
        System.out.println("Ingresado correctamente!");
    }
    public String obtenerDatos(){
        String texto = "Categoria:"+this.categoria+"\nLocal:"+this.local;
        return texto;
    }
    public String obtenerDatosdos(){
        String texto = "Categoria:"+this.categoria+"\nLocal:"+this.local+"\nCantidad:"+this.cantidad+"\nPrecio:"+this.precio+"\nColor:"+this.Color;
        return texto;
    }
}
