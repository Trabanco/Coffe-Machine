public class Cafe{

    private int water;
    private int leche;
    private int granosCafe;
    private int vasos;
    private int dinero;

    public Cafe(int water, int leche, int granosCafe, int vasos, int dinero) {   
        this.water = water;
        this.leche = leche;
        this.granosCafe = granosCafe;
        this.vasos = vasos;
        this.dinero = dinero;
    }

     public Cafe(int water, int leche, int granosCafe, int dinero) {   
        this.water = water;
        this.leche = leche;
        this.granosCafe = granosCafe;
        this.dinero = dinero;
    }
    public void llenarCafetera(int water, int leche, int granosCafe, int vasos){
        this.water += water;
        this.leche += leche;
        this.granosCafe += granosCafe;
        this.vasos += vasos;
    }

    public void prepararCafe(Cafe cafe) {
        if (verificarIngredientes(cafe)){
            System.out.println("Estoy preparando tu café");
            this.water -= water;
            this.leche -= leche;
            this.granosCafe -= granosCafe;
            this.vasos -= 1;
            this.dinero = cafe.dinero;
        }
    }

    public boolean verificarIngredientes(Cafe cafe) {
        if (this.water - cafe.water < 0) {    
            System.out.println("Lo siento, no hay water suficiente para preparar tu café");
            return false;
        }
        else if (this.leche -cafe.leche < 0) { 
            System.out.println("Lo siento, no hay leche suficiente para preparar tu café"); 
            return false;
        }
        else if (this.granosCafe - cafe.granosCafe < 0) {  
            System.out.println("Lo siento, no hay granos de café suficientes para preparar tu café");
            return false;
        }
        else if (this.vasos == 0) { 
            System.out.println("Lo siento, no hay vasos para poder servirte tu café");
            return false;
        }
        return true;
    }

    public void retirarDinero() {
        System.out.println("Estas retirando el monto de : " + dinero);
        this.dinero = 0;
    }

    @Override
    public String toString(){
        return "\n La máquina de café tiene: \n" +
            water + " ml de water\n" +
            leche + " ml de leche\n" +
            granosCafe + " gr de granos de café\n" +
            vasos + " vasos\n" +
            "$" + dinero + "Euros de dinero\n";
    }

}

class Espresso extends Cafe{
    public Espresso(){
        super(250,0,16,4);
    }
}

class Latte  extends Cafe{
    public Latte(){
        super(350,75,20,7);
    }
}

class Cappuccino extends Cafe{
    public Cappuccino(){
        super(200,100,12,6);
    }
}

