#include<iostream>
using namespace std;
void stack()
{
    int ch,top=-1;
    int a[5];
    cout<<"Enter choice: \nPush:1\nPop:2\nDisplay:3\nQuit:4\n";
    do
    {
        cout<<"Enter choice : ";
        cin>>ch;
    switch(ch)
    {
        case 1:
            if(top==5-1)
                cout<<"Overflow\n";
            else
            {
                cout<<"Enter element : ";
                top++;
                cin>>a[top];
            }
            break;
        case 2:
            if(top==-1)
                cout<<"Underflow";
            else 
                top--;
            break;
        case 3:
            if(top==-1)
                cout<<"Stack is empty\n";
            else
                for(int i=top;i>=0;i--)
                    cout<<a[i]<<" ";
            break;
        case 4:
            exit(0);      
    }
    }while(ch);
}

void queue()
{
    int ch;
    int a[5],front=0,rear=0;
    cout<<"Enter choice: \nEnque:1\nDeque:2\nDisplay:3\nQuit:4\n";
    do
    {
        cout<<"Enter choice : ";
        cin>>ch;
    switch(ch)
    {
        case 1:
            if ((rear + 1) % 5 == front) 
            {
                cout << "Queue is full\n";
            } 
            else if (rear == 0) 
            {
                cout << "Enter element : ";
                cin >> a[rear];
                rear = (rear + 1) % 5;
            } 
            else 
            {
                cout << "Enter element:\n";
                cin >> a[rear];
                rear++;
            }
            break;
        case 2:
            if(front == rear) 
                cout << "Queue is empty\n";
            else
                front = (front + 1) % 5;  // Circular dequeue        
            break;
        case 3:
            for(int i = front; i != rear; i = (i + 1) % 5)
            {
                cout<<a[i]<<" ";
            }
            cout<<"\n";
            break;
        case 4:
            exit(0);      
    }
    }while(ch);
}

int main()
{
    int ch;
    cout<<"Enter '1' for Stack operation and '2' for Queue operation: \n";
    cin>>ch;
    switch(ch)
    {
        case 1:
            stack();
            break;
        case 2:
            queue();
            break;
    }
}
