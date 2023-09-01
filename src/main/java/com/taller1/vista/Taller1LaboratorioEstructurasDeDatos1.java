/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Exceptions.MathException;
import com.taller1.Libraries.Files.File;

/**
 *
 * @author javiersolanop
 */
public class Taller1LaboratorioEstructurasDeDatos1 {

    public static void main(String[] args) throws MathException {
        
        File objFile = new File("D:\\Documentos\\NetBeansProjects\\Taller1-LaboratorioEstructurasDeDatos1\\src\\main\\java\\com\\taller1\\Sources");
        
        String[] arrContent = new String[1];
                
        arrContent[0] = "";
//arrContent[0] = "int varSize = Console.integerInput(\"Ingrese la cantidad de numeros de la sucesion Fibonacci que desea\"),";
//arrContent[1] = "    varNumberBefore = 1,";
//arrContent[2] = "    varNumberAfter = 0,";
//arrContent[3] = "    varAux;";
//arrContent[4] = "";
//arrContent[5] = "Console.printMessage(\"\tSUCESION OBTENIDA:\");";
//arrContent[6] = "";
//arrContent[7] = "int i = 1;";
//arrContent[8] = "";
//arrContent[9] = "do{";
//arrContent[10] = "    Console.println(\"\"+varNumberAfter);";
//arrContent[11] = "    varAux = varNumberAfter;";
//arrContent[12] = "    varNumberAfter += varNumberBefore;";
//arrContent[13] = "    varNumberBefore = varAux; ";
//arrContent[14] = "";
//arrContent[15] = "    i++;";
//arrContent[16] = "";
//arrContent[17] = "}while(i <= varSize)";
//
//        objFile.exportTxtWithLn("matriz", arrContent);
//
//        NestedConditionComplexity objNestedConditionComplexity = new NestedConditionComplexity();
//        objNestedConditionComplexity.componundCondition();

//        RepetitionComplexity objRepetitionComplexity = new RepetitionComplexity();
//        objRepetitionComplexity.repetitionDoWhileSimple();

//          NestedRepetitionComplexity objNestedRepetitionComplexity = new NestedRepetitionComplexity();
//          objNestedRepetitionComplexity.repetitionDoWhileNested();

//          SequenceComplexity objSequenceComplexity = new SequenceComplexity();
//          objSequenceComplexity.addtwoNumbers();

//        String[] txt = objFile.importTxt("repeticion-for-simple");
//          
//        for(String row: txt)
//            Console.print(row);

//        Vector objVector = new Vector();
//        objVector.requestVector();

    MatrixComplexity objMatrixComplexity = new MatrixComplexity();
    objMatrixComplexity.matrixRequest();

    }
    
    
    
}
