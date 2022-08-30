package globales;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


public class WordWrapRenderer extends JTextArea implements TableCellRenderer{
    
    public WordWrapRenderer(){
        
        setLineWrap(true);
        setWrapStyleWord(true);
        setFont(new java.awt.Font("Arial", 0, 12));  
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
        setText( (value == null) ? "" : value.toString());
        
        setSize(table.getColumnModel().getColumn(column).getWidth(), table.getRowHeight(row));

        int preferredHeight = getPreferredSize().height + 10;

        if (table.getRowHeight(row) != preferredHeight){
            
            table.setRowHeight(row, preferredHeight);
        }
        return this;
    }

    public static void createAndShowGUI(){
        
        JTable table = new JTable(2, 3);
        table.setValueAt("A", 0, 0);
        table.setValueAt("This text should wrap by default", 0, 1);
        table.getColumnModel().getColumn(1).setCellRenderer( new WordWrapRenderer());
        JFrame frame = new JFrame("TableBasic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new JScrollPane( table ) );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
}
