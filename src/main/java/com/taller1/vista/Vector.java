package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class Vector {
    
    public static void vectorFill(int prmVector[]) throws MathException
    {
        Console.printMessage("\tLLENADO DEL VECTOR:");
        
        for(int i = 0; i < prmVector.length; i++)
            prmVector[i] = Console.integerInput("Ingrese el numero de tipo entero de la posicion ("+(i+1)+")");
    }
    
    public static void vectorPrint(int prmVector[])
    {
        Console.printMessage("\tVECTOR OBTENIDO:");
        Console.print("[");
        
        for(int i = 0; i < prmVector.length - 1; i++)
            Console.print(prmVector[i]+", ");
        Console.println(prmVector[prmVector.length - 1]+"]");
    }
}
