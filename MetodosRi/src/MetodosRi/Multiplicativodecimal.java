/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MetodosRi;


import java.util.Scanner;
public class Multiplicativodecimal {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int a=0, no=0, b=0;
         int cont=0, n1=0, rs1=0;
        float ri1=0;
        cont=cont+1;
        String binario="";
        int []nn=new int [cont];
        int []rs=new int [cont];
        int []newno=new int[cont];
        float []ri=new float[cont];
        System.out.println("*** Metodo Multiplicativo Decimal ***");
        System.out.println("Dame el valor de 'a': ");
        a=leer.nextInt();
        System.out.println("Dame el valor de 'mod': ");
        b=leer.nextInt();
        System.out.println("Dame el valor de 'n0': ");
        newno[0]=leer.nextInt();



        if(((no>=0)&&(a>=0)&&(b>=0))&&((b>a)&&(b>no))){
            for(int i=0;;i++){
                if(newno[i]>0){
                    //newno[i+1]=rs[i];
                    nn[i]=(a*newno[i]);
                    if(nn[i]>0){
                        while(nn[i]>0){
                            if(nn[i]%2==0){binario="0"+binario;}
                    else{binario="1"+binario;}
                    nn[i]=(int)nn[i]/2;
                    }
                    }
                    else if(nn[i]==0){binario="0";}
                    
                    else{binario="No se convirtio, otro num.";}
                    
                    System.out.println("Binario"+binario);
                    
                    
                    //rs[i]=nn[i]%b;
                    //ri[i]=nn[i]/(float)b;
                    System.out.println("Binario"+binario);
                    //System.out.println("Termino de generar ri");
                    //System.out.println("El ri es: " + ri[i]+"");
                }
                else{
                    System.out.println("Termino de generar ri");
                }
            }

        }
    else{
            System.out.println("Los valores de a, mod, no; no cumplen con la condicon");
    }

        
    }

}
