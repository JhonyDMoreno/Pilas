
public class Main {
    public static void main(String[] args) {
        Biblioteca Biblioteca = new Biblioteca();
        ObjLibro Libro1 = new ObjLibro("111", "El principito", "Antoine de Saint-Exupéry", 1943);
        Biblioteca.registrarLibro(Libro1);
        ObjLibro Libro2 = new ObjLibro("222", "Cien años de soledad", "Gabriel García Márquez", 1967);
        Biblioteca.registrarLibro(Libro2);
        ObjLibro Libro3 = new ObjLibro("333", "1984", "George Orwell", 1949);
        Biblioteca.registrarLibro(Libro3);
        Biblioteca.registrarLibro(Libro2);
        Biblioteca.registrarLibro(Libro1);
        Biblioteca.consultarUltimoLibro();  
        Biblioteca.retirarUltimoLibro();
        Biblioteca.consultarUltimoLibro();
        Biblioteca.mostrarLibros();
        
    }
}
