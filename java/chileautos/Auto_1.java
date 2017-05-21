package packet;

public class Auto_1 {
    private String vehiculo;
    private int precio;
    private int kilometraje;
    private String color_exterior;
    private String transmision;
    private int puertas;
    private String combustible;
    private String region;
    private String ciudad; 
    private boolean comparar;
    private boolean contactar;

    
    
    public Auto_1(String vehiculo,int precio,int kilometraje, String color_exterior, String transmision, int puertas, String combustible, String region, String ciudad ){
        this.vehiculo = vehiculo;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.color_exterior = color_exterior;
        this.transmision = transmision;
        this.puertas = puertas;
        this.combustible = combustible;
        this.region = region;
        this.ciudad = ciudad;
    }
    
    public String getVehiculo() {
        return vehiculo;
    }


    public int getPrecio() {
        return precio;
    }


    public int getKilometraje() {
        return kilometraje;
    }


    public String getColor_exterior() {
        return color_exterior;
    }


    public String getTransmision() {
        return transmision;
    }


    public int getPuertas() {
        return puertas;
    }


    public String getCombustible() {
        return combustible;
    }


    public String getRegion() {
        return region;
    }


    public String getCiudad() {
        return ciudad;
    }


    public boolean isComparar() {
        return comparar;
    }


    public void setComparar(String comparar) {
        this.comparar = comparar.equals("si");
    }


    public boolean isContactar() {
        return contactar;
    }

    public void setContactar(String comparar) {
        this.comparar = comparar.equals("si");
    }
    
    public String obtenerTodo(){
        String todo = "Vehiculo:"+this.vehiculo+"\n"
                + "Precio:"+this.precio+"\nKilometraje:"+this.kilometraje+""
                + "\nColor exterior:"+this.color_exterior+"\nTransmision:"+this.transmision+""
                + "\nPuertas:"+this.puertas+""
                + "\nCombustible:"+this.combustible+"\nRegion:"+this.region+""
                + "\nCiudad:"+this.ciudad+"\nComparar:"+this.comparar+""
                + "\nContactar:"+this.contactar;
        
        
        return todo;
    }
    
}
