import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.*;

public class TableWithCombobox extends JFrame{
	//This Program is written By Mohd Umar (Master-Tech271)
	//constructor
	public TableWithCombobox() {
		super("Table with Jcombobox");
		//our table model
		DefaultTableModel d = new DefaultTableModel();
		
		//table data
		d.setDataVector(new Object[][] {
			{"1", "First", "First Part"},
			{"1", "First", "First Part"},
			{"1", "First", "First Part"},
			{"1", "First", "First Part"},
			{"1", "First", "First Part"},
		},
		new Object[] {"S.NO", "Name", "Details"});
		
		//our table
		JTable table = new JTable(d);
		
		//combobox
		String [] Details = {"Hello", "Bye", "SHO", "WHo", "KHO"};
		JComboBox combo = new JComboBox<String>(Details);
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//selected item show when user select the item on combobox
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
			
		});
		//combo coloumn in table
		TableColumn col = table.getColumnModel().getColumn(2);
		col.setCellEditor(new DefaultCellEditor(combo));
		//scroll pane
		JScrollPane pane = new JScrollPane(table);
		getContentPane().add(pane);
		setSize(400, 400);
	}
	public static void main(String[] args) {
		//create our class object
		TableWithCombobox obj = new TableWithCombobox();
		obj.setVisible(true);
	}

}

