import java.util.Scanner;
public class validateargs {
    public static void main(String[] args) {
        try{
            if(args[0]!=null){

            }
        }catch(Exception e){
            System.out.println("Ingresa una curp válida mediante argumentos");
        }
        System.out.println("La curp ingresada en argumentos es: "+args[0]);
        Scanner sc = new Scanner(System.in);
        String arg = args[0];
        if(validarcurp(arg)){
            System.out.println("Si es una curp válida");
        }else{
            System.out.println("No es una curp válida");
        }
    }
    public static boolean validarcurp(String curp){
        return curp.matches("[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" +
                "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" +
                "[HM]{1}" +
                "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" +
                "[B-DF-HJ-NP-TV-Z]{3}" +
                "[0-9A-Z]{1}[0-9]{1}$");
    }
}

