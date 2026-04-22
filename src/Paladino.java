public class Paladino extends Personagem implements UsaEstamina, UsaMana{

    private int estamina;
    private int mana;
    private static final double BLOQUEIO = 0.50;

    public Paladino(String nome) {
        super(nome, 500);
        this.estamina = 500;
        this.mana = 300;
    }

    @Override
    void atacar(Personagem alvo) {
        System.out.println("Ataque de martelo magico!");
        alvo.tomarDano(70);
    }

    @Override
    void defender() {

    }

    @Override
    public void consumirMana() {

    }

    @Override
    public void consumirEstamina() {

    }
}
