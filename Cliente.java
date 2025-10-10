class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;


    public Cliente(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarCliente() {
        System.out.println("Cliente " + nome + " cadastrado com sucesso!");
    }

    public void atualizarCliente() {
        System.out.println("Cliente " + nome + " atualizado com sucesso!");
    }

    public Cliente consultarCliente(int id) {
        if (this.id == id) {
            System.out.println("Cliente encontrado: " + this.nome);
            return this;

        } else{
            System.out.println("Cliente não encontrado.");
            return null;
        }
    }

     @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }
}