import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Project extends JFrame {
    JLabel pic;
    Timer tm;
    int x = 0;
    String[] list = {
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/1.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/2.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/3.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/4.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/5.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/6.jpeg",
            "C:/Users/kfatm/Downloads/WhatsApp Unknown 2021-08-25 at 6.19.23 PM/7.jpeg"
    };

    public Project(){
        super("Image SlideShow");
        pic = new JLabel();
        pic.setBounds(40, 30, 700, 700);

        SetImageSize(6);
        tm = new Timer(500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0;
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }


    public static void main(String[] args){
        new Project();
    }
}