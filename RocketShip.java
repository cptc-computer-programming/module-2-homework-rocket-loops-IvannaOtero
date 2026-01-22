// Ivanna
// 1/22/2026
// CPW 140

// This program will print a rocket 
// like this: 
/* 
```
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
```
 */

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
       printNoseCone(); // /**\
       printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }

    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
       
        for (int line = 1; line <= ROCKET_SIZE * 2 - 1; line ++) {
            // print spaces 
            for (int spaces = 1; spaces <= ROCKET_SIZE * 2 - 1 - line; spaces ++) { 
                System.out.print(" "); 
            }
            
            // print left slashes 
            for (int slashes = 1; slashes <= line; slashes ++) {
                System.out.print("/"); 
            }
            //print the stars in the middle 
            System.out.print("**");
            // print right slashes
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("\\");
            }

            // move onto next line 
            System.out.println();
        }
    }


    
    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();       
       printEdge();        
    }
    
    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        // your code goes here.
        for (int line = 1; line <= ROCKET_SIZE; line++) {
            System.out.print("|"); // Start of the line
        
            // dots before first diamond         
            for (int i = 1; i <= ROCKET_SIZE- line; i++ ) {
                System.out.print("."); 
            }

            // first diamond slashes 
            for (int i = 1; i <= line; i ++){ 
                System.out.print("/\\");
            }

            // dots between diamonds 
            for (int i = 1; i  <= 2 * (ROCKET_SIZE - line); i++) {
                System.out.print(".");
            }

            // second diamond slashes 
            for (int i = 1; i <=  line ; i ++){ 
                System.out.print("/\\");
            }

            // second dots
            for (int i = 1; i <= ROCKET_SIZE - line ; i ++) {
                System.out.print(".");
            }
            // end of line
                System.out.println("|");
            
            }
    }
    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        // your code goes here.
        for (int line = 1; line <= ROCKET_SIZE; line ++) {
            System.out.print("|"); // Start of the line
        
           // left dots
           for (int i = 1; i <= line - 1; i ++) {
                System.out.print("."); 
           }

           // 1st diamond: 
           for (int i = 1; i <= ROCKET_SIZE - line + 1; i ++) {
            System.out.print("\\/"); 
           }
           // middle dots 
           for (int i = 1; i <= (line - 1) * 2; i ++) {
            System.out.print(".");
           }
            // 2nd diamond:
            for (int i = 1; i <= ROCKET_SIZE - line + 1; i ++) {
            System.out.print("\\/"); 
           }
           // finishing dots
           for (int i = 1; i <=  line  - 1; i ++) {
            System.out.print(".");
           }

            // end of line
            System.out.println("|");

         }
    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket.
     */
    public static void printEdge() { // +=* edge lol 
        System.out.print ("+"); 

        for (int i = 1; i <= ROCKET_SIZE * 2; i ++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
}


