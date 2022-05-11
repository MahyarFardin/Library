package Log;

import java.io.*;

public class LogCollector {
    public static void Logger(String information){
        File logFile= new File("Log.log");
        try {
            FileWriter fileWriter = new FileWriter(logFile);        
            fileWriter.append(information);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Could not write");
            return;
        }
    }
}
