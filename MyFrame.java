import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
    Gamepanel panel=new Gamepanel();
    this.add(panel);
    this.setTitle("Snake");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    }
}
