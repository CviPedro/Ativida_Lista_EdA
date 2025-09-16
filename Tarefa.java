public class Tarefa {
    private String descricao;
    private Tarefa proximo;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.proximo = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa getProximo() {
        return proximo;
    }

    public void setProximo(Tarefa proximo) {
        this.proximo = proximo;
    }
}
