#include<iostream>
using namespace std;
int main()
{
    int n=2;
    int arr[n][n],i,j,sumR=0,sumC=0;
    cout<<"Enter elements of the 2D matrix: \n";
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }  
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            sumR=sumR+arr[i][j];
            sumC=sumC+arr[j][i];
        }        
        cout<<"\nSum of "<<i+1<<" th row is "<<sumR;
        cout<<"\nSum of "<<i+1<<" th column is "<<sumC;
        sumR=0;
        sumC=0;
    }
    return 0;
}
