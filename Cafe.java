// import java.util.Scanner;

public class Cafe{

    private int agua;
    private int leche;
    private int granosCafe;
    private int vasos;
    private int dinero;

    public Cafe(int agua, int leche, int granosCafe, int vasos, int dinero) {   
        this.agua = agua;
        this.leche = leche;
        this.granosCafe = granosCafe;
        this.vasos = vasos;
        this.dinero = dinero;
    }

     public Cafe(int agua, int leche, int granosCafe, int dinero) {   
        this.agua = agua;
        this.leche = leche;
        this.granosCafe = granosCafe;
        this.dinero = dinero;
    }
    public void llenarCafetera(int agua, int leche, int granosCafe, int vasos){
        this.agua += agua;
        this.leche += leche;
        this.granosCafe += granosCafe;
        this.vasos += vasos;
    }

    public void prepararCafe(Cafe cafe) {
        if (verificarIngredientes(cafe)){
            System.out.println("\nSe preparo tu cafe");
            this.agua -= cafe.agua;
            this.leche -= cafe.leche;
            this.granosCafe -= cafe.granosCafe;
            this.vasos -= 1;
            this.dinero = cafe.dinero;
        }
    }

    public boolean verificarIngredientes(Cafe cafe) {
        if (this.agua - cafe.agua < 0) {    
            System.out.println("Lo siento, no hay water suficiente para preparar tu cafe");
            return false;
        }
        else if (this.leche - cafe.leche < 0) { 
            System.out.println("Lo siento, no hay leche suficiente para preparar tu cafe"); 
            return false;
        }
        else if (this.granosCafe - cafe.granosCafe < 0) {  
            System.out.println("Lo siento, no hay granos de café suficientes para preparar tu cafe");
            return false;
        }
        else if (this.vasos == 0) { 
            System.out.println("Lo siento, no hay vasos para poder servirte tu cafe");
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
        return "\n La maquina de cafe tiene: \n" +
            agua + " ml de agua\n" +
            leche + " ml de leche\n" +
            granosCafe + " gr de granos de cafe\n" +
            vasos + " vasos\n" +
            dinero + " Euros\n";
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

