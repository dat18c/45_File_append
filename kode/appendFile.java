import java.io.*;

public class appendFile
{
  public static void main(String[] args)
  {
   try
   {
      FileWriter fw = new FileWriter("minFil.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter output = new PrintWriter(bw);
      output.println("Test af append");
      output.flush();
      output.close();
   }  
   catch( IOException e ){
      System.out.println("Fejl ved skrivning: " + e);
   }
  }
}