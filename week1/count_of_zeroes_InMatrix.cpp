#include<iostream>
using namespace std;
int main()
{
    int n=2;
    int arr[n][n],i,j,sum=0;
    cout<<"Enter elements of the 2D matrix: \n";
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }  
    }

    int colid,z=0;
    cout<<"Enter column: \n";
    cin>>colid;
    for(i=0;i<n;i++)
    {
        if(arr[i][colid]==0)
        z++;
    }
    cout<<"Number of zeroes is "<<z;
    return 0;
}

