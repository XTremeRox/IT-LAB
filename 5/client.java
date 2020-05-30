package client_server;
import java.net.*;
import java.io.*;
public class client extends javax.swing.JFrame {
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    public client() {
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Al ignment.LEADING, false)
                    .addComponent(jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msg_text,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 271,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msg_send,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LE ADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Al ignment.LEADING, false)
                    .addComponent(msg_text)
                    .addComponent(msg_send,
                        javax.swing.GroupLayout.DEFAULT_SIZE, 34,
                        Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        pack();
    } // </editor-fold>
    private void msg_sendActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            String msgout = "";
            msgout = msg_text.getText().trim();
            dout.writeUTF(msgout);
        } catch (Exception e) {}
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
        try {
            s = new Socket("localhost", 1201);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            String msgin = "";
            while (!msgin.equals("exit")) {
                msgin = din.readUTF();
                msg_area.setText(msg_area.getText().trim() + "\n Server :
                    "+msgin+"\
                    n ");
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