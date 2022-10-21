/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class Lab2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pochita= new Scanner(System.in);
        
        //Inicio de Menu
        do{
           System.out.println("------Bienvenido al menu------");
           System.out.println("1.Índice Academico"); //Ejercicio practico 1
           System.out.println("2.¡Ok Boomer!"); //Ejercicio practico 2
           System.out.println("3.¡Gotta Know Them All!"); //Ejercio practico 3
           System.out.println("4.Salir"); //Salir
           int opcSeleccionada= pochita.nextInt();
           
           if(opcSeleccionada== 1){
               //Ejercicio 1
               System.out.println("Ingrese el primer numero: ");
               int primerNumero= pochita.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               int segundoNumero= pochita.nextInt();
               int A= primerNumero;
               int B= segundoNumero;
               if(primerNumero>0&&segundoNumero>0){
                  while(primerNumero != segundoNumero){
                      if(primerNumero>segundoNumero){
                          int Mayor= primerNumero;
                          int Menor= segundoNumero;
                          primerNumero= Mayor-Menor;
                      }else{
                          int Mayor= segundoNumero;
                          int Menor= primerNumero;
                          segundoNumero= Mayor-Menor;
                      }
                  }
                  int resp= primerNumero;
                  System.out.println("El MCD de "+ A + " y "+ B + " es: "+resp);
               }else{
                   System.out.println("Los numeros ingresados deben ser positivos");
               }
                       
                   
               
               
           }else if(opcSeleccionada== 2){
               //Ejercicio 2
               System.out.print("Ingrese su año de nacimiento:");
               int añoNacimiento= pochita.nextInt();
               if(añoNacimiento>= 1946 && añoNacimiento<=1964){
                   System.out.println("¡Felicidades usted es de la Baby Boomer Gen!");
               }else if(añoNacimiento>=1960 && añoNacimiento<=1979){
                   System.out.println("¡Felicidades usted es de la Generation X");
               }else if(añoNacimiento>=1975 && añoNacimiento<=1985){
                   System.out.println("¡Felicidades usted es de la generación Xennials");
               }else if(añoNacimiento>=1980 && añoNacimiento<=1994){
                   System.out.println("¡Felicidades usted es de la generación Millenials");
               }else if(añoNacimiento>=1990 && añoNacimiento<=2012){
                   System.out.println("¡Felicidades usted es de la Gen Z");
               }else if(añoNacimiento>=2013 && añoNacimiento<=2025){
                   System.out.println("¡Felicidades usted es de la Gen Alpha");
               }else{
                   System.out.println("Año mencionado no valido");
               }
           }else if(opcSeleccionada== 3){
               //Ejercio 3
               System.out.println("Ingrese el Tipo del Atacador: ");
               System.out.println("1.Fighting/Lucha");
               System.out.println("2.Psychic/Psíquico");
               System.out.println("3.Steel/Hierro");
               System.out.println("4.Fairy/Hada");
               int atk= pochita.nextInt();//atk = Atacador
               System.out.println("1.Fighting/Lucha");
               System.out.println("2.Psychic/Psíquico");
               System.out.println("3.Steel/Hierro");
               System.out.println("4.Fairy/Hada");
               int def= pochita.nextInt();//def = Defensor
               if (atk == 1){
                   if(def == 1){
                       System.out.println("¡El tipo Fighting es Neutral contra el tipo Fighting!");
                   }else if(def == 2){
                       System.out.println("¡El tipo Fighting es Debil contra el tipo Psychic!");
                   }else if(def == 3){
                       System.out.println("¡El tipo Fighting es Super Eficaz contra el tipo Steel!");
                   }else if(def == 4){
                       System.out.println("¡El tipo Fighting es Debil contra el tipo Fairy!");
                   }else{
                       System.out.println("Tipo defensor no valido");
                   }
               }else if(atk == 2){
                   if(def == 1){
                       System.out.println("¡El tipo Psychic es Super Eficaz contra el tipo Fighting!");
                   }else if(def == 2){
                       System.out.println("¡El tipo Psychic es Debil contra el tipo Psychic!");
                   }else if(def == 3){
                       System.out.println("¡El tipo Psychic es Debil contra el tipo Steel!");
                   }else if(def == 4){
                       System.out.println("¡El tipo Psychic es Neutral contra el tipo Fairy!");
                   }else{
                       System.out.println("Tipo defensor no valido");
                   }
               }else if(atk == 3){
                   
                    if(def == 1){
                       System.out.println("¡El tipo Steel es Neutral contra el tipo Fighting!");
                   }else if(def == 2){
                       System.out.println("¡El tipo Steel es Neutral contra el tipo Psychic!");
                   }else if(def == 3){
                       System.out.println("¡El tipo Steel es Debil contra el tipo Steel!");
                   }else if(def == 4){
                       System.out.println("¡El tipo Steel es Super Eficaz contra el tipo Fairy!");  
                   }else{
                       System.out.println("Tipo defensor no valido");
                   } 
               }else if(atk == 4){
                   if(def == 1){
                       System.out.println("¡El tipo Fairy es Super Eficaz contra el tipo Fighting!");
                   }else if(def == 2){
                       System.out.println("¡El tipo Fairy es Neutral contra el tipo Psychic!");
                   }else if(def == 3){
                       System.out.println("¡El tipo Fairy es Debil contra el tipo Steel!");
                   }else if(def == 4){
                       System.out.println("¡El tipo Fairy es Neutral contra el tipo Fairy!");
                   }else{
                       System.out.println("Tipo defensor no valido");
                   }
               }else{
                 System.out.println("El tipo atacador no es valido");
               }
           }else if(opcSeleccionada==4){
               //Saliendo del menu
                System.out.println("Saliendo");
                break;
           }else{
               //Numero no valido
               System.out.println("Opcion no valida, elija otra");
           }
        }while(true);
        
    }
    
}
