
import java.util.ArrayList;


public class A_list {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.remove("Luis");
        System.out.println("");
        System.out.println("Despues de eliminar a Luis:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}
