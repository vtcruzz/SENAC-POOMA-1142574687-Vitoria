package ENTREGA02;

public class GerenciarAtividades {

    private int idAtividade;
    private String descricao;
    private String dataInicio;
    private String dataFim;


    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public GerenciarAtividades() {}

    public GerenciarAtividades(int idAtividade, String descricao, String dataInicio, String dataFim) {
        this.idAtividade = idAtividade;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
