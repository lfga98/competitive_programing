import java.util.BitSet;
import java.io.*;
public class flexible{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = in.readLine();
    String[] nums= line.split(" ");
    int longitud=Integer.parseInt(nums[0]);
    int particiones=Integer.parseInt(nums[1]);
    int resultado=0;
    int resta=-1;
    Integer[] parti=new Integer[particiones+2];
    String resultadoFinal="";
    String numeros = "0 " +in.readLine();
    String numerosLargos[]=numeros.split(" ");

    parti[0]=0;
    for (int i=1;i<parti.length-1 ;i++ ) {
      parti[i]=Integer.parseInt(numerosLargos[i]);
    }
    parti[parti.length-1]=longitud;
    BitSet tam = new BitSet(longitud);
  for (int i = 0; i < parti.length - 1; i++) {
      for (int j = i + 1; j < parti.length; j++) {

             tam.set(parti[j] - parti[i]);
        }
    }
         for (int i = 0; i <= longitud; i++) {
             if (tam.get(i)) {
                 System.out.print(i);
                 System.out.print(' ');
             }
           }


      }
}
