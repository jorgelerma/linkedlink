public class Main2 {

    private static Nodo primero;



    public void agregar(String dato) {

        Nodo nuevo = new Nodo();
        nuevo.setData(dato);
        nuevo.setSiguiente(primero);
        //System.out.println();

        primero = nuevo;

    }

    public void agregarFinal(String dato) {

        if (primero == null) {

            agregar(dato);
            //return;
        }


    Nodo nodo = primero;
   while(nodo.getSiguiente()!=null)

    {
        nodo = nodo.getSiguiente();
    }


    Nodo nuevoNodo = new Nodo();
   nuevoNodo.setData(dato);
   nodo.setSiguiente(nuevoNodo);

}



public void agregar(String dato, int indice){


        Nodo nodoAnterior = obtenerPorIndice(--indice);

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setData(dato);
        nuevoNodo.setSiguiente(nodoAnterior.getSiguiente());
        nodoAnterior.setSiguiente(nuevoNodo);
}


public Nodo obtenerPorIndice(int indice){

    Nodo nodo = primero;
    for (int i=0; (i < indice) && (nodo != null); i++){

        nodo = nodo.getSiguiente();
    }

    if(nodo == null){

        throw new IndexOutOfBoundsException();
    }

    return nodo;
}




    public void borrar(int indice){

        if(indice == 0){

            primero = primero.getSiguiente();
            //return;
            return;
        }

        System.out.println(" @BORRAR ");

        Nodo nodoAnterior = obtenerPorIndice(--indice);
        System.out.println(" THIS IS indice: " + indice);
        nodoAnterior.setSiguiente(nodoAnterior.getSiguiente().getSiguiente()
        .getSiguiente());


    }

    public void imprimir(){

        Nodo nodo = primero;
        while(nodo != null){
            System.out.println(nodo.getData());
            nodo = nodo.getSiguiente();
        }
    }

    public int buscar(String dato){


        int indice = 0;
        Nodo nodo = primero;
        while(nodo != null){


            if(nodo.getData().equals(dato))
                nodo = nodo.getSiguiente();
            indice++;
        }
        System.out.println("This is buscar = " + indice);

        return -1;
    }


    public static void main(String[] args) {
	// write your code here


        System.out.println("This is primero = " + primero);


        Main2 lista = new Main2();
        lista.agregar("Luis");
        lista.agregar("Juan");
        lista.agregar("Pedro");
        lista.agregar("Iavan");
        lista.agregar("Bill");

        //lista.buscar("Pedro");

        lista.imprimir();
        lista.borrar(2);
        System.out.println();
        lista.imprimir();
    }
}
