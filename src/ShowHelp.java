public class ShowHelp {

  public static void ShowHelp() {
    System.out.println("""
  usage:  VerificaFuncao <operation> [...]
  operations:
    VerificaFuncao {-h --help}
    VerificaFuncao {-V --version}
    VerificaFuncao {file1.txt file2.txt}
""");
  }
}
