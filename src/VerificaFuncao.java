class VerificaFuncao {
  public static void main(String args[]) {
    if (  args[0] == null || args[1] == null || args[2] == null || args[3] == null || args[0].equals("--help") || args[0].equals("-H")) {
      ShowHelp.ShowHelp();
    } else {
      if ( args[0].equals("--version") || args[0].equals("-V")) {
        ShowVersion.ShowVersion();
      } else {

        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        String dominio = LerArquivoTXT.LerArquivoTXT(args[2]);
        String contradominio = LerArquivoTXT.LerArquivoTXT(args[3]);
        double[] array_dominio = RetornaArrayDoConteudo.RetornaArrayDoConteudo(dominio);
        double[] array_contradominio = RetornaArrayDoConteudo.RetornaArrayDoConteudo(contradominio); 
        String strA = (String) String.format("%.0f", A);
        String strB = (String) String.format("%.0f", B);
        
        System.out.print("Função do primeiro grau: "+strA+"X+"+strB);
        System.out.print("Dominio da relação: " + dominio);
        System.out.print("contradominio da relação: " + contradominio);
        boolean eFuncao = VerificadorDeRelacao.VerificadorDeRelacao(A, B, array_dominio, array_contradominio);

 
        System.out.println("Essa relação é uma função válida? ");
        if( eFuncao == true ) {
          System.out.println("SIM! É Função.");
        } else {
          System.out.println("NÃO! Não é Função.");
        }
      }
    }
  }
}

