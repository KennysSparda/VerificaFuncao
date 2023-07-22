import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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

  public static int[] processarConteudo( String conteudo) {
    if (conteudo == null || conteudo.isEmpty()) {
      return null;
    }
    String[] numerosStr = conteudo.split(",");
    int[] numeros = new int[numerosStr.length];

    for (int  i=0; i < numerosStr.length; i++) {
      numeros[i] = Integer.parseInt(numerosStr[i].trim());
    }
    return numeros;
  }

  public static void lerConteudo(String conteudo) {
    if (conteudo != null) {
      int[] numeros = processarConteudo(conteudo);
      if (numeros != null) {
        System.out.println("Números lidos do arquivo:");
        System.out.println(Arrays.toString(numeros));
      } else {
        System.out.println("Não foram encontrados números.");
      }
    } else {
        System.out.println("Não foi possível ler o arquivo.");
    }
  }

  public static void main(String args[]) {
    if ( args.length == 0 || args[0].equals("--help") || args[0].equals("-H")) {
      ShowHelp();
    } else {
      if ( args[0].equals("--version") || args[0].equals("-V")) {
        ShowVersion();
      } else {
        String dominio = lerArquivoTexto(args[0]);
        String imagem = lerArquivoTexto(args[1]);
 
        System.out.println("argumento 1:" + args[0]);
        System.out.println("argumento 2:" + args[1]);

        System.out.println("Dominio da função: " + dominio);
        System.out.println("Imagem da função: " + imagem);

        lerConteudo(dominio);
        lerConteudo(imagem);
       
      }
    }
  }
}

