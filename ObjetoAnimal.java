import java.util.Scanner;
public class ObjetoAnimal{
    public static void main (String[]arg){
        Scanner ler = new Scanner(System.in);
        String nome , especie;
        int idade;
        double peso;

        System.out.println("Qual é o nome do animal:");
        nome = ler.nextLine();
        System.out.println("Qual é a especie do animal:");
        especie = ler.nextLine();
        System.out.println("Qual é a idade do animal:");
        idade = ler.nextInt();
        System.out.println("Qual é o peso do animal:");
        peso = ler.nextDouble();




        Animal animal1 = new Animal();
        animal1.setNome(nome);
        animal1.setEspecie(especie);
        animal1.setIdade(idade);
        animal1.setPeso(peso);

        System.out.println("Resultados");
        System.out.println("Nome : " + animal1.getNome());
        System.out.println("Espécie : " + animal1.getEspecie());
        System.out.println("Idade : " + animal1.getIdade());
        System.out.println("peso : " + animal1.getPeso());


    }
}
