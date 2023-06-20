class NumberSorting
{
pblic static void main(String args[])
{
int number[]={10,20,30,40};
int n=number.length;
System.out.print("Given list:");
for(int i=0;i<n;i++)
{
System.out.print(" "+number[i]);
}
System.out.println("\n");
for(int i=0;i<n;i++)
{
for(int j=i+;j<n;j++)
{
if(number[i]>number[j])
{
int temp=number[i];
number[i]=number[j];
number[j]=temp;
}
}
}
System.out.print("Sorted List:");
for(int i=0;i<n;i++)
{