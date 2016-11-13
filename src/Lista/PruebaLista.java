
package Lista;

public class PruebaLista {
    
    public static void main(String []args)
    {
        ListaEnlazada lista = new ListaEnlazada("ListaEnlazada");
        
        lista.insertarAlFrente(-1);
        lista.imprimir();
        lista.insertarAlFrente(0);
        lista.imprimir();
        lista.insertarAlFinal(1);
        lista.imprimir();
        lista.insertarAlFinal(5);
        lista.imprimir();
        
        try
        {
            Object objetoElminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoElminado);
            lista.imprimir();
            
            objetoElminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoElminado);
            lista.imprimir();
            
            objetoElminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoElminado);
            lista.imprimir();
            
            objetoElminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoElminado);
            lista.imprimir();
        }
        catch(ExcepcionListaVacia exLista)
        {
            exLista.printStackTrace();
        }
    }
    
}
