import java.util.Scanner;

public class App {

    static Cafe cafe = new Cafe(400, 540, 120, 10, 500);
    final static Scanner scanner = new Scanner(System.in);

    static void elegirCafe(){
        String elegirCafe;
        TipoCafe tipoCafe;
        do {
            System.out.println("Elegir tipo de cafe : 1- Espresso, 2- Latte, 3- Cappuccino, regresar al menu principal");
            elegirCafe = scanner.next();

            if(elegirCafe.equals("regresar")){
                return;
            }

            tipoCafe = TipoCafe.encontrarPorId(Integer.parseInt(elegirCafe));

            switch(tipoCafe){
                case ESPRESSO: 
                  Cafe espresso = new Espresso();
                  cafe.prepararCafe(espresso);
                break;
                case LATTE:
                  Cafe latte = new Latte();
                  cafe.prepararCafe(latte);
                break;
                case CAPPUCCINO:
                    Cafe cappuccino = new Cappuccino();
                    cafe.prepararCafe(cappuccino);
                break; 
                default:
            }


        } while (tipoCafe.name().equals("NOT_FOUND"));

    }

    static void llenarIngredientes(){


        String opcion;
        do {
            System.out.println("Escribir accion a realizar : Comprar, Llenar, Retirar, Verificar, Salir");
            opcion = scanner.next.next();
            switch(opcion){
                case "Comprar" :
                elegirCafe();
                break;
                case "Llenar" :
                llenarIngredientes();
                break;
                case "Retirar" :

                break;
                case "Verificar" :   

                break;
                case "Salir" :   
                break;
                default :
                System.out.println("Opcion no valida ");


            }while(!opcion.equals("salir"));
        System.out.println(cafe);
        }
    }
}

