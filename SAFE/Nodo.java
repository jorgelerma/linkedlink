public class Nodo {

    private String data;
    private Nodo siguiente;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public Nodo getSiguiente(){
        return siguiente;
    }

   public Nodo setSiguiente(Nodo siguiente) {

        this.siguiente = siguiente;

        return siguiente;
   }


}
