/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author daves
 */
public class Computador extends Electronico {
    
        public enum Sistema
            {
                Windows, macOS, Linux, Android, iOS, ChromeOS, Unix, FreeBSD
            }
    
        private Sistema sistema;
        
        public Computador(Sistema pSistema, Gama pGama, double pPrecio)
	{
		super(pGama, pPrecio);
		sistema = pSistema;
	} 
        
       public String toString()
	{
		return "Computador "+sistema.name()+" - "+"Gama "+gama;
	}
    
    
    
}
