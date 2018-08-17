import java.io.*;
public class ToiletSeat{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String linea = in.readLine();
    char anterior=linea.charAt(0);
    int caso1=0;
    int caso2=0;
    int caso3=0;
    for (int i =1;i<linea.length() ;i++ ) {
      char result=linea.charAt(i);
      if ((result=='U'&& anterior=='D'&& i==1)||result=='D') {
        caso1+=2;
        if (i==1 && (result=='U'&& anterior=='D')) {
          caso1=1;
        }
        if (i==1 && (result=='D'&& anterior=='D')) {
          caso1=1;
        }

      }

      if ((result=='U'&& anterior=='U'&& i==1)||(result=='D'&& anterior=='U'&& i==1)||result=='U') {
        caso2+=2;
        if (i==1 && (result=='U'&& anterior=='U')) {
          caso2=1;
        }
        if (i==1 && (result=='D'&& anterior=='U')) {
          caso2=1;
        }
      }
      if (anterior!=result) {
        caso3++;
      }
      anterior=result;
    }
    System.out.println(caso1);
    System.out.println(caso2);
    System.out.println(caso3);
  }
}
