public class Paladino extends Personagem implements UsaEstamina, UsaMana{

    private int estamina;
    private int mana;
    private static final double BLOQUEIO = 0.50;

    public Paladino(String nome) {
        super(nome, 500);
        this.estamina = 300;
        this.mana = 300;
    }

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



    @Override
    void atacar(Personagem alvo) {
        if(this.estamina < 50 && this.mana > 50) {
            System.out.println("-------------------");
            System.out.println("Sem estamina, não consigo atacar!");
        } else if(this.estamina > 50 && this.mana < 50) {
            System.out.println("-------------------");
            System.out.println("Sem mana, não consigo atacar!");
        } else {
            System.out.println("-------------------");
            System.out.println("Ataque de martelo mágico!");
            alvo.tomarDano(75);
            consumirEstamina();
            consumirMana();
        }

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

        if(this.getVida() <= 0) {
            System.out.println("----VOCÊ FOI DERROTADO!----");
        }
    }

    @Override
    public void consumirEstamina() {
        this.estamina -= 50;
    }

    @Override
    public void consumirMana() {
        this.mana -= 50;
    }


    @Override
    public void beberPocaoDeMana() {

    }

    @Override
    public void beberPocaoDeEstamina() {

    }


}


