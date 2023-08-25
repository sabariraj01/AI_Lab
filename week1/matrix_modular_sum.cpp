#include<iostream>
using namespace std;
int sumR(int rowid,int n)
{
    int arr[n][n],i,j,sum=0;
    cout<<"Enter elements: \n";
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }  
    }
    for(j=0;j<n;j++)
    {
        sum=sum+arr[rowid][j];
    }
    cout<<"\nSum of the row is ";
    return sum;
}

int main()
{
    int rowid,n;
    cout<<"Enter rowid and order of matrix: \n";
    cin>>rowid>>n;
    cout<<sumR(rowid,n);
    return 0;
}

