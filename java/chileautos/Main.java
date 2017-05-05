package pack;

public class Main {

    public static void main(String[] args){
        Auto auto1 = new Auto();
        
        auto1.setVehiculo("2016 KIA MORNING 1.2 EX Sport");
        auto1.setTransmision("Manual");
        auto1.setRegion("Metropolitana de Santiago");
        auto1.setPuertas(5);
        auto1.setPrecio(6900000);
        auto1.setPasajeros(5);
        auto1.setLitros(1.2);
        auto1.setKilometraje(13000);
        auto1.setContactar("no");
        auto1.setComparar("si");
        auto1.setCombustible("Bencina");
        auto1.setColor_exterior("plata");
        auto1.setCiudad("Lampa");
        auto1.setCilindros(4);
        
        System.out.println(auto1.obtenerTodo());
    }
}