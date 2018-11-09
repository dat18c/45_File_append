import java.io.*;

public class appendFile
{
  public static void main(String[] args)
  {
   try
   {
      //lav filobjekt
      FileWriter fw = new FileWriter("minFil.txt", true);
      //lav buffer, da der ellers bliver skrevet med det samme.
      //Det kan være dyrt i forhold til at gemme i buffer.
      //BufferedWriter bw = new BufferedWriter(fw);
      //lav Printobjekt
      PrintWriter output = new PrintWriter(fw);
      output.println("Test af append");
      output.flush();
      output.close();
   }  
   catch( IOException e ){
      System.out.println("Fejl ved skrivning: " + e);
   }
  }
}