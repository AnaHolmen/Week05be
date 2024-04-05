package week05be;

public class App { 

    public static void main(String[] args) {
        
        // Creating an instance of AsteriskLogger
        Logger log = new AsteriskLogger();
        
        // Testing log and error methods of AsteriskLogger
        log.log("Hello");
        System.out.println();
        
        log.error("hello");
        System.out.println();
        
        log.log("Hola");
        System.out.println();
        
        log.error("Hola");
        System.out.println();
        
        
        // Creating an instance of SpacedLogger
        SpacedLogger secondLog = new SpacedLogger();
     
       // Testing log and error methods of SpacedLogger
       secondLog.log("Hello");
       System.out.println();
       System.out.println("________________");
        
       System.out.println();   /*for line break */
       
       
       secondLog.error("Hello");
       System.out.println();
        System.out.println("________________");
        
        
        System.out.println();   /*for line break */
        
        
       
      secondLog.log("Hola");
      System.out.println();
       System.out.println("________________");
     
      
        System.out.println();  /*for line break */
       
       
       secondLog.error("Hola");
       System.out.println();
       System.out.println("________________");
   }
}