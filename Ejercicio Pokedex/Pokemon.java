public abstract class Pokemon{

    protected String nombre;
    protected String tipo; 
    protected int numeroUnico;
    protected int generacion;
    protected int daño;

    public Pokemon(String nombre, int numeroUnico, int generacion){
        this.nombre = nombre;
        this.numeroUnico = numeroUnico;
        this.generacion = generacion;
    }

    public String toString(){
        return "\n=== DATOS DEL POKEMON ==="+"\nNombre: " + nombre + "\nTipo: " + tipo + "\nNumero unico: " + numeroUnico + "\nGeneracion: " + generacion + "\nDaño total realizado: " + daño + "\n";
    }
}