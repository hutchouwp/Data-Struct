package as5;

import java.util.Random;

class Citizen {

    private String id;
    private String name;
    private String gender;
    private String birthplace;
    private String birthdate;

    Citizen(String id, String name, String gender, String birthplace, String birthdate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
    }

    void setId(String newId) {
        id = newId;
    }

    String getId() {
        return id;
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }

    void setGender(String newGender) {
        gender = newGender;
    }

    String getGender() {
        return gender;
    }

    void setBrithP(String newBrithP) {
        birthplace = newBrithP;
    }

    String getBrithP() {
        return birthplace;
    }

    void setBrithD(String newBrithD) {
        birthdate = newBrithD;
    }

    String getBrithD() {
        return birthdate;
    }
}

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Gendata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ctz = new Citizen[5];
        jTextField1.setText("");
        String showCitizen = "";
        for (int i = 0; i < 5; ++i) {
            Citizen x = genCit();
            ctz[i] = x;
            showCitizen += ctz[i].toString();
            
        }
        jTextField1.setText(showCitizen);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static Citizen[] ctz;

    public static Citizen genCit() {
        Random r = new Random();
        int randid = 100 + r.nextInt(900);
        String id = randid + " "; //

        String text1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String text2 = "abcdefghijklmnopqrstuvwxyz";
        int n = r.nextInt(5) + 3;

        String name = "" + text1.charAt(r.nextInt(25));
        for (int i = 0; i < n; ++i) {
            name += text2.charAt(r.nextInt(text2.length() - 1)); //
        }
        name += " ";

        String gender[] = {"male", "female"};
        String rndG = gender[r.nextInt(gender.length)] + " "; //

        String BirthP[] = {"Thailand", "Japan", "Korea", "China"};
        String rndBP = BirthP[r.nextInt(BirthP.length)] + " "; //
        int y = 1990 + r.nextInt(36);

        int m = 1 + r.nextInt(11);

        int d = 1 + r.nextInt(30);

        String birthdate = y + "/" + m + "/" + d + " ";  //
        System.out.println(id + name + rndG + rndBP + birthdate);
        return new Citizen(id, name, rndG, rndBP, birthdate);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
