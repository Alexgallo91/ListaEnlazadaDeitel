
package Lista;

public class ListaEnlazada {
    
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;
    
    public ListaEnlazada()
    {
        this("Lista");
    }
    
    public ListaEnlazada(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void insertarAlFrente(Object elementoInsertar)
    {
        if(estaVacia())
        {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        }
        else
        {
            primerNodo = new NodoLista(elementoInsertar, primerNodo);
        }
    }
    
    public void insertarAlFinal(Object elementoInsertar)
    {
        if(estaVacia())
        {
            primerNodo = ultimoNodo = new NodoLista(elementoInsertar);
        }
        else
        {
            ultimoNodo = ultimoNodo.siguienteNodo = 
                         new NodoLista(elementoInsertar);
        }
    }
    
    public Object eliminarDelFrente() throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
            throw new ExcepcionListaVacia(nombre);
        }
        
        Object elementoEliminado = primerNodo.datos;
        
        if(primerNodo == ultimoNodo) //si solo se tiene un elemento (un nodo)
        {
            primerNodo = ultimoNodo = null;
        }
        else
        {
            primerNodo = primerNodo.siguienteNodo;
        }    
        
        return elementoEliminado;
    }
    
    public Object eliminarDelFinal() throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
            throw new ExcepcionListaVacia(nombre);
        }
        
        Object elementoEliminado = ultimoNodo.datos;
        
        if(primerNodo == ultimoNodo)
        {
            primerNodo = ultimoNodo = null;
        }
        else
        {
            NodoLista actual = primerNodo;
            
            while(actual != ultimoNodo)
            {
                actual = actual.siguienteNodo;
            }
            
            actual.siguienteNodo = null;
        }
        
        return elementoEliminado;
    }
    
    public boolean estaVacia()
    {
        return primerNodo == null;
    }
    
    public void imprimir()
    {
        if(estaVacia())
        {
            System.out.printf("%s vacia\n", nombre);
            return; //sale del metodo
        }
        
        System.out.printf("La %s es: ", nombre);
        NodoLista actual = primerNodo;
        
        while(actual != null)
        {
            System.out.printf("[%s] ", actual.datos);
            actual = actual.siguienteNodo;
        }
        System.out.println("\n");
    }
}
