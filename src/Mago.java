public class Mago extends Personagem implements UsaMana{

    private int mana;
    private static final double BLOQUEIO = 0.10;

    public Mago(String nome) {
        super(nome, 300);
        this.mana = 800;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


    @Override
    void atacar(Personagem alvo) {
        if(this.mana < 100) {
            System.out.println("-------------------");
            System.out.println("Não consigo atacar, estou sem mana!");
        } else {
            System.out.println("ataque de bola de fogo!");
            alvo.tomarDano(100);
            consumirMana();
        }

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

        if(this.getVida() <= 0) {
            System.out.println("----VOCÊ FOI DERROTADO!----");
        }
    }



    @Override
    void beberPocaoDeVida() {

    }



    @Override
    public void consumirMana() {

    }

    @Override
    public void beberPocaoDeMana() {

    }
}
