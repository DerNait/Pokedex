
public class Pikachu extends Pokemon implements Electrico, AtaquePredeterminado{

    public Pikachu(String nombre, int numeroUnico, int generacion){
        super(nombre, numeroUnico, generacion);
        this.tipo = "Electrico";
    }

    @Override
    public void impactTrueno(){
        int dañoAtaque = 10;
        System.out.println("¡"+nombre + " Usa impacta trueno!");
        daño += dañoAtaque;
    }

    @Override
    public void ondaTrueno(){
        int dañoAtaque = 5;
        System.out.println("¡"+nombre + " Usa onda trueno!");
        daño += dañoAtaque;
    }

    @Override
    public void morder(){
        int dañoAtaque = 3;
        System.out.println("¡"+nombre + " Muerde!");
        daño += dañoAtaque;
    }

    @Override
    public void arañar(){
        int dañoAtaque = 2;
        System.out.println("¡"+nombre + " Araña!");
        daño += dañoAtaque;
    }
}