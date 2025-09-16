public class TodoList {
                    //Fiz em forma de lista simplesmente encadeada.
    private Tarefa cabeca;
    private Tarefa cauda;
    private int tamanho;

    public TodoList() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (estaVazio()) {
            cabeca = cauda = novaTarefa;
        } else {
            novaTarefa.setProximo(cabeca);
            cabeca = novaTarefa;
        }
        tamanho++;
    }

    public void inserirNoFim(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (estaVazio()) {
            cabeca = cauda = novaTarefa;
        } else {
            cauda.setProximo(novaTarefa);
            cauda = novaTarefa;
        }
        tamanho++;
    }

    public void inserir(String descricao, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            inserirNoInicio(descricao);
        } else if (posicao == tamanho) {
            inserirNoFim(descricao);
        } else {
            Tarefa novoNo = new Tarefa(descricao);
            Tarefa atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
            tamanho++;
        }
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public String pegaElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        Tarefa atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual.getDescricao();
    }

    public void alteraElemento(String descricao, int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        Tarefa atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        atual.setDescricao(descricao);
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            cabeca = cabeca.getProximo();
            if (cabeca == null) cauda = null;
        } else {
            Tarefa atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(atual.getProximo().getProximo());
            if (atual.getProximo() == null) cauda = atual;
        }
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void imprimirLista() {
        Tarefa atual = cabeca;
        int temp = 1;
        while (atual != null) {
            System.out.print("Tarefa "+ temp+ ": "+ atual.getDescricao()+ " | ");
            atual = atual.getProximo();
            temp++;
        }
        System.out.println();
    }


}
