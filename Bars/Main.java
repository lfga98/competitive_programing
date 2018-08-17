import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{

  static boolean respuesta=false;
  static String respuestaFinal="NO";
  public static void main(String[] args) throws IOException {
    int casos;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    casos =Integer.parseInt(br.readLine());
    for (int i =0;i<casos ;i++ ) {
      int limite,numeroElementos;
      limite=Integer.parseInt(br.readLine());
      numeroElementos=Integer.parseInt(br.readLine());
      //System.out.println(limite);
      StringTokenizer pedazos=new StringTokenizer(br.readLine());
      int[] barritasMarinela= new int[numeroElementos];
      for (int x=0;x<numeroElementos ;x++ ) {
        barritasMarinela[x]=Integer.parseInt(pedazos.nextToken());
      }
      respuestaFinal="NO";
      Arrays.sort(barritasMarinela);
      respuesta=false;
      sumarElementos(0,0,limite,barritasMarinela);
      //System.out.println(respuesta);
      //System.out.println(respuestaFinal);
      if (respuesta) {
        respuestaFinal="YES";
      }
      System.out.println(respuestaFinal);

    }


  }

  public static void sumarElementos(int posicion,int sumaActual,int objetivo,int[] arreglo){
    if (sumaActual==objetivo) {
      //System.out.println(sumaActual);
      //System.out.println(objetivo);
      respuesta = true;
      //return true valgame
    }else{
      //System.out.print(posicion);
      for (int i = posicion;i<arreglo.length ;i++ ) {
        if (sumaActual+arreglo[i]<=objetivo) {
          sumarElementos(i+1,sumaActual+arreglo[i],objetivo,arreglo);
          //sumarElementos(posicion+1,sumaActual+arreglo[i],objetivo,arreglo);
        }//else{
          //return false
        //}
      }
    }
    //return respuesta
  }
}
