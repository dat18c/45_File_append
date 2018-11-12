import java.io.*;

public class appendFile
{
  public static void main(String[] args)
   // throws IOException
  {
   try
   {
      //lav fileWriter-objekt med append
      FileWriter fw = new FileWriter("Fejl", true);
      //lav buffer, da der ellers bliver skrevet med det samme.
      //Det kan være dyrt i forhold til at gemme i buffer.
      //BufferedWriter bw = new BufferedWriter(fw);
      //lav Printobjekt
      PrintWriter output = new PrintWriter(fw);
      output.println("Test af append - igen, igen!");
      //tøm buffer til disk
      output.flush();
      //ryd pænt op og luk PrintWriter-objektet
      output.close();
   }  
   catch( FileNotFoundException e )
   {
      System.out.println("Fil ikke fundet: " + e);
      
   }
   catch( IOException e )
   {
      System.out.println("Fejl ved skrivning: " + e);
   }
  }
}