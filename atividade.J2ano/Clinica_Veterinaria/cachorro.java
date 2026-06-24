public class cachorro extends animal{
    private String Pelagem;
    private int Patas;

    public cachorro(String Nome, String Especie, int Idade, String Pelagem, int Patas){
        super(Nome, Idade, Especie);
        this.Pelagem = Pelagem;
        this.Patas = Patas;
    }
    @Override
    public void exibirInformacao(){
        System.out.println("Nome:"+ Nome);
        System.out.println("Especie:"+ Especie);
        System.out.println("Idade:"+ Idade);
        System.out.println("Tipo de Pelagem:"+ Pelagem);
        System.out.println("Quantidades de Patas:"+ Patas);
    }
}
