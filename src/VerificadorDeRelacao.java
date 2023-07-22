public class VerificadorDeRelacao {
  public static boolean VerificadorDeRelacao(double[] dominio, double[] imagem) {
    boolean eFuncao = false;
    for (int i=0; i<dominio.length; i++) {
      double[] relacao = new double[dominio.length];
      relacao[i] = dominio[i]+1;
      if(relacao[i] == imagem[i]){
        eFuncao = true;
      } else {
        eFuncao = false;
      }
    }
    

    return eFuncao;
  }
}
