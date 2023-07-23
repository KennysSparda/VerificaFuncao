public class RetornaArrayDoConteudo {
  public static double[] RetornaArrayDoConteudo(String conteudo) {
    if (conteudo != null) {
      double[] numeros = ProcessarConteudo.ProcessarConteudo(conteudo);
      if (numeros != null) {
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

