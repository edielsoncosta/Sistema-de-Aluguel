class aluguel {
    private String nome;
    private String email;
    private int quarto;

    public aluguel(String nome, String email) {

        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}