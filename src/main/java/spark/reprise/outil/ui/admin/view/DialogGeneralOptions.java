package spark.reprise.outil.ui.admin.view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JDialog;

import spark.reprise.outil.ui.admin.controller.DialogGeneralOptionsController;

/**
 * Fenetre des options générales
 */
public class DialogGeneralOptions extends JDialog {

    private static final long serialVersionUID = 1L;
    private final DialogGeneralOptionsController controller;
    
    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JCheckBox jCheckBox1;

    
    private class ActnOk extends AbstractAction{
	private static final long serialVersionUID = -2551078572811820430L;

	ActnOk(){
	    this.putValue(NAME, "OK");
	}

	/**{@inheritDoc}*/
	@Override
	public void actionPerformed(ActionEvent e) {
	    setLogExportStatus();
	}
    }
    private class ActnCancel extends AbstractAction{
	private static final long serialVersionUID = 8418816007160731744L;

	ActnCancel(){
	    this.putValue(NAME, "Annuler");
	}

	/**{@inheritDoc}*/
	@Override
	public void actionPerformed(ActionEvent e) {
	    dispose();
	}
    }

    /** Creates new form NewJFrame. 
     * @param controller le controlleur de la fenetre*/
    public DialogGeneralOptions(DialogGeneralOptionsController controller) {
	this.controller=controller;
	initComponents();
	setTitle("Options générales");
	center();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     */
    private void initComponents() {

	createComponents();

	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	setResizable(false);

	setText();
	jButton1.setAction(new ActnOk());
	jButton2.setAction(new ActnCancel());
	
	createLayout();

	pack();
	setLocationRelativeTo(null);
    }

    private void setText() {
	jCheckBox1.setText
			("Activer la fonctionalité \"Exporter les logs\" " +
			"dans l'interface utilisateur");
	jButton1.setText("jButton1");
	jButton2.setText("jButton2");
    }

    private void createLayout() {
	getContentPane().setLayout(new java.awt.GridBagLayout());
	java.awt.GridBagConstraints gridBagConstraints;
	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
	gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
	gridBagConstraints.ipadx = 15;
	gridBagConstraints.ipady = 8;
	getContentPane().add(jCheckBox1, gridBagConstraints);

	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
	getContentPane().add(jButton1, gridBagConstraints);

	
	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 3;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
	getContentPane().add(jButton2, gridBagConstraints);

	
	
	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 1.0;
	getContentPane().add(Box.createHorizontalGlue(), gridBagConstraints);

	
	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 2;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 1.0;
	getContentPane().add(Box.createHorizontalGlue(), gridBagConstraints);

	
	gridBagConstraints = new java.awt.GridBagConstraints();
	gridBagConstraints.gridx = 4;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 1.0;
	getContentPane().add(Box.createHorizontalGlue(), gridBagConstraints);
    }

    private void createComponents() {
	jCheckBox1 = new javax.swing.JCheckBox();
	jButton1 = new javax.swing.JButton();
	jButton2 = new javax.swing.JButton();
    }                        


   
    /**
     * Check ou pas la checkbox responsable de l'option LogExportStatus.
     * @param logExportStatus true s'il doit etre true
     */
    public void setLogExportStatus(boolean logExportStatus) {
	jCheckBox1.setSelected(logExportStatus);
    }

    /**
     * recentre la fenetre au mileu de l'ecran.
     */
    private  void center() {
	    setLocationRelativeTo(null);
	  }

    void setLogExportStatus() {
	controller.setLogExportStatus(jCheckBox1.isSelected());
	dispose();
    }
}
