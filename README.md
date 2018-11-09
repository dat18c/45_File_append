# 45_File_append
Dagens Java-pensum er try/catch og append (tilføj) til filer.

Try/catch består af en try og en catch block. Usikker kode forsøges kørt i try-blokken. Kastes der en expection under udførelsen af try-blokken, bliver catch-blokken udført.

Catch-blokken kan inddeles efter hvilken fejl der skal håndteres. Når vi håndterer exepctions med try/catch , behøver vi ikke at erklære metoderne med throws.

Append til filer betyder, at der skriver videre for enden af filen. Ekstra tekst bliver altså tilføjet i stedet for at overskrive filen.

FileWriter kan instantieres, så den tilføjer til filen ved at give den parameteret true.
https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html#FileWriter(java.io.File,%20boolean)

Skal I have mulighed for at skrive med print og println som med PrintStream, skal Der bruges BufferedWriter og PrintWriter udenpå FileWriter.
``````
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
  ``````
