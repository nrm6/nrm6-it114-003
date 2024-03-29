package Chatroom;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class User extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private JEditorPane nameField;

    public User(String name, String wrapper) {
    	this.name = name;
    	nameField = new JEditorPane();
     	nameField.setContentType("text/html");
     	//nameField.setText("<b>" + name + "</b>");
     	nameField.setText(String.format(wrapper, name));
     	nameField.setEditable(false);
     	this.add(nameField);
    }

    public String getName() {
	return name;
    }
    
    public String getName(String wrapper) {
    	return String.format(wrapper, name);
    }
    
	public void setName(String name, String wrapper) {
		//this.name = name;
		nameField.setText(String.format(wrapper, name));
	}
}