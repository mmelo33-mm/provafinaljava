package br.com.jkalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//extends é herança
public class JCadastroJogador extends JFrame{
    //Construtor inicializa os componentes do formulário
    public JCadastroJogador(){
       //Título da Janela 
       setTitle("Faça parte do JKalango!");
       //Garante que a aplicação não seja finalizada
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       //tamanho
       setSize(400,450);
       //posição ao centro
       setLocationRelativeTo(null);
       setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
       JLabel lblNome = new JLabel("Nome:");
       JTextField txtNome = new JTextField(20);
       //'JPasswordField
       add(lblNome);
       add(txtNome);


       
        //criação do botão cadastrar
        JButton cadastrarButton = new JButton("Cadastrar"); //apos criar o botão, lembrar de adicionar como na linha 37

        add(cadastrarButton); //comando para o botão aparecer


        
        cadastrarButton.addActionListener(new ActionListener() {
          @Override  
          public void actionPerformed(ActionEvent e){
            String nome = txtNome.getText();//pega o que o usuario digitou na caixinha de texto

            if (nome == null || nome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar, preencha todos os campos", "Erro!", JOptionPane.ERROR_MESSAGE);
            } else{
              if(nome.contains("java")){
                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro! O nome precisa conter 'java'", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            }
          }
        });


        


       setVisible(true);
    }
    
}
