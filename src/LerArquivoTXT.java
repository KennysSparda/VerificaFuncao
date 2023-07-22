import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTXT {
  public static String LerArquivoTXT( String nomeArquivo ) {
    StringBuilder conteudo = new StringBuilder();
    try ( BufferedReader br = new BufferedReader( new FileReader(nomeArquivo))) {
      String linha;
      while( (linha = br.readLine()) != null ) {
        conteudo.append(linha).append("\n");
      }
    } catch ( IOException e ) {
      e.printStackTrace();
      return null;
    }
    return conteudo.toString();
  }
}

