import java.util.Random;

public class personajes {

    private int salud, ataque, mordida;
    private String nombre;

    private Random rand = new Random(System.nanoTime());

    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud){
        this.salud = salud;
    }
    public int getFisico() {
        return ataque;
    }
    public void setFisico(int fisico) {
        this.ataque = fisico;
    }
    public int getMordida() {
        return mordida;
    }
    public void setMordida(int mordida) {
        this.mordida = mordida;
    }
    
    
    public String getNom(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ATAQUE
    public int ataque_fisico(){
        int aleatorio = rand.nextInt(4);
        return mordida * ataque * aleatorio;
    }

    public int ataque_mordida(){
        if(salud < 0){
            salud--;
            return ataque * mordida;
        }else{
            return 0;
        }
    }

    public void daño(int daño){
        this.salud =this.salud-daño;
    }
}