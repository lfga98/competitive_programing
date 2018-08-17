import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{

  static boolean respuesta=false;
  static String respuestaFinal="NO";
  public static void main(String[] args) throws IOException {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


      StringTokenizer pedazos=new StringTokenizer(br.readLine());
      int duracion=Integer.parseInt(pedazos.nextToken());
      int numeroElementos=Integer.parseInt(pedazos.nextToken());
      int[] barritasMarinela= new int[numeroElementos];
      String respuesta="";
      for (int x=0;x<numeroElementos ;x++ ) {
        barritasMarinela[x]=Integer.parseInt(pedazos.nextToken());
      }

      Arrays.sort(barritasMarinela);
      System.out.println(sumarElementos(0,0,duracion,barritasMarinela,respuesta));
      System.out.println(respuesta);
      for (int x=0;x<numeroElementos ;x++ ) {
        System.out.print(barritasMarinela[x]);
      }
    }



  public static int sumarElementos(int posicion,int sumaActual,int objetivo,int[] arreglo,String respuesta){
    int regreso=0;
    if (sumaActual>=objetivo) {
      return regreso;
    }else{
      for (int i = posicion;i<arreglo.length ;i++ ) {
        if (sumaActual+arreglo[i]<=objetivo) {
          regreso=sumarElementos(i+1,sumaActual+arreglo[i],objetivo,arreglo,respuesta);
          respuesta+=regreso+"";
        }else{
          break;
        }
      }
      return regreso;
    }

  }

}
