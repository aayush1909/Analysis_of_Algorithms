#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,cost[100][100],n,v,d[100],visit[100],s,u,dis,min,path[100],count;
clrscr();
printf("Enter number of vertices\n");
scanf("%d",&n);
printf("Enter adajency matrix. Enter the cost of every edge in matrix and enter 0 if no such edge\n");
printf("Vertex:\t Cost");
printf("\n"); 
for(i=1;i<=n;i++)
{
  for(j=1;j<=n;j++)
  { 
    printf("%d,%d\t",i,j);
    scanf("%d",&cost[i][j]);
    if(cost[i][j]==0)
    cost[i][j]=10000;
  }

}
printf("Enter the source vertex\n");
scanf("%d",&v);

for(i=1;i<=n;i++)
{
 d[i]=cost[v][i];
 path[i]=v;
 visit[i]=0;
}
d[v]=0;
visit[v]=1;
count=1;
while(count<n-1)
{

 min=10000;

 for(j=1;j<=n;j++)
 {
  if((d[j]<min) && visit[j]==0)
 {
  min=d[j];
  u=j;
 }
 }
 visit[u]=1;
 for(j=1;j<=n;j++)
 {
    dis=d[u]+cost[u][j];
  if(dis<d[j] && visit[j]==0)
  {
   d[j]=dis;
   path[j]=u;
  }
 }
 count++;
}
for(i=1;i<=n;i++)
{
   if(i!=v && d[i]!=10000)
   {
   printf("%d -> %d,Cost is:  %d\n",v,i,d[i]);
   printf("Path is: %d",i);
   j=i;
   do
   {
   j=path[j];
   printf("<-%d",j);
   } while(j!=v);
   }
   printf("\n");
}
getch();
}

