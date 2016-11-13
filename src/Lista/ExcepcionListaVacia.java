
package Lista;

public class ExcepcionListaVacia extends RuntimeException{
    
    public ExcepcionListaVacia()
    {
        this("");
    }
    
    public ExcepcionListaVacia(String nombre)
    {
        super(nombre + " esta vacia!");
    }
}
