#include<stdio.h> #include<conio.h> 
int max,n; float p[10],w[10],tp=0.0,temp; float x[10]; void knapsack(); void maxp(); void minw(); void optimal(); void show(); void initialise(); void main() { int i; clrscr(); printf("Enter value of max weight and max no. of sacks"); scanf("%d %d", &max, &n); printf("Enter the profit in descending order and corresponding weight"); for(i=0;i<n;i++) { scanf("%f %f",&p[i],&w[i]); } initialise(); printf("\nMax profit"); maxp(); knapsack(); show(); initialise(); printf("\n Min weight"); minw(); knapsack(); show(); initialise(); printf("\n max profit by weight ratio"); optimal(); knapsack(); show(); getch(); } void initialise() { int i; 
for(i=0;i<n;i++) { 
x[i]=0.0; 
7 
} } void maxp() {int i,j; for(i=0;i<n;i++) { 
for(j=i+1;j<n;j++) { 
if(p[i]<p[j]) { temp=p[i]; p[i]=p[j]; p[j]=temp; temp=w[i]; w[i]=w[j]; w[j]=temp; } } } } void minw() { int i,j; 
for(i=0;i<n;i++) { 
for(j=i+1;j<n;j++) { 
if(w[i]>w[j]) { temp=p[i]; p[i]=p[j]; p[j]=temp; temp=w[i]; w[i]=w[j]; w[j]=temp; } } } } void optimal() {int i,j; for(i=0;i<n;i++) { 
8 
for(j=i+1;j<n;j++) { 
if((p[i]/w[i])<(p[j]/w[j])) { temp=p[i]; p[i]=p[j]; p[j]=temp; temp=w[i]; w[i]=w[j]; w[j]=temp; } } } } void knapsack() { int i=0; float U=max; tp=0; while(i<n) { if(w[i]>U) 
{ break; } else { 
x[i]=1.0; U=U-w[i]; tp=tp+p[i]; } i++; } if(i<n) { 
x[i]=U/w[i]; tp=tp+(x[i]*p[i]); } } void show() { int i; 
9 
for(i=0;i<n;i++) 
{ 
printf("\np=%3.2f\t w= %3.2f\tx=%3.2f",p[i],w[i],x[i]); } printf("\n Total profit is %f",tp); } 