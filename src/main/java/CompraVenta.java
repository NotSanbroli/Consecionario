
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public abstract class CompraVenta {
 Date fecha= new Date();
String[] tipo={"perzonalizado","estandar","maquinaria","deportivo"};
String[] catS= new String[100];
String[][] historialC= new String[2][100];
int [] cantidad=new int[tipo.length];
int [] ventasA=new int[tipo.length];
int menorV=0;
int mayorV=0;
int total=0;
short alarma=0;
short opcion=1;
short opcion2=1;
public void surtirCarro() {
String carroS = null;
System.out.print("\nque tipo de vehiculo desea surtir\n");
carroS = this.digitarCadena(carroS);
for(short i=0;i<100;i++){
if(catS[i]== null){
catS[i]=carroS;
break;
} 

}
System.out.print("\nadicion exitosa\n");
}
public void inicializarEnCero(){
for(short i=0;i<cantidad.length;i++){
          cantidad[i]=0;
      }
 for(short i=0;i<ventasA.length;i++){
          ventasA[i]=0;
      }
}
public void venderCarro() {
String carroS = null;
System.out.print("\nque tipo de vehiculo desea\n");
carroS = this.digitarCadena(carroS);
for(short i=0;i<100;i++){
if(historialC[0][i]== null){
historialC[0][i]=carroS;
historialC[1][i]=fecha.toString();
break;
}  
}
    }
public void resultadoStock(){
 for(short e=0;e<tipo.length;e++){//conteo de acum-ventas
 short acum=0;
for(short i=0;i<100;i++){
if(tipo[e].equals(catS[i])){
     acum++;
         }
    }
cantidad[e]=acum-ventasA[e];
  }
}
public void mostrarCatalogo(){
System.out.print("\nTodos los Tipos\n");
for(short i=0;i<tipo.length;i++){
    System.out.print("\nTipo: "+tipo[i]+" Cantidad: "+cantidad[i]+"\n");
     }
}
public void activadoDeAlarmas(){
for(short e=0;e<cantidad.length;e++){
if(cantidad[e]<=alarma){
System.out.print("\nantencion "+tipo[e]+" por debajo de la cantidad necesaria necesita surtir vehiculos\n");   
        }
    }   
}
public void carrosVendidos(){
for(int x=0;x<tipo.length;x++){
System.out.print("\nCarros vendidos de: ");
System.out.print(tipo[x]);
System.out.print("=");
System.out.print(Integer.toString(ventasA[x]));
    }
}
public void mostrarVendidos(){
menorV=ventasA[0];
short index=0;
for(short i=0;i<ventasA.length;i++){
    if(ventasA[i]<=menorV){
        menorV=ventasA[i] ;
    index=i;
        }
    }
System.out.print("\nel carro menos vendido es: "+tipo[index]+"\n");
mayorV=ventasA[0];
for(short i=0;i<ventasA.length;i++){
    if(ventasA[i]>=mayorV){
        mayorV=ventasA[i] ;
        index=i;
        }
    }
System.out.print("\nel carro mas vendido es: "+tipo[index]+"\n");
}
public void totalCarrosVendidos(){
for(int i=0;i<ventasA.length;i++){
       total=ventasA[i]+total;
        }
System.out.print("\ntotal carros vendidos:");
System.out.print(total);
}
public int colocarAlarma(short alarm){
System.out.print("numero minimo de carros para activar la alarma \n");
alarma= alarm;
System.out.print("activado exitoso");
return alarm;
}
public void sumarAcumulado(){
for(short e=0;e<tipo.length;e++){
 short acum=0;
for(short i=0;i<100;i++){
if(tipo[e].equals(historialC[0][i])){
     acum++;
         }
    }
ventasA[e]=acum;
}
}
public String digitarCadena(String cadena){
Scanner capt = new Scanner(System.in);
cadena= capt.next();
return cadena;      
}
public short digitarNumero(short num){
Scanner capt = new Scanner(System.in);
num=capt.nextShort();
return num;
}
public void imprimirHistorial(){
 System.out.print("Historial ventas");
             for(int i=0;i<100;i++){
                 if(historialC[0][i]!=null)
                 System.out.print("\nVenta de: "+historialC[0][i]+" Fecha: "+historialC[1][i]+"\n");
             }
}
public void acumuladoVentas(){
for(short e=0;e<tipo.length;e++){
short acum=0;
for(short i=0;i<100;i++){
if(tipo[e].equals(historialC[0][i])){
acum++;
 }
}
ventasA[e]=acum;
}
}
}
