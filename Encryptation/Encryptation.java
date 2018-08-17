import java.io.*;
public class Encryptation{
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n= Integer.parseInt(in.readLine());;
    do {
      if (n!=0) {
        String resultado="";
        String linea = new String(in.readLine());
        linea=linea.replaceAll("\\s","");
        linea=linea.toUpperCase();
        String palabra[]=linea.split("");
        String encripcion[] = new String[palabra.length+2];
        if (n<palabra.length) {
          int counter=0;
          for (int y=0;y<n;y++ ) {
            for (int i=0;i<palabra.length ;i++ ) {
              if (i%n==0&&(counter<(palabra.length))&&((y+i)<(palabra.length))) {
                encripcion[y+i]=palabra[counter++];
              }
            }
          }
          for (int x=0;x<palabra.length ;x++ ) {
           resultado+=encripcion[x];
          }
          resultado=resultado.replaceAll("null","");

        }else{
          for (int x=0;x<palabra.length ;x++ ) {
           resultado+=palabra[x];
          }
        }

        System.out.println(resultado);
        n=Integer.parseInt(in.readLine());
      }

    } while (n!=0);


  }
}
