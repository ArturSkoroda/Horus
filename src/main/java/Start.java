public class Start {
    public static void main(String[] args) {

        Block block = new Block() {
       @Override
       public String getColor() {
           return "white";
       }

       @Override
       public String getMaterial() {
           return "cegła";
       }
   };
    }
}
