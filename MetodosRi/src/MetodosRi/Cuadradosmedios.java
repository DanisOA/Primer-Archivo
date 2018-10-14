
import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
 
class Cuadradosmedios
{
	public static void main(String arg[])throws IOException
	{
 
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
 
		int cantidad,semilla=1835;
		int tamano1,tamano2,i;
		String cadena,new_numero;
		cadena=String.valueOf(semilla);				// conversion de entero a cadena
		tamano1=cadena.length();					// tama�o de la cadena
 
		double semilla_cuadrada=Integer.parseInt(JOptionPane.showInputDialog("VALOR DE A"));
 
		cantidad=Integer.parseInt(JOptionPane.showInputDialog(" NUMEROS A GENERAR"));
 
 
		for(i=0; i<cantidad; i++)
		{
			semilla_cuadrada=Math.pow(semilla,2);
			new_numero=proceso_seleccion(semilla_cuadrada,tamano1);
			Integer entero=new Integer(new_numero);
			semilla=entero.intValue();
                        //DecimalFormat decf = new DecimalFormat(".######");
			System.out.println("."+semilla);
 
		}
 
	}
 
	static String proceso_seleccion(double recibe_semilla,int tamano1)
	{
		int tamano2,resta,contador=0;  int i,posicion=0;
		String new_cadena="",cadena;
 
		int semilla=(int)recibe_semilla;
		cadena=String.valueOf(semilla);	// conversion de entero a cadena
		tamano2=cadena.length();		// tama�o de la cadena
 
		resta=(tamano2)-tamano1;
		posicion=tamano2%tamano1;
 
		if (posicion==0)
		{	
			posicion=tamano2/tamano1;
			for(i=posicion; ; i++)
			{
				if (contador!=tamano1)
				{
					new_cadena+=cadena.charAt(i);
					contador++;
				}
				else
				{
					break;
				}
 
			}	
		}	
		else
		{				
			for(i=posicion-1; ; i++)
			{
				if (contador!=tamano1)
				{
					new_cadena+=cadena.charAt(i);
					contador++;
				}
				else
				{
					break;
				}
			}
 
		}
		return new_cadena;
	}
	static int tamano(double semilla)
	{
		int i=0,c=0;
		for(i=0; i<20; i++)
		{
			c++;
			semilla=semilla/10;
 
			 if (semilla<10)
			 {
			 	c++;
				i=20;	
			 }
		}
		 return c;
	}
}