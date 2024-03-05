public class Calculation {
    public void evenOdd(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
     } else {
  System.out.println(i + " is odd");
            } } }
      
 

  public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.evenOdd(100);
    }   }

