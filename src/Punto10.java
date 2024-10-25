import java.util.Stack;

public class Punto10 {
    public static Nodo ArbolBinarioExp(String expresion){
        Stack<Nodo> pila=new Stack<Nodo>();
        for(char c:expresion.toCharArray()){
            Nodo nodo=new Nodo(c);
            if(c=='+'||c=='-'||c=='/'||c=='*'){
                nodo.derecha=pila.pop();
                nodo.izquierda=pila.pop();

            }
            pila.push(nodo);
        }return pila.pop();
    }
}
public static void imprimirinOrden(Nodo nodo){
    if(nodo!=null){
        imprimir(nodo.izquierda)
        print("'"+nodo.valor+"'" );
        imprimirinOrden(nodo.derecha);
    }
}

