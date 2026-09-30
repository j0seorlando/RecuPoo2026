package org.example;

import java.util.Scanner;

public class Main {




        public  static void main(String[]arg) {
            Torneo miTorneo = new Torneo();
            Scanner scanner = new Scanner(System.in);
            int opcion = 0;

            do {
                System.out.println("\n==================================");
                System.out.println(" Torneo Super Sayayin 2026 recuperacion :D  ");
                System.out.println("=====================================");
                System.out.println("1.AgregarParticipante");
                System.out.println("2.IniciarTorneo");

                System.out.println("3.MostrarParticipantes");
                System.out.println("4.Salir");

                if (scanner.hasNextInt()){
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion){
                        case 1:
                            System.out.println("Ingrese nombre del participante: ");
                            String nombre = scanner.nextLine().trim();
                            if (!nombre.isEmpty()) {
                                Torneo.agregarParticipante(nombre);
                            } else {
                                System.out.println("El nombre no puede estar vacio");
                            }
                            break;


                        case 4:
                            Torneo.mostrarFila();
                            break;
                        case 5:
                            System.out.println("Cerrando el Sistema");
                            break;
                        default:
                            System.out.println("Opcion invalida esta en proceso sorry ;c");
                    }
                }else {
                    System.out.println("Error: Debe ingresar un numero.");
                    scanner.nextLine();
                }
            } while(opcion !=5);
            scanner.close();


        }
    }


