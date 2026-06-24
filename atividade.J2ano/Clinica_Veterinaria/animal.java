public class animal{
    protected String Nome;
    protected int Idade;
    protected String Especie;

    public animal(String Nome, int Idade, String Especie){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Especie = Especie;
    }

    public void exibirInformacao(){
        System.out.println("Nome:"+ Nome);
        System.out.println("Idade:"+ Idade);
        System.out.println("Especie:"+ Especie);
    }

}