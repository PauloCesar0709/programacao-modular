import java.util.Date;

public class OrdemServico {
    private int codigo;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaVeiculo;
    private Date data;
    private String status;
    private double valorEstimado;
    private Servico servico;
    private Box box;

    public OrdemServico(int codigo, String nomeCliente, String modeloVeiculo, String placaVeiculo, Date data, String status, double valorEstimado, Servico servico) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.status = status;
        this.valorEstimado = valorEstimado;
        this.servico = servico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    
    public String verificarStatus(){
        String statusOrdem = status;
        
        return statusOrdem;
    }

    
    public void adicionarBoxUtilizado(Box boxUtilizado){
        if (status.equals("Finalizado")){
            box = boxUtilizado;
        }
    }

}
