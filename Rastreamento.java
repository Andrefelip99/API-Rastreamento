import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Collections;

public class Rastreamento {
    private static List<Rastreamento> rastreamentos = new ArrayList<>();
    private int id;
    private LocalDateTime dataHora;
    private String localizacao;
    private Encomenda encomenda;

    public Rastreamento(int id, LocalDateTime dataHora, String localizacao, Encomenda encomenda) {
        this.id = id;
        this.dataHora = dataHora;
        this.localizacao = localizacao;
        this.encomenda = encomenda;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

     public void registrarRastreamento() {
        rastreamentos.add(this);
        System.out.println("Rastreamento da encomenda " + encomenda.getCodigoRastreio() +
                           " registrado em " + dataHora + " na localização: " + localizacao);
    }

    public static List<Rastreamento> consultarHistorico() {
        return Collections.unmodifiableList(rastreamentos);
    }
    
    @Override
    public String toString() {
        return "Rastreamento{id=" + id +
               ", dataHora=" + dataHora +
               ", localizacao='" + localizacao + '\'' +
               ", encomenda=" + encomenda.getCodigoRastreio() +
               '}';
    }

    

}


    


