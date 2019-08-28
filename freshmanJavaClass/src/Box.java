public class Box{
   public static void main(String[] args) {
     
     
     for(int i=0;i<5;i++){
       printw(5,0);
       System.out.println();
     }
     /*printP();
     for(int i=0;i<9;i++){
       
       if(0==i%2){
         printBJ();
       }
       else{
         printB();
       }
       printP();
     }*/
   }
   public static void printP(){
     System.out.print("+");
     for(int i=0;i<10;i++){
       System.out.print("-");
     }
     System.out.print("+");
     System.out.println();
   }
    public static void printw(int w,int h){
     //System.out.print("+");
     for(int i=0;i<w;i++){
       System.out.print("-");
     }
     System.out.println();
     System.out.print("-");
     for(int i=0;i<w-2;i++){
       System.out.print(" ");
     }
     System.out.println("-");
     for(int i=0;i<w;i++){
       System.out.print("-");
     }
   }
   public static void printB(){
     System.out.print("|");
     for(int i=0;i<10;i++){
       System.out.print(" ");
     }
     System.out.print("|");
     System.out.println();
   }
   public static void printBJ(){
     System.out.print("|");
     for(int i=0;i<3;i++){
       System.out.print(" ");
       
     }
     System.out.print("Java");
     for(int i=0;i<3;i++){
       System.out.print(" ");
     }
     System.out.print("|");
     System.out.println();
   }
}