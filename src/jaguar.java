public class jaguar {

    private String nome;
    private String cor;
    private double tamanho;
    private double velocidadeTerra;

 

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


    public double getTamanho() {
        return tamanho;
    }


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public jaguar(){

    }

    public jaguar(String nome){
        this.nome = nome;
    }

    public jaguar(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void acelerarTerra(){
        this.velocidadeTerra += 80;
    }
 

    public double getVelocidadeTerra() {
        return velocidadeTerra;
    }


    public void setVelocidadeTerra(double velocidadeTerra) {
        this.velocidadeTerra = velocidadeTerra;
    }


}