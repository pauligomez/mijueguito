import java.util.Random;

public class principal {
    public static void main(String[] args) {

        int aleatorio, daño;
        boolean caninos = true;   

        personajes holly = new personajes();
        personajes chacha = new personajes();
        personajes yaqui = new personajes();
        personajes optimus = new personajes();

        Random rand = new Random(System.nanoTime());
        optimus.setNombre("OPTIMUS");
        optimus.setFisico(50);
        optimus.setMordida(80);
        optimus.setSalud(18000);

        holly.setNombre("HOLLy");
        holly.setFisico(40);
        holly.setMordida(45);
        holly.setSalud(17000);

        chacha.setNombre("CHACHA");
        chacha.setFisico(50);
        chacha.setMordida(80);
        chacha.setSalud(18000);

        yaqui.setNombre("YAQUI");
        yaqui.setFisico(40);
        yaqui.setMordida(45);
        yaqui.setSalud(17000);

        System.out.println("PERSONAJES");
        System.out.println();

        System.out.println(optimus.getNom() + " tiene una vida de: " + optimus.getSalud());
        System.out.println(holly.getNom() + " tiene una vida de: " + holly.getSalud());
        System.out.println(chacha.getNom() + " tiene una vida de: " + chacha.getSalud());
        System.out.println(yaqui.getNom() + " tiene una vida de: " + yaqui.getSalud());
        System.out.println();

        System.out.println("GUERRA DE DOGS");
        System.out.println("oprima ENTER para INICIAR...");

        try{
            System.in.read();
        }catch(Exception e){}

        System.out.println("\033[H\033[2J");
        System.out.flush();

        do {
            aleatorio = rand.nextInt(1);
            if (aleatorio <= 0) {
                daño = optimus.ataque_fisico();
            } else {
                daño = optimus.ataque_mordida();
            }

            System.out.println(optimus.getNom() + " ha realizado un ataque de "+daño+" a chacha");
            chacha.daño(daño);

            aleatorio = rand.nextInt(1);
            if (aleatorio <= 0) {
                daño = chacha.ataque_fisico();
            } else {
               daño = chacha.ataque_mordida();
            }

            System.out.println(chacha.getNom() + " ha realizado un ataque de "+daño+" a optimus");
            optimus.daño(daño);

            aleatorio = rand.nextInt(1);
            if (aleatorio <= 0) {
                daño = optimus.ataque_fisico();
            } else {
                daño = optimus.ataque_mordida();
            }

            System.out.println(holly.getNom() + " ha realizado un ataque de "+daño+" a yaqui");
            yaqui.daño(daño);

            if (chacha.getSalud() > 0) {
                aleatorio = rand.nextInt(1);
                if (aleatorio <= 0) {
                    daño = chacha.ataque_fisico();
                } else {
                    daño = chacha.ataque_mordida();
                }

                System.out.println(yaqui.getNom() + " ha realizado un ataque de "+daño+" holly");
                holly.daño(daño);

                aleatorio = rand.nextInt(1);
                if (aleatorio <= 0) {
                    optimus.daño(daño);
                } else {
                    holly.daño(daño);
                }
    
                
                System.out.println();
    
                try{
                    System.in.read();
                }catch(Exception e){}

                if (yaqui.getSalud() <= 0 || holly.getSalud() <= 0 || chacha.getSalud() <= 0 || optimus.getSalud() <= 0) {
                    caninos = false;
                }

                System.out.println(optimus.getNom() + " tiene una vida de: " + optimus.getSalud());
                System.out.println(holly.getNom() + " tiene una vida de: " + holly.getSalud());
                System.out.println(chacha.getNom() + " tiene una vida de: " + chacha.getSalud());
                System.out.println(yaqui.getNom() + " tiene una vida de: " + yaqui.getSalud());
                System.out.println();
                
            }
            try{
                System.in.read();
            }catch(Exception e){}
        } while (caninos);
    }

    static void atacarfisico(personajes uno, personajes dos, personajes tres, personajes cuatro ) {
        dos.setSalud(dos.getSalud() - cuatro.getFisico());
        tres.setSalud(tres.getSalud() - uno.getFisico());
    }
    
}