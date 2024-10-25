import java.util.Stack;

public class Punto4 {
    public class RecursivaSmall(Nodo nodo){
        if(nodo==null){
            return Integer.MAX_VALUE;
        }
        int minIzq=RecursivaSmall(nodo.izquierda);
        int minDer=RecursivaSmall(nodo.derecha);
        return Math.min(nodo.valor,Math.min(minIzq,minDer));
    }

    public class NoRecursivaSmall(Nodo nodo){
        if(nodo==null){
            return Integer.MAX_VALUE;
        }
        Stack<Nodo> pila=new Stack<Nodo>();
        pila.push(nodo);
        int min=Integer.MAX_VALUE;
        while(!pila.isEmpy){
            Nodo actual=pila.pop();
            min=Math.min(min,actual.valor);
            if(actual.derecha!=null){
                pila.push(actual.derecha);
            }
            if(actual.izquierda!=null){
                pila.push(actual.izquierda);
            }
            return min;
        }
    }
}
