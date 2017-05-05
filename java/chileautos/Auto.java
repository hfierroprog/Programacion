package pack;

public class Auto {
    private String vehiculo;
    private int precio;
    private int kilometraje;
    private String color_exterior;
    private String transmision;
    private int puertas;
    private int pasajeros;
    private double litros;
    private int cilindros;
    private String combustible;
    private String region;
    private String ciudad; 
    private boolean comparar;
    private boolean contactar;

    
    
    public Auto(){
        
    }
    
    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public int getKilometraje() {
        return kilometraje;
    }


    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }


    public String getColor_exterior() {
        return color_exterior;
    }


    public void setColor_exterior(String color_exterior) {
        this.color_exterior = color_exterior;
    }


    public String getTransmision() {
        return transmision;
    }


    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }


    public int getPuertas() {
        return puertas;
    }


    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPasajeros() {
        return pasajeros;
    }


    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }


    public double getLitros() {
        return litros;
    }


    public void setLitros(double litros) {
        this.litros = litros;
    }


    public int getCilindros() {
        return cilindros;
    }


    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }


    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    public String getRegion() {
        return region;
    }


    public void setRegion(String region) {
        this.region = region;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
                + "\nPuertas:"+this.puertas+"\nPasajeros:"+this.pasajeros+""
                + "\nLitros:"+this.litros+"\nCilindros:"+this.cilindros+""
                + "\nCombustible:"+this.combustible+"\nRegion:"+this.region+""
                + "\nCiudad:"+this.ciudad+"\nComparar:"+this.comparar+""
                + "\nContactar:"+this.contactar;
        
        
        return todo;
    }
    
}
