#include <bits/stdc++.h>
using namespace std;
char k,c;
int num;
bitset<10000000> noesprimo;
char cad[8];

void criba(int nummax){
	noesprimo[0]=noesprimo[1]=1;
	int tope = (int) sqrt(nummax);
	for(int i = 4; i <= nummax; i+=2) {
		noesprimo[i]=1;
	}
	for(int i = 3; i <= tope; i+=2) {
		if(!noesprimo[i]){
			for(int j = i*i; j <= nummax; j+=i){
				noesprimo[j]=1;
			}
		}

	}
}

int main() {
	int i;
	char feliz;
	criba(9999999);
	while(scanf("%c%*c",&k)!=EOF ){
		k-='0';feliz=1;
		while (fgets(cad, k+1, stdin)) {
			if(cad[0]!='\n'){
				num = cad[0]-'0';
				for (i = 1; i < k; i++) {
					num=num*10+(cad[i]-'0');
				}
				if(noesprimo[num]){
					while (scanf("%c",&c)!=EOF && c!='\n');
					feliz=0;
					break;
				}
			} else break;
		}
		if (feliz)printf(":)\n");
		else printf(":(\n");
	}
	return 0;
}
