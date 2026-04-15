public abstract class Personagem {
    String nome;
    int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    abstract void atacar();
    abstract void defender();


}
