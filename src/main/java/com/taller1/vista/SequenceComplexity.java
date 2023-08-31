package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class SequenceComplexity extends Complexity {
    
    public SequenceComplexity()
    {
        super("secuencias");
    }
    
    public void addtwoNumbers() throws MathException
    {
        saveStartTimeExec();
        
        int varNumber1 = Console.integerInput("Ingrese el primer numero de tipo entero"),
            varNumber2 = Console.integerInput("Ingrese el segundo numero de tipo entero");
        
        Console.printMessage("La suma de los dos numeros es: "+(varNumber1 + varNumber2));

        printExecTime();
        algoritmPrint();        
    }
    
}
