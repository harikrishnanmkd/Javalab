class Cpu{
   int price=40000;
   class processor{
     int noOfcores=5;
     String manufacture="Intel corp";
       void display(){
              System.out.println("**Processor Details**");
              System.out.println("No of cores:"+noOfcores);
              System.out.println("Manufacture:"+manufacture);
          }
    }
    void display(){
        processor p=new processor();
         p.display();
         System.out.println("Price:"+price);
   }

    static class RAM{
       int memory=8;
       String manufacture="nexgen Intel";
    void display(){
        System.out.println("\n**Ram Details**");
        System.out.println("Memory:"+memory);
        System.out.println("Manufacture:"+manufacture);
   }
 }
}
public class Cpus{
   public static void main(String [] args){
       Cpu c1=new Cpu();
       c1.display();


     Cpu.RAM r1=new Cpu.RAM();
      r1.display();
}
}
