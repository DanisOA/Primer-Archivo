/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosRi;

/**
 *
 * @author ROdolfo
 */
import java.lang.Math; 
import javax.swing.*;
public class Generadores{

   void multmixtb(){
      int sb=2;
   
   /////////x irrelevante
      int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla x>0,\nEn este generador el Valor de X es Irrelevante"));// valor de x>0
   
   ////////// seleccion de a
   //int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del multiplicativo a con la condicion:(a-1)%4==0)"));// valor de a>0
      int k=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccion de a:\nInserta el valor k> o igual a 2 "));// valor de k>0 o 
      int a =(int) Math.pow(sb, k)+1; 
   
      if((a-1)%4==0){
         JOptionPane.showMessageDialog(null,"La condicion se cumple");
      }
      else{
         JOptionPane.showMessageDialog(null,"porfavor revisa las condiciones");
         System.exit(0);
      }
      int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de La constante c:\n con la condicion: (c)%8==5"));// valor de c=constante aditiva
      if((c)%8==5){
         JOptionPane.showMessageDialog(null,"La condicion se cumple");
      }
      else{
         JOptionPane.showMessageDialog(null,"porfavor revisa las condiciones");
         System.exit(0);
      }
   //int m=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del modulador, condicion:que sea el numero primo mas grande posible y que a su vez sea menor que Pd "));// valor de c=constante aditiva
   
      int spm=2;// base  binaria
      int dd=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de d del sistema  binario "));// valor de c=constante aditiva
   
      int m =((int) Math.pow(spm, dd))-3; //ajusta el numero primo mas grande  y menor que la base elevada a d
   
      JOptionPane.showMessageDialog(null,"EL valor de m en sistema  Binario es:\n"+m);
   
   
      int d=(a*x)+c;// valor guardado en memoria para modularlo
      int vlormodulado=d%m;
      System.out.println("valor modulado es:"+vlormodulado);//=1
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado)+c;
         vlormodulado=d%m;
         System.out.println("valor modulado es:"+vlormodulado);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado);
      }
   }

   void multmixtd(){
   
      int smd=10;// sistema  mixto decimal
   
   /////////x irrelevante
      int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla x>0,\nEn este generador el Valor de X es Irrelevante"));// valor de x>0
   
   ////////// seleccion de a
   //int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del multiplicativo a con la condicion:(a-1)%4==0)"));// valor de a>0
      int k=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccion de a:\nInserta el valor k> o igual a 2\npara obtener a "));// valor de k>0 o 
      int a =(int) Math.pow(smd, k)+1; 
      JOptionPane.showMessageDialog(null,"El valor de a: en sistema decimal es:\n"+a);
   
   //if((a-1)%4==0){
   //JOptionPane.showMessageDialog(null,"La condicion se cumple");
   //}else{
   //JOptionPane.showMessageDialog(null,"porfavor revisa las condiciones");
   //System.exit(0);
   //}
      int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de La constante c:\n con la condicion: (c)%8==5"));// valor de c=constante aditiva
      if((c)%200==21){
         JOptionPane.showMessageDialog(null,"La condicion se cumple");
      }
      else{
         JOptionPane.showMessageDialog(null,"porfavor revisa las condiciones");
         System.exit(0);
      }
   //int m=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del modulador, condicion:que sea el numero primo mas grande posible y que a su vez sea menor que Pd "));// valor de c=constante aditiva
   
      int spmm=10;// base  decimal
      int dd=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de d del sistema  binario "));// valor de c=constante aditiva
   
      int m =((int) Math.pow(spmm, dd))-3; //ajusta el numero primo mas grande  y menor que la base elevada a d
   
   
   
   
      int d=(a*x)+c;// valor guardado en memoria para modularlo
      int vlormodulado=d%m;
      System.out.println("valor modulado es:"+vlormodulado);//=1
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado)+c;
         vlormodulado=d%m;
         System.out.println("valor modulado es:"+vlormodulado);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado);
      }
   }

   void GeneradorCongrunccialMulenBinario(){
   
      double x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla X:\n Cualquier entero Impar"));// valor de x>0
   
      if(x%2!=0){
         JOptionPane.showMessageDialog(null,"Es impar la condicion se cumple");
      }
      else{
         JOptionPane.showMessageDialog(null,"No es  impar  revisa las condiciones");
         System.exit(0);
      }
      double t=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de t:\n para genrar  el  valor de A:"));// valor de a>0
   
      double a=((8*t)+3);
   
      double dd2=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de d:\npara generar M"));// valor de c=constante aditiva
   
      double gmb=2;
   
      double m =((double) Math.pow(gmb, dd2)-3);
      JOptionPane.showMessageDialog(null,"M  vale  en sistema Binario:\n "+m);
   
      double d=(a*x);// valor guardado en memoria para modularlo
   
      double vlormodulado=d%m;
      System.out.println("valor modulado es:"+vlormodulado/m);//=1
   
   
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado);
         vlormodulado=d%m;
         System.out.println(""+vlormodulado/m);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado/m);
      }
   
   
   
   }
   void GeneradorCongrunccialMulenDecimal(){
   //El valor de la semilla X0 puede ser cualquier entero impar no divisible entre 2 o 5.
   
      int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla X:\n que no sea divisible entre 2 o 5"));// valor de x>0
   
   
   
   
   
      int t=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de t:\n para genrar  el  valor de A:"));// valor de a>0
   
      int a=((200*t)+19);
   
      int dd2=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de d:\npara generar M"));// valor de c=constante aditiva
   
      int gmb=10;
   
      int m =((int) Math.pow(gmb, dd2));
      JOptionPane.showMessageDialog(null,"M  vale  en sistema Decimal:\n "+m);
   
      int d=(a*x);// valor guardado en memoria para modularlo
   
      int vlormodulado=d%m;
      System.out.println("valor modulado es:"+vlormodulado);//=1
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado);
         vlormodulado=d%m;
         System.out.println("valor modulado es:"+vlormodulado);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado);
      }
   
   
   
   
   }

   public void GeneradorMixtoconvaloresestablecidos(){
      int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla x>0"));// valor de x>0
   
      int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del multiplicativo a )"));// valor de a>0
   
      int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de La constante c"));// valor de c=constante aditiva
   
      int m=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del modulador "));// valor de c=constante aditiva
   
      double d=(a*x)+c;// valor guardado en memoria para modularlo
      double vlormodulado=d%m;
      System.out.println(""+vlormodulado+"..."+vlormodulado);//=1
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado)+c;
         vlormodulado=d%m;
         System.out.println(""+vlormodulado/m+""+vlormodulado);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado);
      }
   
   }


   public void GM(){
      int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor de la semilla x>0,"));// valor de x>0
   
      int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del multiplicativo a));// valor de a>0"));
   
      int m=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el valor del modulador "));// valor de c=constante aditiva
   
      int d=(a*x);// valor guardado en memoria para modularlo
      int vlormodulado=d%m;
      System.out.println(""+vlormodulado);//=1
   
   
      while (vlormodulado!=x){
         d=(a*vlormodulado);
         vlormodulado=d%m;
         System.out.println(""+vlormodulado/m);//=1
      }
      if(vlormodulado==x){
         System.out.println("se encontro la igualdad de la semilla X:"+vlormodulado);
      }
   
   
   }


   public static void main(String args[]){
      Generadores ge = new Generadores ();
   
      int op;
   
      do{
      
         op=Integer.parseInt (JOptionPane.showInputDialog(null,"Menu selcciona un generador\n1.-Generador Mixto Binario\n2.-Generador Mixto Decimal\n3.-Generador Multiplicativo Binario\n4.-Generador Multiplicativo Decimal\n5.-Gmixto con valores establecidos\n6.-Gmultiplicativo con valores establecido\n7.-SALIR"));
      
         switch (op){
         
         
            case 1:ge.multmixtb();
               break;
            case 2:ge.multmixtd();
               break;
            case 3: ge.GeneradorCongrunccialMulenBinario();
               break;
            case 4: ge.GeneradorCongrunccialMulenDecimal();
               break;
            case 5: ge.GeneradorMixtoconvaloresestablecidos();
               break;
            case 6: ge.GM();
               break;
         
         }
      }while(op!=7);
   
   
   
   }


}             

