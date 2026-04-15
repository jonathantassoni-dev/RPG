public class Guerreiro extends Personagem implements UsaEstamina{
    
   private String nome;
   private int vida;
   private int estamina;

    public Guerreiro() {
        this.vida = 800;
        this.estamina = 500;
    }

    @Override
    void atacar() {
        
    }

    @Override
    void defender() {

    }
}
