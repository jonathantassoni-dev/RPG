public class Mago extends Personagem implements UsaMana{

    private int mana;
    private static final double BLOQUEIO = 0.10;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

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
    void defender(int dano) {
        System.out.println("Defendendo com o cajado!");
        int danoBloqueado = (int)(dano * BLOQUEIO);
        int danoRecebido = dano - danoBloqueado;
        tomarDano(danoRecebido);
        System.out.println("----------------------------------");
        System.out.println("Dano recebido: " + danoRecebido);
        System.out.println("Vida: " + this.getVida());
    }


    @Override
    public void consumirMana() {

    }
}
