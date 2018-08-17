#include <stdio.h>
int h,m;
double diff;
int main(int argc, char const *argv[]) {
  scanf("%d:%d",&h,&m);
  while (!(h==0 && m==0)) {
    double diff = m*6-(h*30+m*0.5);
    if (diff<0) diff*=-1;
    if (diff>180) diff=360-diff;
    printf("%.3f\n",diff );
    scanf("%d:%d",&h,&m);
  }
  return 0;
}
