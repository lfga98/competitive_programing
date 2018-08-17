import java.io.*;
public class drm{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String linea = in.readLine();
    int longitud = linea.length()/2;
    String mitad1 = linea.substring(0,longitud);
    String mitad2 = linea.substring(longitud);
    int suma1=0,suma2=0;
    for (int i =0;i<longitud ;i++ ) {
      char c= mitad1.charAt(i);
      suma1+=(int)c-65;
      c=mitad2.charAt(i);
      suma2+=(int)c-65;
    }
    suma1%=26;suma2%=26;
    for (int j =0;j<longitud ;j++ ) {
      int cod1=(int)mitad1.charAt(j)+suma1;
      if(cod1>90)cod1-=26;
      int cod2 = (int)mitad2.charAt(j)+suma2;
      if(cod2>90)cod2-=26;
      cod2-=65;
      cod1+=cod2;
      if(cod1>90)cod1-=26;
      System.out.print((char)cod1);
    }
    System.out.println();
  }
}
