public class Main {
   public static void main(String[] args) {
     Factory fc = new Factory();
     ProductA pa = fc.createProductA();
     ProductB pb = fc.createProductB();
     System.out.println(pa.Name);
     System.out.println(pb.Name);
   }
}
