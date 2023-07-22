class VerificaFuncao {
  public static void main(String args[]) {
    if ( args.length == 0 || args[0].equals("--help") || args[0].equals("-H")) {
      ShowHelp.ShowHelp();
    } else {
      if ( args[0].equals("--version") || args[0].equals("-V")) {
        ShowVersion.ShowVersion();
      } else {
        String dominio = LerArquivoTXT.LerArquivoTXT(args[0]);
        String imagem = LerArquivoTXT.LerArquivoTXT(args[1]);
 
        System.out.println("argumento 1:" + args[0]);
        System.out.println("argumento 2:" + args[1]);

        System.out.println("Dominio da função: " + dominio);
        System.out.println("Imagem da função: " + imagem);

        LerConteudo.LerConteudo(dominio);
        LerConteudo.LerConteudo(imagem);
       
      }
    }
  }
}
