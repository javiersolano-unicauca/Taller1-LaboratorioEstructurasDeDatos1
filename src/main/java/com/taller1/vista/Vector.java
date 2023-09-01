package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class Vector extends Complexity {
    
    public Vector()
    {
        super("vector");
    }
    
    public void requestVector() throws MathException
    {
        saveStartTimeExec();
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros enteros que tendra el vector"),
            vtrNumbers[] = new int[varSize];
       
        vectorFill(vtrNumbers);
        vectorPrint(vtrNumbers);
        
        printExecTime();
        algoritmPrint();
    }
    
    public static void vectorFill(int prmVector[]) throws MathException
    {
        Console.printMessage("\tLLENADO DEL VECTOR:");
        
        for(int i = 0; i < prmVector.length; i++)
            prmVector[i] = Console.integerInput("Ingrese el numero de tipo entero de la posicion ("+(i+1)+")");
    }
    
    public static void vectorFillWithoutFormat(int prmVector[]) throws MathException
    {
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
    
    public static void printVectorWithoutFormat(int prmVector[])
    {
        for(int i = 0; i < prmVector.length - 1; i++)
            Console.print(prmVector[i]+" ");
        Console.println(""+prmVector[prmVector.length - 1]);
    }
}
