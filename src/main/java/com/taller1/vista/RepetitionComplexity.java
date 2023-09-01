package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;
import com.taller1.vista.Complexity;

/**
 * @author javiersolanop
 */
public class RepetitionComplexity extends Complexity {
    
    public RepetitionComplexity()
    {
        super();
    }
    
    public void repetitionForSimple() throws MathException
    {
        setFile("repeticion-for-simple");
        saveStartTimeExec();
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucesion Fibonacci que desea"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        for(int i = 1; i <= varSize; i++)
        {
            Console.println(""+varNumberAfter);
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux;
        }
        
        printExecTime();
        algoritmPrint();
    }
    
    public void repetitionWhileSimple() throws MathException
    {
        setFile("repeticion-while-simple");
        saveStartTimeExec();
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucesion Fibonacci que desea"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        int i = 1;
        
        while(i <= varSize)
        {
            Console.println(""+varNumberAfter);
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux; 
            
            i++;
        }
        
        printExecTime();
        algoritmPrint();
    }  
    
    public void repetitionDoWhileSimple() throws MathException
    {
        setFile("repeticion-do-while-simple");
        saveStartTimeExec();
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucesion Fibonacci que desea"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        int i = 1;
        
        do{            
            Console.println(""+varNumberAfter);
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux; 
            
            i++;
            
        }while(i <= varSize);
        
        printExecTime();
        algoritmPrint();
    }     
    
}
