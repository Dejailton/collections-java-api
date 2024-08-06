package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean estado;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.estado = false;
    }
    public String getDescricao() {
        return descricao;
    }
    public boolean getEstado() {
        return estado;
    }
    public boolean tarefaConcluida() {
        return estado;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "descricao='" + descricao +
                ", estado=" + estado + '}' + '\n';
    }
}
