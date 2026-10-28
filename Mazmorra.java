import java.util.Random;
import java.util.Scanner;

public class Mazmorra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aventurero aventurero = new Aventurero("Presi", 150, 35, 3);
        Enemigo enemigo1 = new Enemigo("Duende", 10, 10);
        Enemigo enemigo2 = new Enemigo("Trasgo", 60, 25);
        Enemigo enemigo3 = new Enemigo("Orco", 130, 50);
        Enemigo enemigo4 = new Enemigo("Comandante verde", 150, 75);
        Enemigo enemigo5 = new Enemigo("Tsu Uruk, General de las tropas verdes", 500, 120);

        int eleccion;
        int resultadoDado;

        try {

            resultadoDado = tirarDado20();

            switch (resultadoDado) {
                case 1, 2, 3, 4, 5:
                    while (aventurero.estaCaido() == false && enemigo1.estaDerrotado() == false) {
                        System.out.printf("El enemigo es \033[37m%s\033[0m y tiene \033[31m%d de vida\033[0m. Tu tienes \033[32m%d de vida\033[0m y \033[35m%d de pociones\033[0m.\n",
                                enemigo1.getNombreMostro(), enemigo1.getVidaMostroAhora(), aventurero.getVidaAventureroAhora(),
                                aventurero.getCantidadPociones());
                        System.out.println("¿Que vas a hacer?");
                        System.out.println("===========================================================");
                        System.out.println("Opciones");
                        System.out.println("===========================================================");
                        System.out.println("1 Destruccion masiva al enemigo");
                        System.out.println("2 Hay me duele, tengo pupita quiero curarme");
                        eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                resultadoDado = tirarDado20();
                                System.out.printf("El dado sale: %d\n", resultadoDado);
                                if (resultadoDado == 20) {
                                    System.out.println("Auraaaa daño doble");
                                    aventurero.atacar(enemigo1);
                                    aventurero.atacar(enemigo1);
                                } else if (resultadoDado == 1) {
                                    System.out.println("Nove vaya pedazo de paquete no das una macho");
                                } else {
                                    aventurero.atacar(enemigo1);
                                }

                                break;
                            case 2:
                                aventurero.bbPosionPaCura();
                                break;
                            default:
                                System.out.println("Eso no es una opcion xivato mierda");
                                break;
                        }
                        aventurero.recibirDañoAventurero(enemigo1);
                    }
                    break;

                case 6, 7, 8, 9, 10, 11:
                    while (aventurero.estaCaido() == false && enemigo2.estaDerrotado() == false) {
                        System.out.printf("El enemigo es \033[36m%s\033[0m y tiene \033[31m%d de vida\033[0m. Tu tienes \033[32m%d de vida\033[0m y \033[35m%d de pociones\033[0m.\n",
                                enemigo2.getNombreMostro(), enemigo2.getVidaMostroAhora(), aventurero.getVidaAventureroAhora(),
                                aventurero.getCantidadPociones());
                        System.out.println("¿Que vas a hacer?");
                        System.out.println("===========================================================");
                        System.out.println("Opciones");
                        System.out.println("===========================================================");
                        System.out.println("1 Destruccion masiva al enemigo");
                        System.out.println("2 Hay me duele, tengo pupita quiero curarme");
                        eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                resultadoDado = tirarDado20();
                                System.out.printf("El dado sale: %d\n", resultadoDado);
                                if (resultadoDado == 20) {
                                    System.out.println("Auraaaa daño doble");
                                    aventurero.atacar(enemigo2);
                                    aventurero.atacar(enemigo2);
                                } else if (resultadoDado == 1) {
                                    System.out.println("Nove vaya pedazo de paquete no das una macho");
                                } else {
                                    aventurero.atacar(enemigo2);
                                }

                                break;
                            case 2:
                                aventurero.bbPosionPaCura();
                                break;
                            default:
                                System.out.println("Chingada madre wey eso no es una opcion carajo");
                                break;
                        }
                        aventurero.recibirDañoAventurero(enemigo2);
                    }
                    break;
                case 12, 13, 14, 15, 16:
                    while (aventurero.estaCaido() == false && enemigo3.estaDerrotado() == false) {
                        System.out.printf("El enemigo es \033[33m%s\033[0m y tiene \033[31m%d de vida\033[0m. Tu tienes \033[32m%d de vida\033[0m y \033[35m%d de pociones\033[0m.\n",
                                enemigo3.getNombreMostro(), enemigo3.getVidaMostroAhora(), aventurero.getVidaAventureroAhora(),
                                aventurero.getCantidadPociones());
                        System.out.println("¿Que vas a hacer?");
                        System.out.println("===========================================================");
                        System.out.println("Opciones");
                        System.out.println("===========================================================");
                        System.out.println("1 Destruccion masiva al enemigo");
                        System.out.println("2 Hay me duele, tengo pupita quiero curarme");
                        eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                resultadoDado = tirarDado20();
                                System.out.printf("El dado sale: %d\n", resultadoDado);
                                if (resultadoDado == 20) {
                                    System.out.println("Auraaaa daño doble");
                                    aventurero.atacar(enemigo3);
                                    aventurero.atacar(enemigo3);
                                } else if (resultadoDado == 1) {
                                    System.out.println("Nove vaya pedazo de paquete no das una macho");
                                } else {
                                    aventurero.atacar(enemigo3);
                                }

                                break;
                            case 2:
                                aventurero.bbPosionPaCura();
                                break;
                            default:
                                System.out.println("Eso no es una opcion xivato mierda");
                                break;
                        }
                        aventurero.recibirDañoAventurero(enemigo3);
                    }
                    break;
                case 17, 18, 19:
                    while (aventurero.estaCaido() == false && enemigo4.estaDerrotado() == false) {
                        System.out.printf("El enemigo es \033[34m%s\033[0m y tiene \033[31m%d de vida\033[0m. Tu tienes \033[32m%d de vida\033[0m y \033[35m%d de pociones\033[0m.\n",
                                enemigo4.getNombreMostro(), enemigo4.getVidaMostroAhora(), aventurero.getVidaAventureroAhora(),
                                aventurero.getCantidadPociones());
                        System.out.println("¿Que vas a hacer?");
                        System.out.println("===========================================================");
                        System.out.println("Opciones");
                        System.out.println("===========================================================");
                        System.out.println("1 Destruccion masiva al enemigo");
                        System.out.println("2 Hay me duele, tengo pupita quiero curarme");
                        eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                resultadoDado = tirarDado20();
                                System.out.printf("El dado sale: %d\n", resultadoDado);
                                if (resultadoDado == 20) {
                                    System.out.println("Auraaaa daño doble");
                                    aventurero.atacar(enemigo4);
                                    aventurero.atacar(enemigo4);
                                } else if (resultadoDado == 1) {
                                    System.out.println("Nove vaya pedazo de paquete no das una macho");
                                } else {
                                    aventurero.atacar(enemigo4);
                                }

                                break;
                            case 2:
                                aventurero.bbPosionPaCura();
                                break;
                            default:
                                System.out.println("Eso no es una opcion xivato mierda");
                                break;
                        }
                        aventurero.recibirDañoAventurero(enemigo4);
                    }
                    break;
                case 20:
                    while (aventurero.estaCaido() == false && enemigo5.estaDerrotado() == false) {
                        System.out.printf("El enemigo es \033[30m%s\033[0m y tiene \033[31m%d de vida\033[0m. Tu tienes \033[32m%d de vida\033[0m y \033[35m%d de pociones\033[0m.\n",
                                enemigo5.getNombreMostro(), enemigo5.getVidaMostroAhora(), aventurero.getVidaAventureroAhora(),
                                aventurero.getCantidadPociones());
                        System.out.println("¿Que vas a hacer?");
                        System.out.println("===========================================================");
                        System.out.println("Opciones");
                        System.out.println("===========================================================");
                        System.out.println("1 Destruccion masiva al enemigo");
                        System.out.println("2 Hay me duele, tengo pupita quiero curarme");
                        eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                resultadoDado = tirarDado20();
                                System.out.printf("El dado sale: %d\n", resultadoDado);
                                if (resultadoDado == 20) {
                                    System.out.println("Auraaaa daño doble");
                                    aventurero.atacar(enemigo5);
                                    aventurero.atacar(enemigo5);
                                } else if (resultadoDado == 1) {
                                    System.out.println("Nove vaya pedazo de paquete no das una macho");
                                } else {
                                    aventurero.atacar(enemigo5);
                                }

                                break;
                            case 2:
                                aventurero.bbPosionPaCura();
                                break;
                            default:
                                System.out.println("Eso no es una opcion xivato mierda");
                                break;
                        }
                        aventurero.recibirDañoAventurero(enemigo5);
                    }
                    break;

            }

            if (aventurero.estaCaido() == true){
                System.out.println("Nooooooove picha vaya paquetoncio.");
                System.out.println("Valiente paliza te han dado que vergüenza");
            }else{
                System.out.println("WWWWWW has ganado pichita quien te ha visto y quien te ve.");
                System.out.println("Te daria la enhorabuna pero es que ha sido de potra chaval.");
            }
            

        } catch (Exception e) {
            System.out.println("Errol puñeta");
        }
    }

    private static int tirarDado20() {
        Random dado = new Random();
        return dado.nextInt(20) + 1;
    }

}
