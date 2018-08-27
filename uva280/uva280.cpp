#include <bits/stdc++.h>
using namespace std;
char visitado[101];
typedef vector<int> vi;
vector<vi> adj(101);
int n;

void dfs(int u){
  visitado[u]++;
  for(int i=0;i<(int)adj[u].size();i++){
    int v=adj[u][i];
    if(visitado[v]==0){
      dfs(v);
    }
  }
}


int main(int argc, char const *argv[]) {
  int num,origen,cant;
  scanf("%d",&n);
  while(n){
    adj.assign(n+1,vi());
    scanf("%d",&origen);
    while (origen) {
      scanf("%d",&num );
      while (num) {
        adj[origen].push_back(num);
        scanf("%d",&num );
      }
      scanf("%d",&origen);
    }
    scanf("%d", &cant);
    for (int i = 0; i < cant; i++) {
      int suma=0,j;
      scanf("%d",&origen);
      memset(visitado,0,n+1);
      visitado[origen]=-1;
      dfs(origen);
      for (j = 1; j <= n; j++) {
        suma+=visitado[j];
      }
      printf("%d",n-suma );
      for (j = 1; j <=n; j++) {
        if (visitado[j]==0) {
          printf(" %d", j);
        }
      }
      printf("\n");
    }
    scanf("%d",&n);
  }
  return 0;
}
