package adivinanumero;
import java.util.Scanner;
public class AdivinaNumero 
{
    public static void main(String[] args) 
    {
        short numeroGanador = 0;
        short numeroUsuario;
        short intentos = 0;
        Scanner lector = new Scanner(System.in);
        
        for(int i=0; i<11; i++)
        {
            System.out.println("Generando número aleatorio... en " + i);
            numeroGanador = (short)(Math.random()*100+1);
        }
        do{
            System.out.print("Introduce el número que crees que se haya generado (1 - 100): ");
            numeroUsuario = lector.nextShort();
            intentos++;
            if(numeroUsuario==numeroGanador)
                System.out.println("Felicidades, adivinaste el número " + numeroGanador + "!!!!!!");
            else if(numeroUsuario>numeroGanador)
                System.out.println("Estas muy arriba..... intenta con un número menor...v");
            else
                System.out.println("Estas muy abajo.... intenta con un número mayor...^");
        }while(numeroUsuario != numeroGanador);
        
        System.out.println("Lo lograste en " + intentos + " intentos!!!");
    }

}
