package com.taller1.vista;

import com.taller1.Libraries.Consoles.Console;
import com.taller1.Libraries.Files.File;

/**
 * @author javiersolanop
 */
public class Complexity {
    
    private File atrFile;
    private final String ATR_PATH_FILE = "\\src\\main\\java\\com\\taller1\\Sources";
    private String atrFileName;
    private long atrStartTime;
    
    public Complexity()
    {
        atrFile = new File(ATR_PATH_FILE);
        atrFileName = "";
    }
    
    public Complexity(String prmFileName)
    {
        atrFile = new File(ATR_PATH_FILE);
        atrFileName = prmFileName;
    }
    
    protected void setFile(String prmFileName)
    {
        atrFileName = prmFileName;
    }
    
    protected void algoritmPrint()
    {
        Console.titlePrint("ALGORITMO ANALIZADO");
        
        String[] arrContent = atrFile.importTxt(atrFileName);
        
        for(String row: arrContent)
            Console.println(row);
        Console.titlePrint("FIN ALGORITMO");
    }
    
    protected void saveStartTimeExec()
    {
        atrStartTime = System.nanoTime();
    }
    
    protected void printExecTime()
    {
        long varTimeFinishExec = System.nanoTime() - atrStartTime;
        Console.printMessage("Tiempo de ejecucion: "+(varTimeFinishExec/1000000000)+" segundos.");
    }
}
