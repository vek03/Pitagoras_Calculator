package ex3;

//importa todas as classes contidas em swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */

//sua classe herda da classe JFrame que contém todas as funções de interface
public class Ex3 extends JFrame
{
    //declarando objetos de rotulo
    JLabel rotulo1,rotulo2, exibir, titulo1, titulo2;
    //declarando objetos de caixa de texto
    JTextField texto1,texto2;
    //declarando objeto botão de finalizar programa
    JButton calcular, limpar;
    
    //método construtor contendo todos os atributos da janela de interface
    public Ex3()
    {
        //função que chama a super classe do JFrame
        super("Teorema de Pitágoras");
        
        //Container é uma classe que contem todos os obejtos
        Container tela = getContentPane();
        
        //declara o layout como nulo para poder modificá-lo
        setLayout(null);
        
        //instancia de objetos com os valores predefinidos
        rotulo1 = new JLabel("Valor do cateto a: ");
        rotulo2 = new JLabel("Valor do cateto b: ");
        exibir = new JLabel("");
        titulo1 = new JLabel("Teorema de Pitágoras");
        titulo2 = new JLabel("H² = Ca² + Cb²");
        
        //instancia de objetos de caixa de texto com tamanho predefinido
        texto1 = new JTextField(15);
        texto2 = new JTextField(15);
        
        //instancia do objeto botão para sair 
        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");
        
        //lugar da janela onde será impresso: margem direita, altura(de cima para baixo), tamanho em caracteres, grossura.  
        //legenda local
        titulo1.setBounds(55,20,200,20);
        titulo2.setBounds(100,35,100,20);
        rotulo1.setBounds(20,70,200,20);
        rotulo2.setBounds(20,100,200,20);
        
        //resultado local
        exibir.setBounds(20,150,500,20);
        
        //caixa de texto local
        texto1.setBounds(125,70,70,20);
        texto2.setBounds(125,100,70,20);
       
        //botões local
        calcular.setBounds(20,210,100,20);
        limpar.setBounds(150,210,100,20);
        
        titulo1.setFont(new Font("Arial", Font.BOLD, 17));
        titulo2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        
        //método para limpar caixas de texto
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    exibir.setVisible(false);
                    texto1.setText(null);
                    texto2.setText(null);
                    texto1.requestFocus();//passa o foco para está caixa de texto
                }
            }
        );
        
        //método para calculkar a baskara
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double ca, cb, h;
                    ca = Double.parseDouble(texto1.getText());
                    cb = Double.parseDouble(texto2.getText());
                    h = Math.sqrt(ca*ca + cb*cb);
                    exibir.setVisible(true);
                    exibir.setText("Valor da Hipotenusa: " + h);
                }
            }
        );
          
        
        //visibilidade do resultado apenas quando calculo for efetuado
        exibir.setVisible(false);
        
        //exibição de tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(titulo1);
        tela.add(titulo2);
        
        tela.add(texto1);
        tela.add(texto2);
        
        tela.add(calcular);
        tela.add(limpar);
        
        //declarando o tamanho em que a janela deve abrir
        setSize(300, 300);
        
        //visibilidade da janela
        setVisible(true);
        
        //define o local do monitor em que será aberta a janela
        setLocationRelativeTo(null);
    }
    
    //método main
    public static void main(String[] args) 
    {
        //intância de objeto(classe com os atributos)
        Ex3 app = new Ex3();
        //chamando a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
 