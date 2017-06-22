package paquete;

public class Curso_paga extends Curso{
    private int precio;
    
    public Curso_paga(String nombre, String modalidad, int horas,String lenguaje, int precio){
        super(nombre,modalidad,horas,lenguaje);
        this.precio = precio;
    }
    
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Retornar todo
    @Override
    public String RetornarTodo(){
        return super.RetornarTodo()+"\nPrecio:"+this.precio;
    }
}
