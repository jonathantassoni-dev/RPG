public class Guerreiro extends Personagem implements UsaEstamina {

   private int estamina;
   private static final double BLOQUEIO = 0.80;

    public Guerreiro(String nome) {
        super(nome, 800);
        this.estamina = 300;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
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
        System.out.println("Dano recebido: " + danoRecebido);
        System.out.println("Vida: " + this.getVida());
    }


    @Override
    void beberPocaoDeVida() {

    }




    @Override
    public void consumirEstamina() {
        this.estamina -= 50;
    }

    @Override
    public void beberPocaoDeEstamina() {

    }
}
