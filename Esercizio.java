//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        
        Scanner in = new Scanner( System.in );
        do {
            String parola = in.nextLine();
            for (int i = 0; i<parola.length(); ++i) {
                pila.push(parola.charAt(i));
            }
            String parolaInv;
            for (int i = 0; i<parola.length();++i) {
                parolaInv += pila.pop();
            }
            if (parola.equalsIgnoreCase(parolaInv)) {
                System.out.println(parola + " è palindroma");
            } else {
                System.out.println(parola + " non é palindroma");
            }
        } while (parola.toLowerCase()!="x");   
    }
}

class Pila<T> {
    Nodo<T> top;
    public Pila<T>(){
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push (T dato) {
        Nodo <T> nodo = new Nodo<>(dato);
        if (top==null) {
            top = nodo;
        }
        top.next = head;
        top = nodo
    }

    public T pop() {
        if (top==null) {
            return NoSuchElementException("Pila vuota");
        }
        T dato = top.dato;
        top = top.next;
        return dato;
    }

    public T peek() {
        if (top==null) {
            return NoSuchElementException("Pila vuota");
        }
        return top.dato;
    }

    public int size() {
        Pila<T> pilaB = pila;
        int cont = 0;
        try {
            while(true) {
                T dato = pilaB.pop();
                ++cont;
            }
        } catch (Exception e) {
            return cont;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Pila <T> pilaB = pila;
        try {
            while (true) {
                T dato = pilaB.pop();
                sb.append(dato);
                sb.append("-->");
            }
        } catch (Exception e) {
            sb.append("NULL");
            return sb.toString();
        }
    }
}

class Nodo<T>{
    T dato;
    Nodo<T> next;

    public Nodo<T> (T dato) {
        this.dato = dato;
        this.next = null
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md