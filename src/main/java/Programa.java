/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Programa {



        public static void main (String[] arg)
    {
        
        Vender vendedor;
        Comprar comprador;
        comprador = new Comprar();
        vendedor = new Vender();
        vendedor.catS[0]="perzonalizado";
        vendedor.catS[1]="estandar";
        vendedor.catS[2]="maquinaria";
        vendedor.catS[3]="deportivo";
        vendedor.inicializarEnCero();
        while(vendedor.opcion!=0){
        vendedor.resultadoStock();
        System.out.print("\nVendedor oprima 1, Comprador oprima 2 para salir oprima0\n");
        short num = 0;
        vendedor.opcion=vendedor.digitarNumero(num);
        if(vendedor.opcion==0){
          break;
          }
      switch(vendedor.opcion){
          case 1:
              vendedor.mostrarCatalogo();
              while(vendedor.opcion2!=0){
                vendedor.activadoDeAlarmas();
                System.out.print("\noprima 1 para surtir vehiculos, 2 para ver el carro menos vendido y el mas vendido, 3 para ver total carros vendidos,4 para poner una alarma, 5 para mirar el historial de ventas y 0 para salir\n");
                vendedor.opcion2=vendedor.digitarNumero(num);
                if(vendedor.opcion2==0){
                break;
                }
                switch(vendedor.opcion2){
                    case 1:
                        vendedor.mostrarCatalogo();
                        vendedor.surtirCarro();
                        vendedor.resultadoStock();
                        vendedor.mostrarCatalogo();
                        break;
                    case 2:
                        vendedor.carrosVendidos();
                        vendedor.mostrarVendidos();
                        break;
                    case 3:
                        vendedor.totalCarrosVendidos();
                        break;
                    case 4:
                        System.out.print("numero minimo de carros para activar la alarma \n");
                        vendedor.alarma=vendedor.digitarNumero(vendedor.alarma);
                        vendedor.colocarAlarma(vendedor.alarma);
                        break;
                    case 5:
                        vendedor.imprimirHistorial();
                        break;
                }
              }
              break;
          case 2:
              vendedor.mostrarCatalogo();
              vendedor.venderCarro();
              vendedor.acumuladoVentas();
              vendedor.resultadoStock();
              vendedor.mostrarCatalogo();
              break;
      }
        }
    }
        
}

