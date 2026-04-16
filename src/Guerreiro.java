public class Guerreiro extends Personagem implements usaEstamina{

   private int estamina;

    public Guerreiro(String nome) {
        super(nome, 800);
        this.estamina = 500;
    }

    @Override
    void atacar() {
        
    }

    @Override
    void defender() {

    }


    @Override
    public void consumirEstamina() {

    }
}
