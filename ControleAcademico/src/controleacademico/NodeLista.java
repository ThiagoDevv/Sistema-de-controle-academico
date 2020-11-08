package controleacademico;


public class NodeLista {
    private NodeLista prox;
    private NodeLista ant;
    private ClassAlunos value;

    public NodeLista(NodeLista prox, NodeLista ant, ClassAlunos value) {
        this.prox = prox;
        this.ant = ant;
        this.value = value;
    }

    public NodeLista getProx() {
        return prox;
    }

    public void setProx(NodeLista prox) {
        this.prox = prox;
    }

    public NodeLista getAnt() {
        return ant;
    }

    public void setAnt(NodeLista ant) {
        this.ant = ant;
    }

    public ClassAlunos getValue() {
        return value;
    }

    public void setValue(ClassAlunos value) {
        this.value = value;
    }
    
    
}
