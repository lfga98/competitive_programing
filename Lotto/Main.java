import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer pedazos=new StringTokenizer(br.readLine());
    int k =Integer.parseInt(pedazos.nextToken());
    while(k!=0){
    int[] barritasMarinela= new int[k];
    for (int x=0;x<k ;x++ ) {
      barritasMarinela[x]=Integer.parseInt(pedazos.nextToken());
    }
    for (int i = 0;i<k-5 ;i++ ){
        for (int j=i+1;j<k-4 ;j++ )
            for (int x=j+1;x<k-3 ;x++ )
                for (int l=x+1;l<k-2 ;l++ )
                        for (int b=l+1;b<k-1 ;b++)
                            for (int f = b+1;f<k;f++)
                                System.out.println(barritasMarinela[i]+" "+barritasMarinela[j]+" "+barritasMarinela[x]+" "+barritasMarinela[l]+" "+barritasMarinela[b]+" "+barritasMarinela[f]);
    }

    pedazos=new StringTokenizer(br.readLine());
    k =Integer.parseInt(pedazos.nextToken());
    if(k!=0) System.out.print("\n");
    }
  }
}
