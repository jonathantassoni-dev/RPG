public abstract class Personagem {
    private String nome;
    private int vida;
    private int vidaMaxima;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
    }

    public Personagem(int vida) {
        this.vida = vida;
        this.vidaMaxima = vida;
    }



    abstract void atacar(Personagem alvo);
    abstract void defender(int dano);

    public void beberPocaoDeVida(){
        this.vida = Math.min(this.vida + 500, vidaMaxima);
        System.out.println("----------------------------------");
        System.out.println(getNome() + " bebeu poção de vida!");
        System.out.println("Recuperando +500 de vida");
        System.out.println("Vida: " + this.vida);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void tomarDano(int dano) {
        this.vida -= dano;
    }

}
