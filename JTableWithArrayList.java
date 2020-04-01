import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//This program is written by Mohd Umar (Master-Tech271)
public class JTableWithArrayList extends JFrame {
  JTable  table = new JTable();
  DefaultTableModel model = new DefaultTableModel();
  JScrollPane scroll;
  String headers[] = { "col1", "col2" };

  public JTableWithArrayList() {    
    model.setColumnIdentifiers(headers);   
    table.setModel(model);
    scroll = new JScrollPane(table);

    insert();

    add(scroll, BorderLayout.CENTER);
    setSize(300, 300);
    setVisible(true);
  }

  public void insert() {
    ArrayList<String> ar = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      ar.add("Hello brother "+i);
    }

    for (int i = 0; i < (ar.size() / 2); i++) {
      model.addRow(new Object[] { String.valueOf(ar.get(i)),
          String.valueOf(ar.get(i)) });
    }
  }

  public static void main(String[] args) {
    new JTableWithArrayList();
  }
}
