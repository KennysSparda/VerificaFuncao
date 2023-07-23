public class ShowHelp {

  public static void ShowHelp() {
    System.out.println("""
  usage:  VerificaFuncao <operation> [...]
          this program uses default function A.X+B
  operations:
    VerificaFuncao {-h --help}
    VerificaFuncao {-V --version}

    VerificaFuncao {Element A, Element B, domain.txt image.txt}
""");
  }
}
