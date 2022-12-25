import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//blob demo
//create table animal_img(name varchar2(20),photo Blob);
//create table product_img(pname varchar2(30),photo BLOB);

public class BLobDemo extends JFrame {

	JButton b1, b2;
	JLabel l1;
	Connection con;
	String url;

	public BLobDemo() throws ClassNotFoundException, SQLException {
		b1 = new JButton("Insert");
		b2 = new JButton("Display");
		l1 = new JLabel();
		add(b1);
		add(b2);
		add(l1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000, 1000);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		con = DriverManager.getConnection(url, "hr", "hr");
		// System.out.println("connected successfully .... ");

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps;
				try {
					ps = con.prepareStatement("insert into animal_img values(?,?)");
					ps.setString(1, "ele");
					FileInputStream fin = new FileInputStream("c:\\ele.jpg");
					ps.setBinaryStream(2, fin, fin.available());
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(BLobDemo.this, i + " record inserted");

				} catch (Exception e1) {

					e1.printStackTrace();

				}

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					ResultSet rs = stmt.executeQuery("select name,photo from animal_img");

					// rs.last();

					rs.absolute(2);

					Blob b1 = rs.getBlob(2);
					byte barr[] = b1.getBytes(1, (int) b1.length());

					l1.setIcon(new ImageIcon(barr));

				} catch (Exception e1) {

					e1.printStackTrace();

				}

			}
		});

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BLobDemo d = new BLobDemo();
		d.setVisible(true);
		d.setSize(400, 400);
	}

}
