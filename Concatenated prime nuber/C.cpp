#include <bits/stdc++.h>
using namespace std;
char k,c;
int num;
bitset<10000000> esprimo;
void criba(int nummax){
	esprimo.set();
	esprimo[0]=esprimo[1]=0;
	for (int i = 2; i <= sqrt(nummax); i++) {
		if(esprimo[i]){
			for (int j = i*i; j <= nummax; j+=i) {
				esprimo[j]=0;
			}
		}
	}
}
int main(int argc, char const *argv[]) {
	int i;
	char feliz;
	string s1;
	criba(9999999);
	while(scanf("%c%*c",&k)!=EOF ){
		k-='0';feliz=1;
		while (scanf("%c",&c)!=EOF && c!='\n') {
			num=c-'0';
			for (i = 1; i < k; i++) {
				scanf("%c",&c );
				num=num*10+(c-'0');
			}
			if(!esprimo[num]){
				//while (scanf("%c",&c)!=EOF && c!='\n');
				feliz=0;
				break;
			}
		}
		if (feliz)printf(":)\n");
		else printf(":(\n");
	}
	return 0;
}
