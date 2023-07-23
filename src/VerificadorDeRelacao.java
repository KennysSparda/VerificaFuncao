public class VerificadorDeRelacao {
  public static boolean VerificadorDeRelacao(double A, double B, double[] dominio, double[] contradominio) {
    // FUNÇÃO DO PRIMEIRO GRAU f(x): A*X+B

    boolean eFuncao = false;
    System.out.print("Imagem: ");
    for (int i=0; i<dominio.length; i++) {
      double[] relacao = new double[dominio.length];
      relacao[i] = A*dominio[i]+B;
      String strImagem = (String) String.format("%.0f", relacao[i]);
      System.out.print(strImagem+",");
      if(relacao[i] == contradominio[i]){
        eFuncao = true;
      } else {
        eFuncao = false;
      }
    }
    

    return eFuncao;
  }
}
