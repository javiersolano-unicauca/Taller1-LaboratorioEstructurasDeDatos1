package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class NestedRepetitionComplexity extends Complexity {
    
    public NestedRepetitionComplexity()
    {
        super();
    }
    
    public void repetitionForNested() throws MathException
    {
        setFile("repeticion-for-anidado");
        saveStartTimeExec();
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucesion Fibonacci que desea"),
            varAmountMultiples = Console.integerInput("Ingrese la cantidad de multiplos por tabla"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        for(int i = 1; i <= varSize; i++)
        {           
            Console.printMessage("\tTABLA DEL NUMERO ("+varNumberAfter+"):");    
            
            for(int j = 1; j <= varAmountMultiples; j++)
                Console.println(varNumberAfter+" * "+j+" = "+(varNumberAfter*j));
            
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux;
        }
        
        printExecTime();
        algoritmPrint();
    }
    
    public void repetitionWhileNested() throws MathException
    {
        setFile("repeticion-while-anidado");
        saveStartTimeExec();      
        
        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucecion Fibonacci que desea"),
            varAmountMultiples = Console.integerInput("Ingrese la cantidad de multiplos por tabla"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        int i = 1, j;
        
        while(i <= varSize)
        {
            Console.printMessage("\tTABLA DEL NUMERO ("+varNumberAfter+"):");            
            j = 1;
            
            while(j <= varAmountMultiples)
            {
                Console.println(varNumberAfter+" * "+j+" = "+(varNumberAfter*j));
                j++;
            }
            
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux;
           
            i++;
        }
        
        printExecTime();
        algoritmPrint();
    }
    
    public void repetitionDoWhileNested() throws MathException
    {
        setFile("repeticion-do-while-anidado");
        saveStartTimeExec();  

        int varSize = Console.integerInput("Ingrese la cantidad de numeros de la sucecion Fibonacci que desea"),
            varAmountMultiples = Console.integerInput("Ingrese la cantidad de multiplos por tabla"),
            varNumberBefore = 1,
            varNumberAfter = 0,
            varAux;
        
        Console.printMessage("\tSUCESION OBTENIDA:");
        
        int i = 1, j;
        
        
        do{
            Console.printMessage("\tTABLA DEL NUMERO ("+varNumberAfter+"):");            
            j = 1;         
            
            do{
                Console.println(varNumberAfter+" * "+j+" = "+(varNumberAfter*j));
                j++;
                
            }while(j <= varAmountMultiples);
            
            varAux = varNumberAfter;
            varNumberAfter += varNumberBefore;
            varNumberBefore = varAux;
           
            i++;
            
        }while(i <= varSize);
        
        printExecTime();
        algoritmPrint();        
    }
}
