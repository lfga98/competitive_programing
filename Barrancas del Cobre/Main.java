import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n,k;String linea = in.readLine();String[] numeros = linea.split(" ");
    n=Integer.parseInt(numeros[0]);k=Integer.parseInt(numeros[1]);
    linea ="";numeros=null;linea = in.readLine();numeros = linea.split(" ");
    int anterior,actual=0,max=-1000000;int limite= (numeros.length-k)+1;
    for (int i =0 ;i<limite;i++ ) {
      if ((i+k)<=n) {
        int emocion=0;
        anterior=Integer.parseInt(numeros[i]);actual=Integer.parseInt(numeros[i+(k-1)]);
        emocion=actual-anterior;
        if (emocion>max)
          max=emocion;
        }
    }

    System.out.println(max);
  }
}
