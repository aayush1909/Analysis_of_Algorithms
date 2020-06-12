#include<stdio.h>
#include<conio.h>

int k,ans[10]={0},p[10],w[10],n,i,j,x[10][10],mW;
void initialise();
void dynamicknap();
void zeroone();
void main()
{

clrscr();
printf("Enter number: ");
scanf("%d",&n);

printf("\nEnter profits: ");
for(i=1;i<=n;i++)
  scanf("%d",&p[i]);

printf("\nEnter weights: ");
for(i=1;i<=n;i++)
  scanf("%d",&w[i]);

printf("\nEnter the capacity of knapsack : ");
 scanf("%d",&mW);

initialise();
dynamicknap();
zeroone();

printf("0/1 Knapsack is ");
printf("{ ");
for(i=1;i<=n;i++)
printf("%d ",ans[i]);
printf("}");
printf("\n");

printf("The max profit table is: \n");
for(i=0;i<=n;i++)
 {
  for(j=1;j<=mW;j++)
    printf("%d\t",x[i][j]);
  printf("\n");
 }
printf("Maximum profit is %d",x[n][mW]);

getch();
}

void initialise()
{
for(j=0;j<=mW;j++)   //intialising
   x[0][j]=0;
}

void dynamicknap()
{
for(i=1;i<=n;i++)       //filling the Knapsack table
 {
   for(j=0;j<=mW;j++)
   {
     if(w[i]<=j)
     {
      if(x[i-1][j]>(x[i-1][j-w[i]]+p[i]))
       x[i][j]=x[i-1][j] ;
      else
       x[i][j]=x[i-1][j-w[i]]+p[i];
     }
      else
      x[i][j]=x[i-1][j];
   }
}
}

void zeroone()
{
i=n;
k=mW;
while(i>0 && k>0)
{
 if(x[i][k]!=x[i-1][k])
 {
  ans[i]=1;
  k=k-w[i];
  i--;
 }
 else
 i--;
}
}