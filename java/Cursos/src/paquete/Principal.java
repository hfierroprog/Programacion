package paquete;

public class Principal {
    public static void main(String[] args){
        Curso[] online = new Curso[3];
        
        online[0] = new Curso("JAVA DESDE CERO", "ONLINE", 120,"JAVA");
        online[1] = new Curso("PYTHON EN 24 HORAS", "ONLINE", 24,"PYTHON");
        online[2] = new Curso("C# AVANZADO", "ONLINE", 300,"C#");
        
        for(int i = 0;i < 3;i++){
            System.out.println(online[i].RetornarTodo());
            System.out.println("\n-------------------------------------------------------------------------\n");
        }
    }
}
