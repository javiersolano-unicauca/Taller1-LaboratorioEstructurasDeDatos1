package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class MatrixComplexity extends Complexity {
    
    public MatrixComplexity()
    {
        super("matriz");
    }
    
    public void matrixRequest() throws MathException
    {
        saveStartTimeExec();
        
        int varM = Console.integerInput("Ingrese la cantidad de vectores de tipo entero que tendra la matriz"),
            varN = Console.integerInput("Ingrese la cantidad de numeros enteros que tendran los vectores"),
            mtrNumbers[][] = new int[varM][varN];
        
        matrixFill(mtrNumbers);
        matrixPrint(mtrNumbers);
        
        printExecTime();
        algoritmPrint();
    }
    
    public void matrixFill(int prmMatrix[][]) throws MathException
    {   
        for(int i = 0; i < prmMatrix.length; i++)
        {
            Console.printMessage("\tLLENADO DE VECTOR ("+(i+1)+"):");
            Vector.vectorFillWithoutFormat(prmMatrix[i]);
        }
    }
    
    public void matrixPrint(int prmMatrix[][])
    {
        Console.printMessage("\tMATRIZ OBTENIDA:");
        
        for(int i = 0; i < prmMatrix.length; i++)
            Vector.printVectorWithoutFormat(prmMatrix[i]);
    }
}
