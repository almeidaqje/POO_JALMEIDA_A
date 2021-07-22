package ec.edu.intsuperior.modelo;

public class ClaseB {
    
    //metodos de clase de salida
    public static void metodoSalidaA() {
        System.out.println("Hola Inge");
    }
    
    //metodos de clase de retorno
    public static String metodoRetornoA() {
        String y = "Buenas noches Inge";
        return y;
    }
    
    //metodos de instancia (objeto) de salida
    public void salida() {
        System.out.println("Hola Ingeniero");
    }
    
    //metodos de instancia (objeto) de retorno
    public boolean retorno() {
        return 5==7;
    }
}
