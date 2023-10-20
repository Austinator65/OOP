
package EventsAndCallbacks;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GFGTop extends Frame implements ActionListener {

    TextField textField;

    GFGTop() {
        // Component Creation
        textField = new TextField();

        // setBounds method is used to provide
        // position and size of the component
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(50, 40, 40, 15);

        // Registering component with listener
        // this refers to current instance
        button.addActionListener(this);

        // add Components
        add(textField);
        add(button);

        // set visibility
        setVisible(true);
    }

    // implementing method of actionListener
    public void actionPerformed(ActionEvent e) {
        // Setting text to field
        textField.setText("You clicked");
        textField.setBackground(getBackground());
    }

    public static void main(String[] args) {
        new GFGTop();
    }
}
