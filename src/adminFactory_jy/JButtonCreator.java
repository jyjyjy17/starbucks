package adminFactory_jy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;

public static class JButtonCreator extends Jcreator{

	@Override
	public JComponent create(String text, String font, int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JComponent createWithIcon(String text, String iconText, int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JComponent createWithHorizontal(String text, String font, int x, int y, int w, int h, int fontsize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JComponent createWithAlignment(String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.RIGHT_ALIGNMENT);
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0,121,51));
		return null;
	}

	

}
