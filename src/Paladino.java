public class Paladino extends Personagem implements UsaEstamina, UsaMana{

    private int estamina;
    private int mana;

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    private static final double BLOQUEIO = 0.50;

    public Paladino(String nome) {
        super(nome, 500);
        this.estamina = 200;
        this.mana = 300;
    }

    @Override
    void atacar(Personagem alvo) {
        System.out.println("Ataque de martelo magico!");
        alvo.tomarDano(70);
    }

    @Override
    void defender(int dano) {
        System.out.println("Defendendo com martelo e armadura!");
        int danoBloqueado = (int)(dano * BLOQUEIO);
        int danoRecebido = dano - danoBloqueado;
        tomarDano(danoRecebido);
        System.out.println("----------------------------------");
        System.out.println("Dano recebido: " + danoRecebido);
        System.out.println("Vida: " + this.getVida());
    }

    @Override
    public void beberPocaoDeMana() {

    }

    @Override
    void beberPocaoDeVida() {

    }


    @Override
    public void consumirEstamina() {

    }

    @Override
    public void beberPocaoDeEstamina() {

    }

    @Override
    public void consumirMana() {

    }
}


