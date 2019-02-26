
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
public class Vender extends CompraVenta {
    @Override
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
    @Override
    public void inicializarEnCero(){
for(short i=0;i<cantidad.length;i++){
          cantidad[i]=0;
      }
 for(short i=0;i<ventasA.length;i++){
          ventasA[i]=0;
      }
}        
    @Override
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
    @Override
    public void mostrarCatalogo(){
System.out.print("\nTodos los Tipos\n");
for(short i=0;i<tipo.length;i++){
    System.out.print("\nTipo: "+tipo[i]+" Cantidad: "+cantidad[i]+"\n");
     }
}
    @Override
    public void activadoDeAlarmas(){
for(short e=0;e<cantidad.length;e++){
if(cantidad[e]<=alarma){
System.out.print("\nantencion "+tipo[e]+" por debajo de la cantidad necesaria necesita surtir vehiculos\n");   
        }
    }   
}
    @Override
    public void carrosVendidos(){
for(int x=0;x<tipo.length;x++){
System.out.print("\nCarros vendidos de: ");
System.out.print(tipo[x]);
System.out.print("=");
System.out.print(Integer.toString(ventasA[x]));
    }
}
    @Override
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
    @Override
    public void totalCarrosVendidos(){
for(int i=0;i<ventasA.length;i++){
       total=ventasA[i]+total;
        }
System.out.print("\ntotal carros vendidos:");
System.out.print(total);
}
    @Override
    public int colocarAlarma(short alarm){
alarma= alarm;
System.out.print("activado exitoso");
return alarm;
}
    @Override
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
    @Override
    public String digitarCadena(String cadena){
Scanner capt = new Scanner(System.in);
cadena= capt.next();
return cadena;      
}
    @Override
    public short digitarNumero(short num){
Scanner capt = new Scanner(System.in);
num=capt.nextShort();
return num;
}
    @Override
    public void imprimirHistorial(){
System.out.print("Historial ventas");
for(int i=0;i<100;i++){
 if(historialC[0][i]!=null)
 System.out.print("\nVenta de: "+historialC[0][i]+" Fecha: "+historialC[1][i]+"\n");
}
}
@Override
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
    @Override
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
