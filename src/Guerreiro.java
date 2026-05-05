public class Guerreiro extends Personagem implements UsaEstamina {

   private int estamina;
   private int estaminaMaxima;
   private final double BLOQUEIO = 0.80;


    public Guerreiro(String nome) {
        super(nome, 800);
        this.estaminaMaxima = 800;
        setEstamina(800);
    }

    public Guerreiro() {
        super(800);
        this.estaminaMaxima = 800;
        setEstamina(800);
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = Math.min(estamina, estaminaMaxima);
    }

    public double getBLOQUEIO() {
        return BLOQUEIO;
    }

    @Override
    void atacar(Personagem alvo) {
        if (this.estamina < 50) {
            System.out.println("-------------------");
            System.out.println("Sem estamina! não consigo atacar!");
        } else {
            System.out.println("Ataque de espada!");
            alvo.tomarDano(50);
            consumirEstamina();
        }

    }

    @Override
    void defender(int dano) {
        System.out.println("Bloqueio com o escudo");
        int danoBloqueado = (int)(dano * BLOQUEIO);
        int danoRecebido = dano - danoBloqueado;
        tomarDano(danoRecebido);
        System.out.println("----------------------------------");
        System.out.println("Dano recebido: -" + danoRecebido);
        System.out.println("Vida: " + this.getVida());

        if(this.getVida() <= 0) {
            System.out.println("----VOCÊ FOI DERROTADO!----");
        }
    }


    @Override
    public void consumirEstamina() {
        setEstamina(Math.max(this.estamina -50, 0));
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
