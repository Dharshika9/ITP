/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import static dbConnect.dbcon.connect;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ComboExample {
	ComboExample() {
		JFrame f = new JFrame();
		f.getContentPane().setLayout(null);
		final JComboBox combo = new JComboBox();
		final JTextField text = new JTextField();
		text.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
		        String ch = text.getText();
			combo.removeAllItems();
			if (ch.equals("")) {
			combo.setVisible(false);
			} else {
                        System.out.println(ch);
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = connect();	
			Statement st = connection.createStatement();
                        ResultSet rs = st
			.executeQuery("Select name from rawmaterials where name like '"+ ch + "%'");
                        while (rs.next()) {
			String name = rs.getString("name");
			if (name.equals("")) {
			combo.addItem("");
			combo.setVisible(false);
			} else {
			combo.addItem(rs.getString("name"));
			System.out.println(rs.getString("name"));
			combo.setVisible(true);
			}
			}
			} catch (Exception ex) {
         		}
			}
	             	}

			public void keyTyped(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
			}
		});
		text.setBounds(20, 20, 150, 20);
		combo.setBounds(20, 50, 150, 20);
		f.add(text);
		f.add(combo);

		f.setSize(400, 200);
		f.setVisible(true);
		combo.setVisible(false);

	}

	public static void main(String[] args) {
		ComboExample c = new ComboExample();
	}
}
