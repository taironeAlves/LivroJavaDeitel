package capitulo3;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog("Digit primary value:");
        Integer cValue1 = Integer.parseInt(value1);

        String value2 = JOptionPane.showInputDialog("Digit second value:");
        Integer cValue2 = Integer.parseInt(value2);

        String message = String.format("The value from sum %s more %s is %s", cValue1, cValue2, (cValue1 + cValue2));

        JOptionPane.showMessageDialog(null,message);
    } // end method main
}