#include <stdio.h>

#define size 10

void main()
{
int a[size][size]; int i,j,n;

void floyd(int[][j],int);

printf("Enter no. of vertices : ");
scanf("%d",&n);

printf("Give weighted graph matrix(FOR INFINITY PUT 9999): \n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("Enter a[%d][%d]:",i,j);
scanf("%d",&a[i][j]);
}
}

printf("The input weight matrix is:-n"); for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==9999)

printf("inft");

else
printf("%d\t",a[i][j]);
}

printf("\n");
}

floyd(a,n);

printf("\nThe final matrix (for calculating shortest distance):\n"); for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
printf("%5d",a[i][j]);
printf("\n");
}



}


void floyd(int a[size][size],int n)
{
int k,i,j;


for(k=0;k<n;k++)
{
for(i=0;i<n;i++)
{

for(j=0;j<n;j++)
{

/*Minimum is to be selected*/ if(a[i][j]>(a[i][k]+a[k][j]))

/*a[i][j] denotes distance between ith vertex and jth vertex*/ a[i][j]=(a[i][k]+a[k][j]);
}
}
}
}
