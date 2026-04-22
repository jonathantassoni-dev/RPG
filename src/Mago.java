public class Mago extends Personagem implements UsaMana{

    private int mana;
    private static final double BLOQUEIO = 0.10;

    public Mago(String nome) {
        super(nome, 300);
        this.mana = 800;
    }

    @Override
    void atacar(Personagem alvo) {
        System.out.println("ataque de bola de fogo!");
        alvo.tomarDano(100);
    }

    @Override
    void defender() {

    }


    @Override
    public void consumirMana() {

    }
}
