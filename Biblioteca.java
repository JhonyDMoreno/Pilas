import java.util.Stack;
public class Biblioteca {
    private Stack<ObjLibro> pila = new Stack<ObjLibro>();
     public void registrarLibro(ObjLibro libro) {
         pila.push(libro);
         System.out.println("Libro registrado: " + libro.toString());
     }
     public void retirarUltimoLibro() {
       
         if (pila.isEmpty()) {
            System.out.println("No hay libros en la pila.");
             return ;
         }
         ObjLibro libroRetirado = pila.pop();
         System.out.println("Libro retirado: " + libroRetirado.getTitulo());
     }
     public void consultarUltimoLibro() {
         if (pila.isEmpty()) {
             System.out.println("No hay libros en la pila.");
             return ;
         }
            ObjLibro ultimoLibro = pila.peek();
            System.out.println("Último libro registrado: " + ultimoLibro.toString());
     }

     public void mostrarLibros() {
        for (ObjLibro libro : pila) {
            System.out.println(libro.toString());
        }
     }
    
}
