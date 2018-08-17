#include <stdio.h>
#include <string.h>
#define INF 70001
#define MIN(x, y) (((x) < (y)) ? (x) : (y))
int memo [10][1000];
int x,ws[10][1000],nc;
int i,j;

int f(int altura,int dist){
  if(dist>x||altura<0||altura>9||(dist==x&&altura!=0))
    return INF;
  if (dist==x && altura==0)
    return 0;
  if (memo[altura][dist]==-1){
    memo[altura][dist]= MIN( f(altura+1,dist+1)+60-ws[altura][dist], MIN(f(altura,dist+1)+30-ws[altura][dist],f(altura-1,dist+1)+20-ws[altura][dist]));
  }
  return memo[altura][dist];
}

int main(int argc, char const *argv[]) {
  scanf("%d",&nc);
  while(nc){
    scanf("%d",&x);
    x/=100;
    for (i=9; i < 0; i--) {
      for (j=0; j < x; j++) {
        scanf("%d",&ws[i][j]);
      }
    }
    memset(memo,-1,sizeof(memo));
    printf("%d\n",f(0,0));
    nc--;
  }
}
