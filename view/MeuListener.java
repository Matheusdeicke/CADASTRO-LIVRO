import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

public class MeuListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //Handler (código que vai ser executado quando o evento ocorrer)
        JOptionPane.showMessageDialog(null, "Livro salvo com sucesso");
    }
    
}
