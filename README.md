# 45_File_append
Dagens Java-pensum er try/catch og append (tilføj) til filer.

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
  }  
  catch( IOException e ){
      System.out.println("Fejl ved skrivning: " + e);
  }
  ``````
