public class ProcessarConteudo {
  public static double[] ProcessarConteudo( String conteudo) {
    if (conteudo == null || conteudo.isEmpty()) {
      return null;
    }
    String[] numerosStr = conteudo.split(",");
    double[] numeros = new double[numerosStr.length];

    for (int  i=0; i < numerosStr.length; i++) {
      numeros[i] = Double.parseDouble(numerosStr[i].trim());
    }
    return numeros;
  }
}
