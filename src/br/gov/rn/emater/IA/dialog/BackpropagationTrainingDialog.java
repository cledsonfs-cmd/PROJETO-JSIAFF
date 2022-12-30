/*
 * LmsTrainingDialog.java
 *
 * Created on December 24, 2008, 1:14 AM
 */

package br.gov.rn.emater.IA.dialog;

import org.jdesktop.application.Action;
import br.gov.rn.emater.IA.NeuronsApplicationView;
import br.gov.rn.emater.IA.NeuralNetworkTraining;
import br.gov.rn.emater.IA.errorgraph.GraphFrame;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.nnet.learning.DynamicBackPropagation;
import org.neuroph.nnet.learning.MomentumBackpropagation;

/**
 * 
 * @author Zoran Sevarac <sevarac@gmail.com>
 */
public class BackpropagationTrainingDialog extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;
    NeuronsApplicationView mainFrame;
	
	NeuralNetworkTraining controller;

	/** Creates new form LmsTrainingDialog */
	public BackpropagationTrainingDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public BackpropagationTrainingDialog(java.awt.Frame parent, NeuronsApplicationView mainFrame, boolean modal,
			NeuralNetworkTraining controller) {
		super(parent, modal);
		this.controller = controller;
                this.mainFrame=mainFrame;
		initComponents();
		
//		if (this.controller.getNetwork().getLearningRule() instanceof MomentumBackpropagation) {
//			momentumtField.setEnabled(true);
//		}
	}



	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonPanel = new javax.swing.JPanel();
        trainButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        maxErrLabel = new javax.swing.JLabel();
        maxErrorField = new javax.swing.JTextField();
        maxIterationsField = new javax.swing.JTextField();
        limitIterationsCheckkBox = new javax.swing.JCheckBox();
        minErrorChangeField = new javax.swing.JTextField();
        minErrorChangeIterationsField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        minErrorChangeCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        learningRateField = new javax.swing.JTextField();
        dynamicLearningRateCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        minDLRField = new javax.swing.JTextField();
        maxDLRField = new javax.swing.JTextField();
        changeRateDLRField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dynamicMomentumCheckBox = new javax.swing.JCheckBox();
        momentumtField = new javax.swing.JTextField();
        minMomentumField = new javax.swing.JTextField();
        maxMomentumField = new javax.swing.JTextField();
        changeRateMomentumField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        graphCheckBox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(br.gov.rn.emater.IA.NeuronsApplication.class).getContext().getResourceMap(BackpropagationTrainingDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModal(true);
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        buttonPanel.setName("buttonPanel"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(br.gov.rn.emater.IA.NeuronsApplication.class).getContext().getActionMap(BackpropagationTrainingDialog.class, this);
        trainButton.setAction(actionMap.get("train")); // NOI18N
        trainButton.setText(resourceMap.getString("trainButton.text")); // NOI18N
        trainButton.setName("trainButton"); // NOI18N
        buttonPanel.add(trainButton);

        closeButton.setAction(actionMap.get("close")); // NOI18N
        closeButton.setText(resourceMap.getString("closeButton.text")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N
        buttonPanel.add(closeButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(buttonPanel, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        maxErrLabel.setText(resourceMap.getString("maxErrLabel.text")); // NOI18N
        maxErrLabel.setName("maxErrLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(maxErrLabel, gridBagConstraints);

        maxErrorField.setColumns(8);
        maxErrorField.setText(resourceMap.getString("maxErrorField.text")); // NOI18N
        maxErrorField.setName("maxErrorField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(maxErrorField, gridBagConstraints);

        maxIterationsField.setColumns(8);
        maxIterationsField.setEnabled(false);
        maxIterationsField.setName("maxIterationsField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(maxIterationsField, gridBagConstraints);

        limitIterationsCheckkBox.setText(resourceMap.getString("limitIterationsCheckkBox.text")); // NOI18N
        limitIterationsCheckkBox.setName("limitIterationsCheckkBox"); // NOI18N
        limitIterationsCheckkBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                limitIterationsCheckkBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(limitIterationsCheckkBox, gridBagConstraints);

        minErrorChangeField.setColumns(8);
        minErrorChangeField.setText(resourceMap.getString("minErrorChangeField.text")); // NOI18N
        minErrorChangeField.setEnabled(false);
        minErrorChangeField.setName("minErrorChangeField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(minErrorChangeField, gridBagConstraints);

        minErrorChangeIterationsField.setColumns(8);
        minErrorChangeIterationsField.setText(resourceMap.getString("minErrorChangeIterationsField.text")); // NOI18N
        minErrorChangeIterationsField.setEnabled(false);
        minErrorChangeIterationsField.setName("minErrorChangeIterationsField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(minErrorChangeIterationsField, gridBagConstraints);

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        minErrorChangeCheckBox.setText(resourceMap.getString("minErrorChangeCheckBox.text")); // NOI18N
        minErrorChangeCheckBox.setName("minErrorChangeCheckBox"); // NOI18N
        minErrorChangeCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minErrorChangeCheckBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(minErrorChangeCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel2.border.title"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        learningRateField.setColumns(8);
        learningRateField.setText(resourceMap.getString("learningRateField.text")); // NOI18N
        learningRateField.setName("learningRateField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(learningRateField, gridBagConstraints);

        dynamicLearningRateCheckBox.setText(resourceMap.getString("dynamicLearningRateCheckBox.text")); // NOI18N
        dynamicLearningRateCheckBox.setName("dynamicLearningRateCheckBox"); // NOI18N
        dynamicLearningRateCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dynamicLearningRateCheckBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(dynamicLearningRateCheckBox, gridBagConstraints);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        minDLRField.setColumns(8);
        minDLRField.setText(resourceMap.getString("minDLRField.text")); // NOI18N
        minDLRField.setEnabled(false);
        minDLRField.setName("minDLRField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(minDLRField, gridBagConstraints);

        maxDLRField.setColumns(8);
        maxDLRField.setText(resourceMap.getString("maxDLRField.text")); // NOI18N
        maxDLRField.setEnabled(false);
        maxDLRField.setName("maxDLRField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(maxDLRField, gridBagConstraints);

        changeRateDLRField.setColumns(8);
        changeRateDLRField.setText(resourceMap.getString("changeRateDLRField.text")); // NOI18N
        changeRateDLRField.setEnabled(false);
        changeRateDLRField.setName("changeRateDLRField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(changeRateDLRField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel3.border.title"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel4, gridBagConstraints);

        dynamicMomentumCheckBox.setText(resourceMap.getString("dynamicMomentumCheckBox.text")); // NOI18N
        dynamicMomentumCheckBox.setName("dynamicMomentumCheckBox"); // NOI18N
        dynamicMomentumCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dynamicMomentumCheckBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(dynamicMomentumCheckBox, gridBagConstraints);

        momentumtField.setColumns(8);
        momentumtField.setText(resourceMap.getString("momentumtField.text")); // NOI18N
        momentumtField.setName("momentumtField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(momentumtField, gridBagConstraints);

        minMomentumField.setColumns(8);
        minMomentumField.setText(resourceMap.getString("minMomentumField.text")); // NOI18N
        minMomentumField.setEnabled(false);
        minMomentumField.setName("minMomentumField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(minMomentumField, gridBagConstraints);

        maxMomentumField.setColumns(8);
        maxMomentumField.setText(resourceMap.getString("maxMomentumField.text")); // NOI18N
        maxMomentumField.setEnabled(false);
        maxMomentumField.setName("maxMomentumField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(maxMomentumField, gridBagConstraints);

        changeRateMomentumField.setColumns(8);
        changeRateMomentumField.setText(resourceMap.getString("changeRateMomentumField.text")); // NOI18N
        changeRateMomentumField.setEnabled(false);
        changeRateMomentumField.setName("changeRateMomentumField"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(changeRateMomentumField, gridBagConstraints);

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel9, gridBagConstraints);

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel8, gridBagConstraints);

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel4.border.title"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        graphCheckBox.setSelected(true);
        graphCheckBox.setText(resourceMap.getString("graphCheckBox.text")); // NOI18N
        graphCheckBox.setName("graphCheckBox"); // NOI18N

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphCheckBox)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(graphCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void dynamicLearningRateCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dynamicLearningRateCheckBoxItemStateChanged
         	
                if (dynamicLearningRateCheckBox.isSelected()) {
                   minDLRField.setEnabled(true);
                   maxDLRField.setEnabled(true);
                   changeRateDLRField.setEnabled(true);
                } else {
                   minDLRField.setEnabled(false);
                   maxDLRField.setEnabled(false);
                   changeRateDLRField.setEnabled(false);
                }
        }//GEN-LAST:event_dynamicLearningRateCheckBoxItemStateChanged

        private void dynamicMomentumCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dynamicMomentumCheckBoxItemStateChanged
                if (dynamicMomentumCheckBox.isSelected()) {
                   minMomentumField.setEnabled(true);
                   maxMomentumField.setEnabled(true);
                   changeRateMomentumField.setEnabled(true);
                } else {
                   minMomentumField.setEnabled(false);
                   maxMomentumField.setEnabled(false);
                   changeRateMomentumField.setEnabled(false);
                }
        }//GEN-LAST:event_dynamicMomentumCheckBoxItemStateChanged

        private void minErrorChangeCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minErrorChangeCheckBoxItemStateChanged
		if (this.minErrorChangeCheckBox.isSelected()) {
                    this.minErrorChangeField.setEnabled(true);
                    this.minErrorChangeIterationsField.setEnabled(true);
                } else {
                    this.minErrorChangeField.setEnabled(false);
                    this.minErrorChangeIterationsField.setEnabled(false);
                }
        }//GEN-LAST:event_minErrorChangeCheckBoxItemStateChanged

	private void limitIterationsCheckkBoxItemStateChanged(
			java.awt.event.ItemEvent evt) {// GEN-FIRST:event_limitIterationsCheckkBoxItemStateChanged
		if (this.limitIterationsCheckkBox.isSelected())
                    this.maxIterationsField.setEnabled(true);
		else
                    this.maxIterationsField.setEnabled(false);
	}// GEN-LAST:event_limitIterationsCheckkBoxItemStateChanged

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				BackpropagationTrainingDialog dialog = new BackpropagationTrainingDialog(
						new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	@Action
	public void close() {
		this.dispose();
	}

	@Action
	public void train() {
		String maxErrorStr = maxErrorField.getText().toString();
		String maxIterationsStr = maxIterationsField.getText().toString();

                String learningRateStr = learningRateField.getText().toString();

		String momentumStr = momentumtField.getText().toString();

		Double learningRate = new Double(learningRateStr);
		Double maxError = new Double(maxErrorStr);
		Integer maxIterations = new Integer(0);
		Double momentum = new Double(momentumStr);

		if (limitIterationsCheckkBox.isSelected())
			maxIterations = new Integer(maxIterationsStr);

		controller.setLmsParams(learningRate, maxError, maxIterations);

		BackPropagation learningRule = (BackPropagation) this.controller.getNetwork().getLearningRule();

                if ( minErrorChangeCheckBox.isSelected()) {
                    learningRule.setMinErrorChange(new Double(minErrorChangeField.getText().trim()));
                    learningRule.setMinErrorChangeIterationsLimit(new Integer(minErrorChangeIterationsField.getText().trim()));
                }

		if (learningRule instanceof MomentumBackpropagation) {
			((MomentumBackpropagation)learningRule).setMomentum(momentum);
		}

		if (learningRule instanceof DynamicBackPropagation) {
                    DynamicBackPropagation dbp = (DynamicBackPropagation)learningRule;

                    dbp.setMomentum(momentum);

                    if (dynamicLearningRateCheckBox.isSelected()) {
                        Double minDLR = new Double(minDLRField.getText().trim());
                        Double maxDLR =new Double(maxDLRField.getText().trim());
                        Double changeRateDLR = new Double(changeRateDLRField.getText().trim());

                        dbp.setUseDynamicLearningRate(true);
                        dbp.setMinLearningRate(minDLR);
                        dbp.setMaxLearningRate(maxDLR);
                        dbp.setLearningRateChange(changeRateDLR);                        
                    } else {
                        dbp.setUseDynamicLearningRate(false);
                    }

                    if (dynamicMomentumCheckBox.isSelected()) {
                        Double minMomentum =new Double(minMomentumField.getText().trim());
                        Double maxMomentum = new Double(maxMomentumField.getText().trim());
                        Double changeRateMomentum = new Double(changeRateMomentumField.getText().trim());

                        dbp.setUseDynamicMomentum(true);
                        dbp.setMinMomentum(minMomentum);
                        dbp.setMaxMomentum(maxMomentum);
                        dbp.setMomentumChange(changeRateMomentum);                        
                    } else {
                       dbp.setUseDynamicMomentum(false);
                    }

		}
		
                if (graphCheckBox.isSelected()) {
                    GraphFrame graphFrame = mainFrame.openErrorGraphFrame();
                    graphFrame.observe(learningRule);
                }

                SupervisedTrainingMonitorFrame monitorFrame = mainFrame.openMonitorFrame(this.controller);
                learningRule.addObserver(monitorFrame);

		controller.train();

		this.dispose();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField changeRateDLRField;
    private javax.swing.JTextField changeRateMomentumField;
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox dynamicLearningRateCheckBox;
    private javax.swing.JCheckBox dynamicMomentumCheckBox;
    private javax.swing.JCheckBox graphCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField learningRateField;
    private javax.swing.JCheckBox limitIterationsCheckkBox;
    private javax.swing.JTextField maxDLRField;
    private javax.swing.JLabel maxErrLabel;
    private javax.swing.JTextField maxErrorField;
    private javax.swing.JTextField maxIterationsField;
    private javax.swing.JTextField maxMomentumField;
    private javax.swing.JTextField minDLRField;
    private javax.swing.JCheckBox minErrorChangeCheckBox;
    private javax.swing.JTextField minErrorChangeField;
    private javax.swing.JTextField minErrorChangeIterationsField;
    private javax.swing.JTextField minMomentumField;
    private javax.swing.JTextField momentumtField;
    private javax.swing.JButton trainButton;
    // End of variables declaration//GEN-END:variables

}
