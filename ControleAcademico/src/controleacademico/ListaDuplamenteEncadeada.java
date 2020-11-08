package controleacademico;

public class ListaDuplamenteEncadeada {

    private NodeLista inicio;
    private NodeLista fim;

    public ListaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
    }

    public void InserirFim(ClassAlunos valor){
        
        NodeLista no = new NodeLista(inicio, null, valor);

        if(inicio==null){
            inicio = no;
        }else{
            no.setAnt(fim);
            fim.setProx(no);
        }
        
        fim = no;
    }
}
