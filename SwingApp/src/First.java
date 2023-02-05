import javax.swing.*; // GUI based Java
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;


public class First extends JFrame implements ActionListener {

    static JTable tbl1;
    static DefaultTableModel model;
    static JFrame fra;

    static JScrollPane scroll;

    static JTextField txt1, txt2;

    static JButton but1, but2;
    static JComboBox tblcb;

    static Connection con;

    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) dim.getWidth();
        int height = (int) dim.getHeight();

        First fra = new First();
        tbl1 = new JTable();
        model = new DefaultTableModel();
        scroll = new JScrollPane();

        String[] columns = {"state_id", "state_name"};

        model.setColumnIdentifiers(columns);
        tbl1.setModel(model);

        /*tblcb = new JComboBox();
        tblcb.addItem("products");
        tblcb.addItem("city");*/

        txt1 = new JTextField();
        but1 = new JButton("ADD");
        but2 = new JButton("Clear");

        but1.setBackground(Color.blue);
        but1.setForeground(Color.white);
        but2.setBackground(Color.blue);
        but2.setForeground(Color.white);

        but1.addActionListener(fra);
        but2.addActionListener(fra);

        Container c = fra.getContentPane();
        c.setBackground(Color.cyan);

        fra.setLayout(null);
        JLabel city_lbl = new JLabel("City");
        city_lbl.setBounds(50, 100, 50, 50);
        txt1.setBounds(100, 100, 100, 50);
        but1.setBounds(100, 175, 70, 30);
        but2.setBounds(100, 175, 70, 30);
        scroll.setBounds(300, 100, 400, 200);
        tblcb.setBounds(400, 300, 100, 50);
        fra.add(tblcb);

        fra.add(scroll);
        fra.add(city_lbl);
        fra.add(txt1);
        fra.add(but1);
        fra.add(but2);
        fra.setSize(width, height);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setVisible(true);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Kit_college", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM department");
            String state_id, state_name;
            while (rs.next()) {
                state_id = rs.getString(1);
                state_name = rs.getString(2);
                model.addRow(new Object[]{state_id, state_name});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}

    @Override
    public void actionPerformed(ActionEvent e) {
            String city = txt1.getText();
            String state_id,state_name;
            if (e.getSource() == but1) {
                try {
                    stmt.execute("INSERT INTO state VALUES(6,'" + city + "')");
                    JOptionPane.showMessageDialog(null, "Saved");
                    rs = stmt.executeQuery("SELECT * FROM state");
                    while (rs.next()) {
                        state_id = rs.getString(1);
                        state_name = rs.getString(2);
                        model.addRow(new Object[]{state_id, state_name});
                    }
                } catch (Exception f) {
                    f.printStackTrace();
                }
            } else if (e.getSource() == but2){
                txt1.setText("");
                }
        }

}
