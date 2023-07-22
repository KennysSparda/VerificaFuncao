public class ProcessarConteudo {
  public static int[] ProcessarConteudo( String conteudo) {
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
}
