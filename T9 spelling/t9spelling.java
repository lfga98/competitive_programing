import java.io.*;
public class t9spelling{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer tries = Integer.parseInt(in.readLine());
    String numeros[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999","0"};
    String letras[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1"};
    String resultado="";
    int indice=0;
    for (int i = 0;i<tries ;i++ ) {
      resultado="";
      String palabra=in.readLine().replace(" ","1");
      String palabras[]=palabra.split("");
      String letra;
      int valor=-200;
      for (int j=0;j<palabra.length() ;j++ ) {


        for (int x=0;x<27 ;x++ ) {

          if (palabras[j].equals(letras[x])) {
            if (x==valor ) {
              resultado+=" ";
            }
            else if (x==1||x==4||x==7||x==10||x==13||x==20) {
              if ((x-1==valor||x+1==valor)) {
                resultado+=" ";
                }
              }
            else if (x==2||x==5||x==8||x==11||x==14||x==21) {
                if ((x-2==valor||x-1==valor)) {
                  resultado+=" ";
                }
              }
              else if(x==0||x==3||x==6||x==9||x==12||x==19){
                if ((x+1==valor||x+2==valor)) {
                  resultado+=" ";
                }
              }
              else if(x==15||x==22){if(x+1==valor||x+2==valor||x+3==valor)
                {resultado+=" ";}
              }
              else if(x==16||x==23){if(x-1==valor||x+1==valor||x+2==valor)
                {resultado+=" ";}
              }
              else if(x==17||x==24){if(x-2==valor||x-1==valor||x+1==valor)
                {resultado+=" ";}}
              else if(x==18||x==25){if(x-3==valor||x-2==valor||x-1==valor)
              {resultado+=" ";}
            }

            resultado+=numeros[x];
            valor=x;
          }
        }
      }
      System.out.println("Case #"+(i+1)+": "+resultado);
    }

  }
}
