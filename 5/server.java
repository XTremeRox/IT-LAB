package client_server;
import java.net.*;
import java.io.*;
public class server extends javax.swing.JFrame {
        static ServerSocket ss;
        static Socket s;
        static DataInputStream din;
        static DataOutputStream dout;
        public server() {
            initComponents();
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {
            jScrollPane1 = new javax.swing.JScrollPane();
            msg_area = new javax.swing.JTextArea();
            msg_text = new javax.swing.JTextField();
            msg_send = new javax.swing.JButton();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_O N_CLOSE);
            msg_area.setColumns(20);
            msg_area.setRows(5);
            jScrollPane1.setViewportView(msg_area);
            msg_text.setText("jTextField1");
            msg_send.setText("Send");
            msg_send.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    msg_sendActionPerformed(evt);
                }
            });
            javax.swing.GroupLayout layout = new
            javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LE ADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Al ignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(msg_text,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 253,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(msg_send,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 109,
                                Short.MAX_VALUE))
                        .addComponent(jScrollPane1))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LE ADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 205,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Al ignment.BASELINE)
                        .addComponent(msg_text,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(msg_send,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE))
            );
            pack();
        } // </editor-fold>
        private void
        msg_sendActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            try {
                String msgout = "";
                msgout = msg_text.getText().trim();
                dout.writeUTF(msgout);
            } catch (Exception e) {}
        }
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel
            //setting code(optional)
            //">
            /* If Nimbus (introduced in Java SE 6) is not available, stay
            with the default look and feel.
            * For details see
            http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
            html
            */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info:
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(server.class.getName()).log(jav a.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(server.class.getName()).log(jav a.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(server.class.getName()).log(jav a.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(server.class.getName()).log(jav a.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new server().setVisible(true);
                }
            });
            String msgin = "";
            try {
                ss = new ServerSocket(1201);
                s = ss.accept();
                din = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());
                while (!msgin.equals("exit")) {
                    msgin = din.readUTF();
                    msg_area.setText(msg_area.getText().trim() + "\n Client :
                        "+msgin);
                    }
                } catch (Exception e) {}
            }
            // Variables declaration - do not modify
            private javax.swing.JScrollPane jScrollPane1;
            private static javax.swing.JTextArea msg_area;
            private javax.swing.JButton msg_send;
            private javax.swing.JTextField msg_text;
            // End of variables declaration
        }