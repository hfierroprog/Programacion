package paquete;


public class Curso {
    private String nombre;
    private String modalidad;
    private int horas;
    private String lenguaje;
    
    
    public Curso(String nombre, String modalidad, int horas,String lenguaje){
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.horas = horas;
        this.lenguaje = lenguaje;
    }
    
    //Metodos GET
    public String getNombre() {
        return nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public int getHoras() {
        return horas;
    }

    public String getLenguaje() {
        return lenguaje;
    }
    
    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    //Retornar todo
    public String RetornarTodo(){
        return "Curso:"+this.nombre+"\nModalidad:"+this.modalidad+"\nHoras:"+this.horas+"\nLenguaje:"+this.lenguaje;
    }
}
