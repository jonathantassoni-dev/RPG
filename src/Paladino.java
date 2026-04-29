public class Paladino extends Personagem implements UsaEstamina, UsaMana{

    private int estamina;
    private int estaminaMaxima;
    private int mana;
    private int manaMaxima;
    private static final double BLOQUEIO = 0.50;

    public Paladino(String nome) {
        super(nome, 500);
        this.estaminaMaxima = 500;
        setEstamina(500);
        this.manaMaxima = 300;
        setMana(300);
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = Math.min(estamina, estaminaMaxima);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.min(mana, manaMaxima);
    }



    @Override
    void atacar(Personagem alvo) {
        if(this.estamina < 50) {
            System.out.println("-------------------");
            System.out.println("Sem estamina, não consigo atacar!");
        } else if(this.mana < 50) {
            System.out.println("-------------------");
            System.out.println("Sem mana, não consigo atacar!");
        }else{
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
        setEstamina(Math.max(this.estamina - 50, 0));
    }

    @Override
    public void consumirMana() {
        setMana(Math.max(this.mana -50, 0));
    }


    @Override
    public void beberPocaoDeMana() {
        setMana(this.mana + 500);
        System.out.println("----------------------------------");
        System.out.println(getNome() + " bebeu poção de mana!");
        System.out.println("Recuperando +500 de mana");
        System.out.println("Mana: " + this.mana);
    }

    @Override
    public void beberPocaoDeEstamina() {
        setEstamina(this.estamina + 500);
        System.out.println("----------------------------------");
        System.out.println(getNome() + " bebeu poção de estamina!");
        System.out.println("Recuperando +500 de estamina");
        System.out.println("Estamina: " + this.estamina);
    }


}


