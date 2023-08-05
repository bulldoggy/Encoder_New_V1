public class Main {
     public static void main(String args[]) {
         EncoderV1 e1 = new EncoderV1('B');
         String a = e1.encode("HELLO WORLD");
         System.out.println(a);
         System.out.println(e1.decode(a));

         EncoderV1 e2 = new EncoderV1('F');
         String b = e2.encode("HELLO WORLD");
         System.out.println(b);
         System.out.println(e2.decode(b));

         try {
             EncoderV1 e3 = new EncoderV1('~');
         } catch(IllegalArgumentException ex) {
             System.out.println(ex.getMessage());
         }

         try {
             EncoderV1 e4 = new EncoderV1();
             e4.encode("HELLO WORLD");
         } catch(RuntimeException ex) {
             System.out.println(ex.getMessage());
         }
     }
}
