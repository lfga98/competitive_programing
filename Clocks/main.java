import java.io.*;
public class main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = in.readLine();
    String elems[]=line.split(":");
    int h = Integer.parseInt(elems[0]);
    int m=Integer.parseInt(elems[1]);
    while(!(m==0&&h==0)){
      double diff = m*6-(h*30+m*0.5);
      if (diff<0) diff*=-1;
      if (diff>180) diff=360-diff;
      System.out.printf("%.3f\n",diff);
      line = in.readLine();
      elems=line.split(":");
      h = Integer.parseInt(elems[0]);
      m=Integer.parseInt(elems[1]);
    }
  }
}
