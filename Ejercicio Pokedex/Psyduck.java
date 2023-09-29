public class Psyduck extends Pokemon implements Fuego, Agua, AtaquePredeterminado{

    public Psyduck(String nombre, int numeroUnico, int generacion){
        super(nombre, numeroUnico, generacion);
        this.tipo = "Fuego, Agua";
    }

    @Override
    public void lanzallamas(){
        int dañoAtaque = 10;
        System.out.println("¡"+this.nombre + " Usa lanza llamas!");
        daño += dañoAtaque;
    }

    @Override
    public void cortinaHumo(){
        int dañoAtaque = 5;
        System.out.println("¡"+this.nombre + " Usa cortina de humo!");
        daño += dañoAtaque;
    }

    public void pistolaAgua(){
        int dañoAtaque = 10;
        System.out.println("¡"+this.nombre + " Usa pistola de agua!");
        daño += dañoAtaque;
    }

    public void burbuja(){
        int dañoAtaque = 5;
        System.out.println("¡"+this.nombre + " Usa burbuja!");
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