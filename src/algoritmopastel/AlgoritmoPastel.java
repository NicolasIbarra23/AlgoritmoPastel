
package algoritmopastel;

/**
 * @author Nicolas Ibarra - 1803673
 */
public class AlgoritmoPastel {

    public static void main(String[] args) {
        CumpleañosVelas I = new CumpleañosVelas();
        
        System.out.println("Programa que cálcula cuantas velas se apagarán en funcion de su altura y de la edad de la persona");
        System.out.println("Ingrese los años que cumple la persona: ");
        I.NoAños();
        I.Velas();
        I.Result();
        
    }
    
}
