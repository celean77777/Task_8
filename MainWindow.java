import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Message");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 800, 600);
        setLayout(null);

        Label label1 = new Label("Enter your massage");
        label1.setBounds(20, 20, 150, 40);
        add(label1);
        Label label2 = new Label("Received message");
        label2.setBounds(400, 20, 150, 40);
        add(label2);

        JTextField fieldForMessage = new JTextField();
        fieldForMessage.setBounds(20, 60, 200, 40);
        add(fieldForMessage);

        JTextField fieldForReceiveMessage = new JTextField();
        fieldForReceiveMessage.setBounds(400, 60, 200, 40);
        add(fieldForReceiveMessage);

        JButton button = new JButton("Send message");
        button.setBounds(20, 120, 120, 40);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fieldForReceiveMessage.setText(fieldForMessage.getText());
            }
        });

        setVisible(true);
    }

}
