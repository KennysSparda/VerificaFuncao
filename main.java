import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class VerificaFuncao {

  public static void ShowHelp() {
    System.out.println("""
  usage:  VerificaFuncao <operation> [...]
  operations:
    VerificaFuncao {-h --help}
    VerificaFuncao {-V --version}
    VerificaFuncao {file1.txt file2.txt}
""");
  }
  public static void ShowVersion() {
    System.out.println("""
VerificaFuncao v0.0.1
""");
  }

  public static String lerArquivoTexto( String nomeArquivo ) {
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

  public static void main(String args[]) {
    if ( args.length == 0 || args[0].equals("--help") || args[0].equals("-H")) {
      ShowHelp();
    } else {
      if ( args[0].equals("--version") || args[0].equals("-V")) {
        ShowVersion();
      } else {
        System.out.println("argumento 1:" + args[0]);
        String dominio = lerArquivoTexto(args[0]);
        System.out.println("argumento 2:" + args[1]);
        String imagem = lerArquivoTexto(args[1]);
        System.out.println("Dominio da função: " + dominio);
        System.out.println("Imagem da função: " + imagem);
      }
    }
  }
}

