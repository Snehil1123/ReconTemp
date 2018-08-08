import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class InsertToExcelDatabase extends JFrame {
	JButton ADD;
	JPanel panel;
	JFrame f;
	
	InsertToExcelDatabase(){
		JLabel label1,label2;
		final JTextField text1,text2;
		label1 = new JLabel();
		label1.setText("Name:");
		text1 = new JTextField(20);
		
		label2 = new JLabel();
		label2.setText("Address:");
		text2 = new JTextField(20);
		
		ADD=new JButton("Insert");
		ADD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String v1=text1.getText();
				String v2=text2.getText();
				try {
					Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
					Connection c = DriverManager.getConnection( "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=C:/database.xls; readOnly= false");
					Statement stmnt = c.createStatement();
					String insertSql = "Insert into [Excel Sheet$] (Name,Address) values ('"+v1+"', '"+v2+"')";
					int insertSuccess = stmnt.executeUpdate(insertSql); 
				}
				catch(Exception ex){}
			}
		});
		f=new JFrame();
		panel=new JPanel(new GridLayout(3,2));
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(ADD);
		f.add(panel,BorderLayout.CENTER);
		f.setTitle("FORM");
		f.setVisible(true);
		f.pack();
	}
	public static void main(String[]args){
		InsertToExcelDatabase ff=new InsertToExcelDatabase();
	}
}