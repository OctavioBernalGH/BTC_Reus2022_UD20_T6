<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T06</h1></td>
  
 </tr>
</table>
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contiene un botón, y 3 text filed. El usuario introducirá la altura en metros y el peso en kilogramos, al pulsar el botón calc imc se calculará el índice de masa corporal. </p>

![UD20-T6](https://user-images.githubusercontent.com/103035621/167313918-c865caad-58dd-4cb6-95fe-833256790ea5.png)


<p align="justify">En la imagen anterior se explica de forma breve y precisa el funcionamiento del aplicativo. Para trabajar de forma eficiente se crean dos clases, la primera de ellas será la App.Java donde vendrá ubicado el código que dará visibilidad al JFrame, y la segunda clase llamada MainView.Java es donde estará el código referente a la vista.</p>

En la siguiente clase se introduce el código necesario para dar visibilidad al JFrame.
<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
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

  ```
 </details>
 
 
 <p align="justify">En la siguiente clase se introduce el código de la vista, se crean los componentes, se otorga un nombre a ellos para su uso y se utilizan los diferentes eventos para crear la aplicación.</p>
 
<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t6.view;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtKilos;
	private JTextField txtIMC;

	/**
	 * Se crea la vista principal del programa. En esta vista se calculará el IMC
	 * mediante la altura y el peso que el usuario introducira en los textFiled.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtAltura = new JTextField();
		txtAltura.setBounds(141, 69, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(34, 72, 89, 14);
		contentPane.add(lblNewLabel);

		txtKilos = new JTextField();
		txtKilos.setBounds(141, 100, 86, 20);
		contentPane.add(txtKilos);
		txtKilos.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Peso (kilos)");
		lblNewLabel_1.setBounds(34, 103, 89, 14);
		contentPane.add(lblNewLabel_1);

		/**
		 * Mediante el botón Calc IMC, se calculará el IMC teniendo como atributos la
		 * altura en metros y los kilos como peso. Para calcular el IMC se divide el
		 * peso entre (altura*altura).
		 */
		JButton calcularIMC = new JButton("Calc IMC");
		calcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Mediante DecimalFormat le damos un formato al String para reducir el número
				 * de decimales sin redondear.
				 */
				DecimalFormat f1 = new DecimalFormat("#.00");
				double altura = Double.parseDouble(txtAltura.getText());
				double peso = Double.parseDouble(txtKilos.getText());
				altura = altura * altura;
				double imc = peso / altura;
				// Se utiliza la función format del DecimalFormat y como parámetro el imc.
				txtIMC.setText(f1.format(imc));
			}
		});
		calcularIMC.setBounds(34, 130, 89, 23);
		contentPane.add(calcularIMC);

		txtIMC = new JTextField();
		txtIMC.setEditable(false);
		txtIMC.setBounds(141, 131, 86, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(237, 134, 46, 14);
		contentPane.add(lblNewLabel_2);
	}

}

  ```
 </details>
