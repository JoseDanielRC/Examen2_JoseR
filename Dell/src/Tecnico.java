
public class Tecnico {
//   Nombre, Edad, Genero, y cantidad de computadoras ensambladas con éxito (empieza en 0). 
   private String nombre;
   private int edad;
   private String genero;
   private int exito;

    public Tecnico(String nombre, int edad, String genero, int exito) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.exito = exito;
    }

    public Tecnico(String nombre, int exito) {
        this.nombre = nombre;
        this.exito = exito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return  nombre + "    " + exito ;
    }
   
    
}
