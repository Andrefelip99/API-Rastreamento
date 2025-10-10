import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(2878, "Andre", "andre@example.com", "123456789");
        Encomenda encomenda = new Encomenda(1, "RAST123", "Produto A", cliente, LocalDateTime.now(), "Pendente");
        Rastreamento rastreamento = new Rastreamento(1, LocalDateTime.now(), "Localização A", encomenda);
        rastreamento.registrarRastreamento();
        Transportadora transportadora = new Transportadora(1, "Correios", "Rua A");
        transportadora.cadastrarTransportadora();


        System.out.println("Encomendas cadastradas:");
System.out.println(encomenda);

System.out.println("\nTransportadoras cadastradas:");
for (Transportadora t : Transportadora.listarTransportadoras()) {
    System.out.println(t);
}

System.out.println("\nHistórico de rastreamentos:");
for (Rastreamento r : Rastreamento.consultarHistorico()) {
    System.out.println(r);
}

    }
}
