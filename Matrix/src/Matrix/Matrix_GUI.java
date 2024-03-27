/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Matrix;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.nio.file.Files.lines;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author ASUS
 */
public class Matrix_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Matrix_GUI
     */
    
    private static int debug=5;
    private static int m=-1;
    private static int n=-1;
    private static double[][] a;
    
    public Matrix_GUI() {
        initComponents();
        
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNhapSize = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        bttNhap = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblNhapMT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArMT = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        bttGiai = new javax.swing.JButton();
        lblKQ = new javax.swing.JLabel();
        lblShowSize = new javax.swing.JLabel();
        bttFile = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        bttXuat = new javax.swing.JButton();
        bttClear = new javax.swing.JButton();
        bttReset = new javax.swing.JButton();
        lblBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setBackground(new java.awt.Color(0, 204, 255));
        lblHeader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 51, 204));
        lblHeader.setText("                                Giải Hệ Phương Trình Tuyến Tính");
        getContentPane().add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 676, -1));

        lblNhapSize.setForeground(new java.awt.Color(0, 153, 204));
        lblNhapSize.setText("Nhập m và n:");
        getContentPane().add(lblNhapSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lblM.setForeground(new java.awt.Color(0, 153, 204));
        lblM.setText("m");
        getContentPane().add(lblM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        txtM.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(txtM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 30));

        lblN.setForeground(new java.awt.Color(0, 153, 204));
        lblN.setText("n");
        getContentPane().add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        txtN.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 50, 30));

        bttNhap.setBackground(new java.awt.Color(204, 255, 255));
        bttNhap.setForeground(new java.awt.Color(0, 153, 204));
        bttNhap.setText("Nhập");
        bttNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttNhapMouseClicked(evt);
            }
        });
        getContentPane().add(bttNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 676, 10));

        lblNhapMT.setForeground(new java.awt.Color(0, 153, 255));
        lblNhapMT.setText("Nhập ma trận:");
        getContentPane().add(lblNhapMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtArMT.setBackground(new java.awt.Color(255, 255, 204));
        txtArMT.setColumns(20);
        txtArMT.setRows(5);
        jScrollPane1.setViewportView(txtArMT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 550, 182));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 676, 10));

        bttGiai.setBackground(new java.awt.Color(0, 0, 255));
        bttGiai.setForeground(new java.awt.Color(204, 255, 255));
        bttGiai.setText("Giải");
        bttGiai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttGiaiMouseClicked(evt);
            }
        });
        getContentPane().add(bttGiai, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 108, -1));
        getContentPane().add(lblKQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 550, 40));
        getContentPane().add(lblShowSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 36, 16));

        bttFile.setBackground(new java.awt.Color(204, 255, 255));
        bttFile.setForeground(new java.awt.Color(0, 153, 204));
        bttFile.setText("Load File");
        bttFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttFileMouseClicked(evt);
            }
        });
        getContentPane().add(bttFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 210, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 17, 50));

        bttXuat.setBackground(new java.awt.Color(204, 255, 255));
        bttXuat.setForeground(new java.awt.Color(0, 153, 204));
        bttXuat.setText("Xuất file (.txt)");
        bttXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttXuatMouseClicked(evt);
            }
        });
        getContentPane().add(bttXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 109, -1));

        bttClear.setBackground(new java.awt.Color(204, 255, 255));
        bttClear.setForeground(new java.awt.Color(0, 153, 204));
        bttClear.setText("Clear");
        bttClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttClearMouseClicked(evt);
            }
        });
        getContentPane().add(bttClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 108, -1));

        bttReset.setBackground(new java.awt.Color(204, 255, 255));
        bttReset.setForeground(new java.awt.Color(0, 153, 204));
        bttReset.setText("Reset");
        bttReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttResetMouseClicked(evt);
            }
        });
        getContentPane().add(bttReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 108, -1));

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Matrix_BG.jpg"))); // NOI18N
        getContentPane().add(lblBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 930, 530));

        setSize(new java.awt.Dimension(817, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttNhapMouseClicked
        m=Integer.parseInt(txtM.getText());
        n=Integer.parseInt(txtN.getText());
        
        lblShowSize.setText(m+" x "+n);
        
        a=new double[m][n];
    }//GEN-LAST:event_bttNhapMouseClicked

    private void bttGiaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttGiaiMouseClicked
        if(m<1&&n<1)
        {
            JOptionPane.showMessageDialog(null, "Giá trị của m và n không hợp lệ\n", "Thông tin", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            lblKQ.setText("  ");

            // Lấy text từ text area
            String text = txtArMT.getText();

            // Chia text thành các dòng
            String[] lines = text.split("\n");

            // Duyệt qua từng dòng
             for (int i = 0; i < lines.length; i++) {
                // Chia mỗi dòng thành các phần tử ma trận
                String[] numbers = StringUtils.split(lines[i]," "); // Chia chuỗi thành các số
                
                for(int j=0;j<n;j++)
                {
                    a[i][j]=Double.parseDouble(numbers[j]);
                }
                
                
            }

            if(debug==1)
            {
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.printf("%.2f ",a[i][j]);
                    }
                    System.out.println();
                }
            }

            Matrix.giai(m, n, a);

            if(Matrix.nghiem(m, n, a)==1)
            {
                String format;
                int temp;
                for (int i = 0; i < m; i++)
                {
                    temp=Matrix.format(a[i][n-1]);
                    format="%."+temp;
                    String nghiem = String.format("X%d = "+format+"f\n",i+1,a[i][n-1]);
                    if(i<m-1) nghiem=nghiem+";     ";

                    // Nối text mới vào text cũ
                    lblKQ.setText(lblKQ.getText() + nghiem);
                }
            }

            if(Matrix.nghiem(m, n, a)==2) lblKQ.setText("Hệ phương trình có vô số nghiệm!");
            if(Matrix.nghiem(m, n, a)==3) lblKQ.setText("Hệ phương trình vô nghiệm!");
        }
        
        
    }//GEN-LAST:event_bttGiaiMouseClicked

    private void bttFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttFileMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Matrix (.mt)","mt");
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setMultiSelectionEnabled(false);
        
        int x=fileChooser.showDialog(this,"Chọn File");
        if(x==JFileChooser.APPROVE_OPTION)
        {
            try {
                File f=fileChooser.getSelectedFile();
                
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(f)));
                
                // Đọc số hàng và số cột từ dòng đầu tiên
                m = scanner.nextInt();
                n = scanner.nextInt();
                
                // Bỏ qua dòng xuống tiếp theo
                scanner.nextLine();
                
                //Khởi tạo ma trận
                a=new double[m][n];
                
                // Đọc dữ liệu từ file vào ma trận
                for (int i=0;i<m;i++) {
                    for (int j = 0;j<n; j++) {
                        
                        a[i][j] = scanner.nextDouble();
                    }
                }
                scanner.close();
                
                txtM.setText(""+m);
                txtN.setText(""+n);
                lblShowSize.setText(m+" x "+n);
                txtArMT.setText("");
                
                for (int i=0;i<m;i++) {
                    for (int j=0;j<n;j++)
                    {
                        // Tạo text
                        String format;
                        int temp=0;
                        temp=Matrix.format(a[i][j]);
                        format="%-13."+temp+"f";
                        String nghiem = String.format(Locale.US,format,a[i][j]);
                        if(j<n) nghiem=nghiem+" ";
                        if(j==n-1) nghiem=nghiem+"\n";

                        // Nối text mới vào text cũ
                        txtArMT.setText(txtArMT.getText() + nghiem);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Matrix_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bttFileMouseClicked

    private void bttXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttXuatMouseClicked
        PrintWriter writer = null;
        String path = System.getProperty("user.home") + "\\Documents";
        int soFile=0;
        String tenFile="Matrix.txt";
        File file = new File(path+"\\"+tenFile);
        if(file.exists())
        {
            if(debug==5) System.out.printf("%b\n",file.exists());
            soFile++;
            while (true)
            {
                file=new File(path+"\\Matrix("+soFile+").txt");
                if(file.exists())
                {
                    if(debug==5) System.out.printf("%b\n",file.exists());
                    soFile++;
                }
                else
                {
                    tenFile="Matrix("+soFile+").txt";
                    break;
                }
            }
        }
        
        try {
            writer = new PrintWriter(path+"\\"+tenFile);
            // Ghi dữ liệu vào file
            writer.printf("%d %d\n",m,n);
            
            writer.printf("\nInit Matrix:\n");
            for (int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                {
                    // Tạo text
                    String format;
                    int temp=0;
                    temp=Matrix.format(Matrix.initMT[i][j]);
                    format="%-15."+temp+"f ";
                    writer.printf(format,Matrix.initMT[i][j]);
                }
                writer.printf("\n");
            }
            
            writer.printf("\nLadder Matrix:\n");
            for (int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                {
                    // Tạo text
                    String format;
                    int temp=0;
                    temp=Matrix.format(Matrix.ladderMT[i][j]);
                    format="%-15."+temp+"f ";
                    writer.printf(format,Matrix.ladderMT[i][j]);
                }
                writer.printf("\n");
            }
            
            writer.printf("\nShortened Ladder Matrix:\n");
            for (int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                {
                    // Tạo text
                    String format;
                    int temp=0;
                    temp=Matrix.format(a[i][j]);
                    format="%-15."+temp+"f ";
                    writer.printf(format,a[i][j]);
                }
                writer.printf("\n");
            }
            
            writer.printf("\nSolution:\n");
            if(Matrix.nghiem(m, n, a)==1)
            {
                String format;
                int temp;
                for (int i = 0; i < n-1; i++)
                {
                    temp=Matrix.format(a[i][n-1]);
                    format="%."+temp;
                    writer.printf("X%d = "+format+"f\n",i+1,a[i][n-1]);
                }
            }
            if(Matrix.nghiem(m, n, a)==2) writer.printf("Hệ phương trình có vô số nghiệm!");
            if(Matrix.nghiem(m, n, a)==3) writer.printf("Hệ phương trình vô nghiệm!");
            // Đóng file
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Matrix_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
        
        JOptionPane.showMessageDialog(null, "Xuất file ("+tenFile+") thành công\n"+path, "Thông tin", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bttXuatMouseClicked

    private void bttClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttClearMouseClicked
        txtArMT.setText("");
    }//GEN-LAST:event_bttClearMouseClicked

    private void bttResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttResetMouseClicked
        txtArMT.setText("");
        txtM.setText("");
        txtN.setText("");
        lblKQ.setText("");
        lblShowSize.setText("");
        
        m=n=-1;
    }//GEN-LAST:event_bttResetMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Matrix_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrix_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrix_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrix_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrix_GUI().setVisible(true);
            }
        });
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttClear;
    private javax.swing.JButton bttFile;
    private javax.swing.JButton bttGiai;
    private javax.swing.JButton bttNhap;
    private javax.swing.JButton bttReset;
    private javax.swing.JButton bttXuat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblKQ;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblNhapMT;
    private javax.swing.JLabel lblNhapSize;
    private javax.swing.JLabel lblShowSize;
    private javax.swing.JTextArea txtArMT;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
