package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;

/**
 * @author javiersolanop
 */
public class NestedConditionComplexity extends Complexity {
    
    public NestedConditionComplexity()
    {
        super();
    }
    
    public void simpleCondition() throws MathException
    {
        setFile("condicion-simple-anidada");
        saveStartTimeExec();
        
        int varNumber1 = Console.integerInput("Ingrese el primer numero de tipo entero"),
            varNumber2 = Console.integerInput("Ingrese el segundo numero de tipo entero");
        
        if(varNumber1 > varNumber2)
            Console.printMessage("El primer numero es mayor que el segundo.");
        
        else if(varNumber1 == varNumber2)
            Console.printMessage("Los dos numeros son iguales.");
        
        else
            Console.printMessage("El primer numero es menor que el segundo.");

        printExecTime();        
        algoritmPrint();
    }
    
    public void componundCondition() throws MathException
    {
        setFile("condicion-compuesta-anidada");
        saveStartTimeExec();       
        
        int varIntervalStart = Console.integerInput("Ingrse el numero de tipo entero que inicia el intervalo"),
            varIntervalFinish = Console.integerInput("Ingrese el numero de tipo entero que finaliza el intervalo"),
            varNumber = Console.integerInput("Ingrese un numero de tipo entero");
        
        if((varNumber > varIntervalStart) && (varNumber < varIntervalFinish))
            Console.printMessage("El numero se encuentra en el intervalo de ("+varIntervalStart+" - "+varIntervalFinish+")");
        
        else if((varNumber == varIntervalStart) || (varNumber == varIntervalFinish))
            Console.printMessage("El numero es un extremo del intervalo de ("+varIntervalStart+" - "+varIntervalFinish+")");
        
        else
            Console.printMessage("El numero no se encuentra en el intervalo de ("+varIntervalStart+" - "+varIntervalFinish+")");

        printExecTime();
        algoritmPrint();
    }
}
