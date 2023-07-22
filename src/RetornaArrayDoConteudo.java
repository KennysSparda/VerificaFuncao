import java.util.Arrays;

public class RetornaArrayDoConteudo {
  public static double[] RetornaArrayDoConteudo(String conteudo) {
    if (conteudo != null) {
      double[] numeros = ProcessarConteudo.ProcessarConteudo(conteudo);
      if (numeros != null) {
        System.out.println("Números lidos do arquivo:");
        System.out.println(Arrays.toString(numeros));
        return numeros;
      } else {
        System.out.println("Não foram encontrados números.");
        return null;
      }
    } else {
      System.out.println("Não foi possível ler o arquivo.");
      return null;  
    }
  }
}

