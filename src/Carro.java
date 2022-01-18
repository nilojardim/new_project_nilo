public class Carro {
    private String nome, cor;
    private int ano;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirVeiculo(String nome, String cor, int ano){

        System.out.println(nome);
        System.out.println(cor);
        System.out.println(ano);
    }

}
