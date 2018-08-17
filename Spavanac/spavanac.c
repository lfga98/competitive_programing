#include <stdio.h>
int h,m;
int rest=45;
int main(int argc, char const *argv[]) {
  scanf("%d %d",&h,&m);
  int resta=m-45;
  if (resta<0) {
    h--;
    if (h<0) {
      h=23;
    }
    m=60;
    m=m-(resta*(-1));
  }else{
    m=m-45;
  }
  printf("%d %d",h,m );
  return 0;
}
