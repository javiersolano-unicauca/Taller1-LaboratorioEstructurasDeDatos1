package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class ConditionComplexity extends Complexity {
    
    public ConditionComplexity() {
        super();
    }
    
    public void simpleCondition() throws MathException
    {
        setFile("condicion-simple");
        saveStartTimeExec();
        
        int varNumber1 = Console.integerInput("Ingrese el primer numero de tipo entero"),
            varNumber2 = Console.integerInput("Ingrese el segundo numero de tipo entero");
        
        if(varNumber1 > varNumber2)
            Console.printMessage("El primer numero es mayor que el segundo.");
        
        else
            Console.printMessage("El primer numero no es mayor que el segundo.");

        printExecTime();        
        algoritmPrint();
    }
    
    public void componundCondition() throws MathException
    {
        setFile("condicion-compuesta");
        saveStartTimeExec();
        
        int varIntervalStart = Console.integerInput("Ingrse el numero de tipo entero que inicia el intervalo"),
            varIntervalFinish = Console.integerInput("Ingrese el numero de tipo entero que finaliza el intervalo"),
            varNumber = Console.integerInput("Ingrese un numero de tipo entero");
        
        if((varNumber >= varIntervalStart) && (varNumber <= varIntervalFinish))
            Console.printMessage("El numero se encuentra en el intervalo de ("+varIntervalStart+" - "+varIntervalFinish+")");
        
        else
            Console.printMessage("El numero no se encuentra en el intervalo de ("+varIntervalStart+" - "+varIntervalFinish+")");

        printExecTime();
        algoritmPrint();
    }
    
}
