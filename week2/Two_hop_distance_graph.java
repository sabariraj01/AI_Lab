import java.util.Scanner;
class asgn2_2 
{
    public static void main(String[] ar)
    {
        int src=0;
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter number of nodes : ");
        int n=i1.nextInt();
        Graph o=new Graph(n);

        System.out.println("Enter number of edges : ");
        int e=i1.nextInt();
        System.out.println("Enter edges : ");
        for(int i=0;i<e;i++)
            o.add_edge(i1.nextInt(),i1.nextInt());

        o.twoHop(src,n);
        i1.close();
    }
}
class Graph
{
    int a[][];
    Graph(int n)
    {
        a=new int[n][n];
    }

    void add_edge(int i,int j)
    {
        a[i][j]=1;
        a[j][i]=1;
    }

    void twoHop(int src,int n)
    {
        System.out.println("Two hop distance nodes are: ");        
        for(int i=0;i<n;i++)
        {
            if(a[src][i]==1)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]==1 && j!=src)
                    {
                        System.out.print(j+" ");
                    }
                }
            }
        }
    }
}
