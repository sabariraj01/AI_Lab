import java.io.*;

public class asgn4_1 
{
    public static void main(String[] ar) throws Exception 
    {
        Traffic_Signal o = new Traffic_Signal();
        File f = new File("Image_Sensor.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));

        int inputChar;
        while ((inputChar = br.read()) != -1) 
        {
            int route = Character.getNumericValue(inputChar);
            System.out.println("Sensor input : " + route);
            o.change_signal(route - 1);
        }
        br.close();
    }
}

class Traffic_Signal 
{
    char signal_light[] = { 'R', 'R', 'R', 'R' };

    void change_signal(int route) throws Exception
     {
        signal_light[route] = 'G';
        display();
        Thread.sleep(3000);
        signal_light[route] = 'R';
    }

    void display() 
    {
        for (int i = 0; i < 4; i++)
            System.out.print(signal_light[i] + " ");
        System.out.println();
    }
}
