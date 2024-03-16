import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CadLivro extends JFrame {

    private JButton btnOk, btnCancelar;
    private JTextField txtId, txtTitulo, txtAutor, txtCat, txtData;
    private JLabel CompId, CompTitulo, CompAutor, CompCat, CompData;
    private JPanel p1 = new JPanel();

    public CadLivro() {
        super("Cadastro Livro");

        Container c = getContentPane();

        setSize(400, 300); // Tamanho da Janela
        c.setLayout(new FlowLayout()); // Define o layout do container básico
        p1.setLayout(new GridLayout(6, 2)); // Define o layout dos Panels

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


        // SETA TODOS OS JLABEL PARA A DIREITA
        CompId.setHorizontalAlignment(SwingConstants.RIGHT);
        CompTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
        CompAutor.setHorizontalAlignment(SwingConstants.RIGHT);
        CompCat.setHorizontalAlignment(SwingConstants.RIGHT);
        CompData.setHorizontalAlignment(SwingConstants.RIGHT);

        // SETA UMA FONTE DIFERENTE
        Font fontePersonalizada = new Font("Times New Roman", Font.BOLD, 14);

        CompId.setFont(fontePersonalizada);
        CompTitulo.setFont(fontePersonalizada);
        CompAutor.setFont(fontePersonalizada);
        CompCat.setFont(fontePersonalizada);
        CompData.setFont(fontePersonalizada);

        btnOk.setMnemonic(KeyEvent.VK_O); // Letra O - ALT + O
        btnCancelar.setMnemonic(KeyEvent.VK_C); // Letra C - ALT + C

        // Adiciona os componentes no P1
        p1.add(CompId);
        p1.add(txtId);
        p1.add(CompTitulo);
        p1.add(txtTitulo);
        p1.add(CompAutor);
        p1.add(txtAutor);
        p1.add(CompCat);
        p1.add(txtCat);
        p1.add(CompData);
        p1.add(txtData);
        p1.add(btnOk);
        p1.add(btnCancelar);
        c.add(p1);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}