
package algoritmopastel;

import java.util.Scanner;
public class CumpleañosVelas {
    Scanner leer =new Scanner(System.in);
    
    int años;
    int max= -1000;
    int con=0;
    int []AlturaVela = new int[100]; 
    public void NoAños()
    {
    años = leer.nextInt();
    }
    public void Velas()
    {
        for (int j = 0; j < años; j++) 
        {
        AlturaVela[j]=(int)(Math.random()*años + 1);
        }
        DeterVelas();
    }
    public void DeterVelas()
    {
        for (int j = 0; j < años; j++)
        {
            if (AlturaVela[j] >= max) 
            {
                max = AlturaVela[j];
            }
        }
        for (int j = 0; j < años; j++)
        {
            if (AlturaVela[j] == max) 
            {
                con++;
            }
       }
        
    }
    public void Result()
    {
        for (int j = 0; j < años; j++) 
        {
            System.out.println("\n");
            System.out.print ("Tamaño vela "+(j + 1)+": " +AlturaVela[j]);
        } 
        System.out.println("\n");
        System.out.print ("LA CANTIDAD DE VELAS A QUE SE APAGAN ES: " +con );
        System.out.println("\n");
    }
}
