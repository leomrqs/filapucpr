public class Main {
  public static void main(String[] args) {
    try {
      Fila fila = new Fila(4);

      fila.insere(5);
      fila.insere(15);
      fila.insere(25);
      fila.insere(35);

      fila.imprime();

      System.out.println("Cheia: " + fila.cheia()); 

      fila.remove();
      fila.imprime(); 

      fila.insere(45);
      fila.imprime(); 

      System.out.println("Cheia: " + fila.cheia()); 

      fila.remove();
      fila.remove();
      fila.imprime();

      System.out.println("Vazia: " + fila.vazia()); 

      fila.remove();
      fila.remove();
      fila.imprime(); 

      System.out.println("Vazia: " + fila.vazia());

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}