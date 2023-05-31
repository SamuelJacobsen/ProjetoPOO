//Samuel penha jacobsen  RA:2269074
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntDados {
    static InputStreamReader c = new InputStreamReader(System.in);
    static BufferedReader cd = new BufferedReader(c);

    public int leiaInt(){
        String x = new String();
        try{
            x = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        return Integer.parseInt(x);
    }

    public String leiaString(){
        String s = new String();
        try{
            s = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
        return s;
    }

    public Double leiaDouble(){
        String s = new String();
        try{
            s = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
        return Double.parseDouble(s);
    }
}