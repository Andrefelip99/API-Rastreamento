import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transportadora {
    private static List<Transportadora> transportadoras = new ArrayList<>();
    private int id;
    private String nome;
    private String endereco;

    public Transportadora(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarTransportadora(){
        transportadoras.add(this);
        System.out.println("Transportadora " + nome + " cadastrada com sucesso!");
    }

    public void atualizarTransportadora(){
        System.out.println("Transportadora " + nome + " atualizada com sucesso!");
    }

    public static List<Transportadora> listarTransportadoras(){
        return Collections.unmodifiableList(transportadoras);
    }
    
    @Override
public String toString() {
    return "Transportadora{id=" + id +
           ", nome='" + nome + '\'' +
           ", endereco='" + endereco + '\'' +
           '}';
}

}
