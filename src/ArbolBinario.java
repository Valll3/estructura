public class ArbolBinario<E extends  Comparable<E>> {
    private Nodo raiz;
    private int longitud;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void agregar(E dato) throws Exception
    {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            agregar(dato, raiz);
        }
    }

    private void agregar(E dato, Nodo nodo) throws Exception {
        if (nodo.dato.compareTo(dato) > 0) {
            if (nodo.izquierda == null) {
                nodo.izquierda = new Nodo(dato);
            } else {
                agregar(dato, nodo.izquierda);
            }
        } else if (nodo.dato.compareTo(dato) < 0) {
            if (nodo.derecha == null) {
                nodo.derecha = new Nodo(dato);
            } else {
                agregar(dato, nodo.derecha);
            }
        } else {
            throw new Exception("El elemento ya se encuentra en la lista");
        }

        longitud++;
    }

    public boolean contiene(E dato) {
        return contiene(dato, raiz);
    }

    private boolean contiene(E dato, Nodo nodo) {
        if (nodo == null) return false;

        int comparacion = nodo.dato.compareTo(dato);

        if (comparacion == 0) {
            return true;
        } else if (comparacion < 0) {
            return contiene(dato, nodo.derecha);
        } else {
            return contiene(dato, nodo.izquierda);
        }
    }

    public void eleminar(E dato, Nodo derecha) {
        eliminar(dato, raiz);
    }

    private void eliminar(E dato, Nodo nodo) {
        if (nodo == null) return;;

        if (dato.compareTo(nodo.dato) > 0) {
            eleminar(dato, nodo.derecha);
        } else if (dato.compareTo(nodo.dato) < 0) {
            eliminar(dato, nodo.izquierda);
        } else {

            if (nodo.izquierda == null) {

            }

        }
    }

    private class Nodo {
        public Nodo izquierda;
        public Nodo derecha;
        public E dato;

        public Nodo(Nodo izq, E dato, Nodo der) {
            this.izquierda = izq;
            this.derecha = der;
            this.dato = dato;
        }

        public Nodo(E dato) {
            this(null, dato, null);
        }
    }
}


