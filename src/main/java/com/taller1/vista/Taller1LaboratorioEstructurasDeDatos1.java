/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.taller1.vista;

import com.taller1.Libraries.Exceptions.MathException;
import com.taller1.Libraries.Files.File;

/**
 *
 * @author javiersolanop
 */
public class Taller1LaboratorioEstructurasDeDatos1 {

    public static void main(String[] args) throws MathException {
        
        File objFile = new File("D:\\Documentos\\NetBeansProjects\\Taller1-LaboratorioEstructurasDeDatos1\\src\\main\\java\\com\\taller1\\Sources");
        
        String[] arrContent = new String[12];
                
        arrContent[0] = "int varIntervalStart = Console.integerInput(\"Ingrse el numero de tipo entero que inicia el intervalo\"),";
        arrContent[1] = "    varIntervalFinish = Console.integerInput(\"Ingrese el numero de tipo entero que finaliza el intervalo\"),";
        arrContent[2] = "    varNumber = Console.integerInput(\"Ingrese un numero de tipo entero\");";
        arrContent[3] = "";
        arrContent[4] = "if((varNumber > varIntervalStart) && (varNumber < varIntervalFinish))";
        arrContent[5] = "    Console.printMessage(\"El numero se encuentra en el intervalo de (\"+varIntervalStart+\" - \"+varIntervalFinish+\")\");"; 
        arrContent[6] = "";    
        arrContent[7] = "else if((varNumber == varIntervalStart) || (varNumber == varIntervalFinish))";
        arrContent[8] = "    Console.printMessage(\"El numero es un extremo del intervalo de (\"+varIntervalStart+\" - \"+varIntervalFinish+\")\");";
        arrContent[9] = "";
        arrContent[10] = "else";
        arrContent[11] = "    Console.printMessage(\"El numero no se encuentra en el intervalo de (\"+varIntervalStart+\" - \"+varIntervalFinish+\")\");";

        objFile.exportTxt("condicion-compuesta-anidada", arrContent);

        NestedConditionComplexity objNestedConditionComplexity = new NestedConditionComplexity();
        objNestedConditionComplexity.componundCondition();
          
    }
    
    
    
}
