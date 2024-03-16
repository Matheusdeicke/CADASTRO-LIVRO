import javax.swing.*;
import java.awt.*;

public class Teste extends JFrame{

    private JButton btnOk, btnCancelar;
    private JTextField txtId, txtTitulo, txtAutor, txtCat, txtData;
    private JLabel CompId, CompTitulo, CompAutor, CompCat, CompData;
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();

    
    public Teste(){
        super("Cadastro livro"); // Nome

        Container c = getContentPane();

        setSize(400, 300); // Define o tamanho da janela
        c.setLayout(new GridLayout(2, 1)); // Define o layout do container básico
        p1.setLayout(new GridLayout(6, 2)); // Define o layout dos Panels
        p2.setLayout(new FlowLayout(FlowLayout.TRAILING));

        // COMPONENTES
        CompId = new JLabel("ID:");
        txtId = new JTextField(5);
        
        CompTitulo = new JLabel("Titulo:");
        txtTitulo = new JTextField(15);

        CompAutor = new JLabel("Autor:");
        txtAutor = new JTextField(15);

        CompCat = new JLabel("Categoria:");
        txtCat = new JTextField(15);

        CompData = new JLabel("Data de Lcto:");
        txtData = new JTextField(10);

        btnOk = new JButton("OK");
        btnCancelar = new JButton("Cancelar");


        p1.add(CompId);
        p1.add(CompTitulo);
        p1.add(CompAutor);
        p1.add(CompCat);
        p1.add(CompData);

        p2.add(txtId);
        p2.add(txtTitulo);
        p2.add(txtAutor);
        p2.add(txtCat);
        p2.add(txtData);
        p2.add(btnOk);
        p2.add(btnCancelar);

        c.add(p1); 
        c.add(p2);



        // JPanel pnl = new JPanel();
        // pnl.add(new JLabel("ID:"));
        // pnl.add(new JLabel("Titulo:"));
        // pnl.add(new JLabel("Autor:"));
        // pnl.add(new JLabel("Categoria:"));
        // pnl.add(new JLabel("Data de Lcto:"));
        
        // this.setContentPane(pnl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
