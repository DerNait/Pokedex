import java.util.*;

public class Pokedb{

    public static void main(String[] args){

        ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
        
        Pikachu pikachu = new Pikachu("Pikachu 1", pokemones.size()+1,1);
        pokemones.add(pikachu);

        Charmander charmander = new Charmander("Charmander", pokemones.size()+1,1);
        pokemones.add(charmander);

        Psyduck psyduck = new Psyduck("Psyduck", pokemones.size()+1,1);
        pokemones.add(psyduck);


        /*Agua squirtle = new Agua("Squirtle", pokemones.size()+1,1);
        pokemones.add(squirtle);
        
        Planta bulbasaur = new Planta("Bulbasaur", pokemones.size()+1,1);
        pokemones.add(bulbasaur);*/

        psyduck.morder();
        psyduck.arañar();
        psyduck.morder();
        psyduck.lanzallamas();
        psyduck.burbuja();

        System.out.println(psyduck);
    }
}