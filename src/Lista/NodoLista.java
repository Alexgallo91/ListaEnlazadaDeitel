
package Lista;

public class NodoLista {
    
    public Object datos;
    public NodoLista siguienteNodo;
    
    public NodoLista(Object objeto)
    {
        this(objeto, null);
    }
    
    public NodoLista(Object objeto, NodoLista nodo)
    {
        datos = objeto;
        siguienteNodo = nodo;
    }

    public Object obtenerObject() 
    {
        return datos;
    }

    public NodoLista obtenerSiguiente() 
    {
        return siguienteNodo;
    }
    
}
