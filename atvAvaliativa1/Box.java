import java.util.List;

public class Box {
    private int numero;
    private String tipoServicoPermitido;
    private int capacidadeMaximaVericulos;
    private String localizacao;
    private Mecanico mecanico;
    private List<OrdemServico> ordens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoServicoPermitido() {
        return tipoServicoPermitido;
    }

    public void setTipoServicoPermitido(String tipoServicoPermitido) {
        this.tipoServicoPermitido = tipoServicoPermitido;
    }

    public int getCapacidadeMaximaVericulos() {
        return capacidadeMaximaVericulos;
    }

    public void setCapacidadeMaximaVericulos(int capacidadeMaximaVericulos) {
        this.capacidadeMaximaVericulos = capacidadeMaximaVericulos;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public List<OrdemServico> getOrdemServico() {
        return ordens;
    }

    public void setOrdemServico(List<OrdemServico> ordens){
        this.ordens = ordens;
    }

    public Box(int numero, String tipoServicoPermitido, int capacidadeMaximaVericulos, String localizacao) {
        this.numero = numero;
        this.tipoServicoPermitido = tipoServicoPermitido;
        this.capacidadeMaximaVericulos = capacidadeMaximaVericulos;
        this.localizacao = localizacao;
    }
    
    public void associarMecanico(Mecanico mecanicoAssociado){
        if (mecanicoAssociado != null){
            mecanico = mecanicoAssociado;
            System.out.println("Mecânico associado com sucesso!");
        } else {
            System.out.println("ERRO! Mecânico associado é inválido.");
        }
    }
    
    public void atribuirOrdemServico(OrdemServico ordemServico){
        
        if (ordemServico.getStatus().equals(ordens.get(0).getStatus())){
            ordens.add(ordemServico);
            System.out.println("Ordem de serviço atribuída com sucesso.");
        } else {
            System.out.println("ERRO! Ordem de serviço atribuida é inválida.");
        }
        
    }
    
    public void informarOrdens(){
        for (OrdemServico ordem : ordens){
            System.out.println("Código: "+ordem.getCodigo());
            System.out.println("Nome do cliente: "+ordem.getNomeCliente());
            System.out.println("Nome do veículo: "+ordem.getPlacaVeiculo());
            System.out.println("Data: "+ordem.getData());
            System.out.println("Status: "+ordem.getStatus());
            System.out.println("Serviço: "+ordem.getServico().getNome());
            System.out.println("Quantidade de ordens: "+ordens.size());
    }
}
    
    public void quantidadeOrdensFinalizadas(){
        int cont = 0;

        for (OrdemServico ordem : ordens){
            if (ordem.getStatus().equals("Finalizada")){
                cont ++;
            }
        }

        System.out.println("Quantidade de ordens finalizadas: "+cont);
    }

    public void buscarOrdensPorStatus(String status){
        for (OrdemServico ordem : ordens){
            if (ordem.getStatus().equals(status)){
                System.out.println("Código: "+ordem.getCodigo());
                System.out.println("Nome do cliente: "+ordem.getNomeCliente());
                System.out.println("Nome do veículo: "+ordem.getPlacaVeiculo());
                System.out.println("Data: "+ordem.getData());
                System.out.println("Status: "+ordem.getStatus());
                System.out.println("Serviço: "+ordem.getServico().getNome());
            }
        }
    }

    public void exibirDetalhesOrdem(int codigo){
        for (OrdemServico ordem : ordens){
            if (ordem.getCodigo() == codigo){
                System.out.println("Código: "+ordem.getCodigo());
                System.out.println("Nome do cliente: "+ordem.getNomeCliente());
                System.out.println("Nome do veículo: "+ordem.getPlacaVeiculo());
                System.out.println("Data: "+ordem.getData());
                System.out.println("Status: "+ordem.getStatus());
                System.out.println("Serviço: "+ordem.getServico().getNome());
            }
        }
    }
}
