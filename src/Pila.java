import java.util.EmptyStackException;
import java.util.Stack;

public class Pila {
    private Stack<Publicacion> pila;

    public Pila() {
        pila = new Stack<Publicacion>();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public void push(Publicacion publicacion) {
        pila.push(publicacion);
    }

    public Publicacion pop() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila vacía");
        }
        return pila.pop();
    }

    public Publicacion peek() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila sin elementos");
        }
        return pila.peek();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=pila.size()-1;i>=0;i--){
            sb.append(pila.get(i).toString());
        }

        return "Pila\n" + sb.toString();
    }
}
