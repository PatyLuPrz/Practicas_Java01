class ClaseBase{
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}

public class ClaseDos{
    public static void main (String [] arg){
        ClaseDos dejah = new ClaseDos();
        dejah.setNombre("Dejah");
        System.out.println("Nombre "+ dejah.getNombre());
    }
}
