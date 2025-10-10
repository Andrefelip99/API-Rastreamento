import java.time.LocalDateTime;


public class Encomenda {
    private int id;
    private String codigoRastreio;
    private String descricao;
    private Cliente cliente;
    private LocalDateTime dataEnvio;
    private String status;


public Encomenda(int id, String codigoRastreio, String descricao, Cliente cliente, LocalDateTime dataEnvio, String status) {
    this.id = id;
    this.codigoRastreio = codigoRastreio;
    this.descricao = descricao;
    this.cliente = cliente;
    this.dataEnvio = dataEnvio;
    this.status = status;
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getCodigoRastreio() {
    return codigoRastreio;
}


public void setCodigoRastreio(String codigoRastreio) {
    this.codigoRastreio = codigoRastreio;
}


public String getDescricao() {
    return descricao;
}


public void setDescricao(String descricao) {
    this.descricao = descricao;
}


public Cliente getCliente() {
    return cliente;
}


public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public LocalDateTime getDataEnvio() {
    return dataEnvio;
}


public void setDataEnvio(LocalDateTime dataEnvio) {
    this.dataEnvio = dataEnvio;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}

public void cadastrarEncomenda(){
    System.out.println("Encomenda " + codigoRastreio + " cadastrada com sucesso!");
}

 public void atualizarStatus(String novoStatus) {
        System.out.println("Status da encomenda " + codigoRastreio + " atualizado de " + this.status + " para " + novoStatus);
    }

public Encomenda consultarEncomenda(int id){
    if (this.id == id) {
        System.out.println("Encomenda encontrada: " + this.descricao);
        return this;
    }else{
        System.out.println("Encomenda com ID " + id + " não encontrada.");
    }

    return null;
}


 @Override
    public String toString() {
        return "Encomenda{" +
               "id=" + id +
               ", codigoRastreio='" + codigoRastreio + '\'' +
               ", descricao='" + descricao + '\'' +
               ", cliente=" + (cliente != null ? cliente.getNome() : "N/A") +
               ", dataEnvio=" + dataEnvio +
               ", status='" + status + '\'' +
               '}';
}


}
