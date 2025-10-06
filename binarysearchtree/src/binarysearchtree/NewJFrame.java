package binarysearchtree;

import java.util.Random;

class Student {

    private String name;
    private String code;
    private double gpa;

    Student(String N, String C, double G) {
        this.name = N;
        this.code = C;
        this.gpa = G;
    }

    String getName() {
        return name;
    }

    String getCode() {
        return code;
    }

    double getGpa() {
        return gpa;
    }

    public String toString() {
        return name + " " + code + " " + gpa;
    }
}

class Node {

    private Student data;
    private Node left, right;

    public Node(Student newData) {
        data = newData;
    }

    void setData(Student newD) {
        this.data = newD;
    }

    Student getData() {
        return this.data;
    }

    void setLeft(Node newL) {
        this.left = newL;
    }

    Node getLeft() {
        return this.left;
    }

    void setRight(Node newR) {
        this.right = newR;
    }

    Node getRight() {
        return this.right;
    }
}

class BinarySearchTree {

    private Node root;
    private String inorder;

    public void add(Student data) {
        root = addRecurive(root, data);
    }

    Node addRecurive(Node root, Student data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }
        // Otherwise, recur down the tree
        if (data.getCode().compareTo(root.getData().getCode()) < 0) {
            root.setLeft(addRecurive(root.getLeft(), data));
        } else if (data.getCode().compareTo(root.getData().getCode()) > 0) {
            root.setRight(addRecurive(root.getRight(), data));
        }
        // Return the (unchanged) node pointer
        return root;
    }

    // Method for in-order traversal
    public void inorder() {
        inorder = "";
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
//            System.out.print(root.getData().toString() + " ");
            inorder += root.getData().toString() + " ";
            inorderRec(root.getRight());
        }
    }

    public String getInorder() {
        return inorder;
    }
}

public class NewJFrame extends javax.swing.JFrame {

    public static Student[] std;
    public static BinarySearchTree bst;

    public static Student genStudent() {
        Random rd = new Random();
        String code = "" + rd.nextInt(90) + 10;
        String text1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String text2 = "abcdefghijklmnopqrstuvwxyz";
        String name = "" + text1.charAt(rd.nextInt(text1.length()));
        int n = rd.nextInt(5) + 3;
        for (int i = 0; i < n; ++i) {
            name += text2.charAt(rd.nextInt(text2.length() - 1));
        }
        name += " ";
        name += "" + text1.charAt(rd.nextInt(text1.length() - 1));
        for (int i = 0; i < n; ++i) {
            name += text2.charAt(rd.nextInt(text2.length() - 1));
        }
        name += " ";
        double gpa = rd.nextInt(4) + rd.nextInt(100 / 100);
        return new Student(code, name, gpa);
    }

    public NewJFrame() {
        initComponents();

        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < 5; ++i) {
            Student x = genStudent();
            System.out.println(x.toString());
            bst.add(x);
        }
        System.out.println("Inorder Traversal");
        bst.inorder();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BinarySearcgTree GUI 670710736");

        jButton1.setText("GenStudent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("showStudent");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("CreateBST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("InorderTraversal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setText("showInorder");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 458, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // genStudentButton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = Integer.parseInt(jTextField3.getText());
        if (n == 0) {
            return;
        }
        std = new Student[n];
        jTextField1.setText("");
        String showStudent = "";
        for (int i = 0; i < n; ++i) {
            Student x = genStudent();
            std[i] = x;
            showStudent += x.toString();
        }
        jTextField1.setText(showStudent);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed
    // create BST button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (std == null) {
            return;
        }
        bst = new BinarySearchTree();
        for (int i = 0; i < std.length; ++i) {
            bst.add(std[i]);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    // inorder
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (bst == null) {
            return;
        }
        bst.inorder();
        jTextField2.setText(bst.getInorder());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
