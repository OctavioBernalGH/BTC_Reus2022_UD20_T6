package com.dou.ud20.t6;

import com.dou.ud20.t6.view.MainView;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */

public class App {
	public static void main(String[] args) {
		/**
		 * Se crea una instancia de la clase MainView. Se otorga visibilidad a la vista
		 * mediante setVisible(true) y se le muestra al usuario la vista.
		 */
		MainView vistaPrincipal = new MainView();
		vistaPrincipal.setVisible(true);
	}
}
