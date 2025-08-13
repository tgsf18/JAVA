public class Animal {
    String nome ;
    String especie;
     int idade;
     double peso;

     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
