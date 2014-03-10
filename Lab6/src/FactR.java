public class FactR 
{
    public static Stack1Gen<FactRecord> s = new Stack1Gen<FactRecord>();

    public static int returnedValue; 

    public static void main(String args[]) 
    {
        s.push(new FactRecord(3));
        while(!s.isEmpty()) 
        {  
            s.top().run();
        }  
        System.out.println("Final Value is: " + returnedValue + "\n");
    } 
} 