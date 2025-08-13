public class Paciente {


    String nome;
    String endereco;
    String nivelDeEscolaridade;
    String email;
    int cpf;
    int dataDeNascimento;
    int telefone;
    char sexo;



    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNivelDeEscolaridade() {
        return nivelDeEscolaridade;}

    public void setNivelDeEscolaridade(String nivelDeEscolaridade) {
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void getCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getTelefone() {
        return telefone;
    }

    public void getTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void getDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public char getSexo() {
        return sexo;
    }

    public void getSexo(char sexo) {
        this.sexo = sexo;
    }
}
