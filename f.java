import javax.xml.bind.DatatypeConverter;

    public class f{

       public static void main(String a[]){

          String str = new String(DatatypeConverter.parseBase64Binary("user:123"));
          String res = DatatypeConverter.printBase64Binary(str.getBytes());
          System.out.println(res);
       }
    }
