#include<stdio.h> 
#include<conio.h> 
#include<string.h> 
void main() 
{ 
char x[20],y[20],B[20][20],l,lcs[20]; 
int c[20][20],i,j,n,m; 
clrscr(); 
printf("\nEnter the first string:"); 
gets(x); 
printf("\nEnter the second string:"); 
gets(y); 
n = strlen(x) + 1; 
m = strlen(y) + 1; 
for(i=0;i<m;i++) 
{ 
for(j=0;j<n;j++) 
{ 
if((i==0)||(j==0)) 
{ 
c[i][j] = 0; 
B[i][j] = 'N'; 
printf("\t %d",c[i][j]); 
} else if(x[i-1] == y[j-1]) 
{ 
c[i][j] = c[i-1][j-1]+1; 
B[i][j] = 'D'; 
printf("\tD: %d",c[i][j]); 
} else 
if(c[i][j-1]>=c[i-1][j]) 
{ 
c[i][j] = c[i][j-1]; 
B[i][j] = 'L'; 
printf("\tL: %d",c[i][j]); 
} else 
{ 
c[i][j] = c[i-1][j]; 
B[i][j] = 'U'; 
printf("\tU: %d",c[i][j]); 
} 
} printf("\n"); 
} l = c[m-1][n-1]; 
printf("\nLength of longest common sequence = %d",c[m-1][n-1]); 
i = m-1; 
j = n-1; 
while(l > 0) 
{ if(B[i][j] == 'L') 
{ j--; 
} else if(B[i][j] == 'U') 
{ i--; 
} else 
{ lcs[l-1] = y[j-1]; 
i--; 
j--; 
l--; 
} } printf("\n The longest common subsequence is:"); 
puts(lcs); 
getch(); 
} 
