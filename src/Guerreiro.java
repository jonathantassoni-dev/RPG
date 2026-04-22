public class Guerreiro extends Personagem implements UsaEstamina {

   private int estamina;
   private static final double BLOQUEIO = 0.80;

    public Guerreiro(String nome) {
        super(nome, 800);
        this.estamina = 500;
    }

    @Override
    void atacar(Personagem alvo) {
        System.out.println("Ataque de espada!");
        alvo.tomarDano(50);
    }

    @Override
    void defender() {

    }


    @Override
    public void consumirEstamina() {

    }
}
