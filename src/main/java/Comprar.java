/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Comprar extends CompraVenta {

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
