package basic.b1_datatypes.string;

public class Main {
    public static void main(String[] args) {
        String name = "Rahul";
stringPatterMatching(name);
    }

    public static void stringPatterMatching(Object message) {

       if(message instanceof String){
           System.out.println("Instance of string but message.length is not accessible as it is Object message");
       }
       if(message instanceof String name){
           System.out.println("Instance of string "+ name.length());
       }
    }
}
