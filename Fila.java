public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int tamanhoAtual;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = -1;
        this.tamanhoAtual = 0;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return tamanhoAtual == capacidade;
    }

    public boolean vazia() {
        return tamanhoAtual == 0;
    }

    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Fila cheia");
        }
        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = elemento;
        tamanhoAtual++;
    }

    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Fila vazia");
        }
        int elementoRemovido = dados[primeiro];
        primeiro = (primeiro + 1) % capacidade;
        tamanhoAtual--;
        return elementoRemovido;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Vazia");
        } else {
            for (int i = 0; i < tamanhoAtual; i++) {
                int indice = (primeiro + i) % capacidade;
                System.out.print(dados[indice] + " ");
            }
            System.out.println();
        }
    }
}
