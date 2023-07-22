import java.util.Arrays;

public class LerConteudo {
  public static void LerConteudo(String conteudo) {
    if (conteudo != null) {
      int[] numeros = ProcessarConteudo.ProcessarConteudo(conteudo);
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
}

