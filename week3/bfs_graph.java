import java.util.*;
public class asgn3_1
{
    public static void main(String[] ar)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter number of nodes : ");
        int n=i1.nextInt();
        int a[][]=new int[n][n];
        Graph o=new Graph(a,i1);
        o.display(n,a);
        System.out.println("Enter the source node : ");
        int src=i1.nextInt();
        o.bfs_leftToRight(n,a,src);
        o.bfs_rightToLeft(n,a,src);
        i1.close();
    }
}
class Graph
{
    Graph(int a[][],Scanner i1)
    {
        int x,y,cn;
        System.out.println("Enter number of edges : ");
        cn=i1.nextInt();
        System.out.println("Enter the edges : ");
        for(int i=0;i<cn;i++)
        {
            x=i1.nextInt();
            y=i1.nextInt();
            a[x][y]=1;
            a[y][x]=1;
        }
    }
    void display(int n,int a[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void bfs_leftToRight(int n, int a[][], int src) 
    {
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.offer(src);
        visited[src] = true;

        System.out.println("BFS Traversal from left to right :");
        while (!q.isEmpty()) 
        {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int i=0; i<n; i++) 
            {
                if (a[curr][i] == 1 && !visited[i]) 
                {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    void bfs_rightToLeft(int n, int a[][], int src) 
    {
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        visited[src] = true;

        System.out.println("\nBFS Traversal from right to left :");
        while (!q.isEmpty()) 
        {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int i=n-1; i>=0; i--) 
            {
                if (a[i][curr] == 1 && !visited[i]) 
                {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
