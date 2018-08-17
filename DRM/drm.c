#include <stdio.h>
#include <string.h>
int longitud,suma1,suma2,i;
char linea[15001];
char mitad1[7501];
char mitad2[7501];
int main(int argc, char const *argv[]) {
  scanf("%s",linea );
  longitud=strlen(linea)/2;
  memcpy(mitad1,linea,longitud);
  mitad1[longitud]=0;
  strcpy(mitad2,linea+longitud);
  suma1=suma2=0;

  for (i = 0; i < longitud; i++) {
    suma1+=mitad1[i]-65;
    suma2+=mitad2[i]-65;
  }
  suma1%=26;suma2%=26;
  for (i = 0; i < longitud; i++) {
    int cod1=mitad1[i]+suma1,cod2;
    if (cod1>90) cod1-=26;
    cod2=mitad2[i]+suma2;
    if (cod2>90) cod2-=26;
    cod2-=65;
    cod1+=cod2;
    if (cod1>90) cod1-=26;
    printf("%c",cod1);
  }
  printf("\n");
  return 0;
}
