/*
            GROUP MEMBERS: 
             SECTION 'C'

SYED MUHAMMAD ALI KAMAL   | K12-2017
UZAIR KHAN                | K12-2011
SUNNY KUMAR               | K12-2213
SHAYAN SAGHIR             | K12-2086

INSTRUCTOR: MISS AISHA UROOJ
*/

package tomasolo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tomaslo extends javax.swing.JFrame {
 
int run_array[][]=new int [10][10];
int run_i=0,run_j=0;

    public Tomaslo() {
      initComponents();
    }

String[] instline;
int load_array[]={0,0,0,0};
int load_index=0,ins_index=0,load=1,store=1,add=1,sub=1,mul=1,div=1;
String des_reg="";
int rowindex=0,colindex=0,s=1,a=1,m=1,d=1;
int load_row_index=0,load_col_index=0;
int res_row_index=0,res_col_index=0;
int run_row_index=0,run_col_index=0;
int value=1; 
ArrayList<ArrayList<String>> instruction = new ArrayList<ArrayList<String>>();
ArrayList<ArrayList<String>> buffer = new ArrayList<ArrayList<String>>();
ArrayList<ArrayList<String>> reservation = new ArrayList<ArrayList<String>>();
public static int Clock = 0;
public static int click =0;
public String ll,ls,la,lsb,lm,ld;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbload = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbrun = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbfu = new javax.swing.JTable();
        but_next = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbins = new javax.swing.JTable();
        bset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        insarea = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbresv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clock = new javax.swing.JTextField();
        noinst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Auto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TOMASULO");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Reservation Station");

        tbload.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Load1", "No", null},
                {"Load2", "No", null}
            },
            new String [] {
                "Name", "Busy ", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbload);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Load/Store Buffer");

        tbrun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Operation", "Issue", "Execution", "Write Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbrun.setToolTipText("");
        tbrun.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbrunAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(tbrun);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Running State");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Instrucation Queue");

        tbfu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
            },
            new String [] {
                "F0", "F2", "F4", "F6", "F8", "F10", "F12", "F14", "F16", "F18", "F20", "F22", "F24", "F26", "F28", "F30"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbfu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tbfuCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane9.setViewportView(tbfu);

        but_next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_next.setText("Next");
        but_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_nextActionPerformed(evt);
            }
        });

        tbins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, "  "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, " "},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Opeartion ", "Destination Register", "Source Reg 1", "Source Reg 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tbins);

        bset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bset.setText("Set Instructions");
        bset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsetActionPerformed(evt);
            }
        });

        insarea.setColumns(20);
        insarea.setRows(5);
        jScrollPane4.setViewportView(insarea);

        tbresv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Add1", "No", " ", " ", " ", " ", " "},
                {null, "Add2", "No", " ", " ", " ", " ", " "},
                {null, "Add3", "No", " ", " ", " ", " ", " "},
                {null, "Mult1", "No", " ", " ", " ", " ", " "},
                {null, "Mult2", "No", " ", " ", " ", " ", " "}
            },
            new String [] {
                "Time", "Name", "Busy", "Op", "Vj", "Vk", "Qj", "Qk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tbresv);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Register Status");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Clock");

        clock.setEditable(false);
        clock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clock.setText("0");
        clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockActionPerformed(evt);
            }
        });

        noinst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noinst.setText("0");
        noinst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noinstActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("No. of Instructions");

        Auto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Auto.setText("Auto Run");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem5.setText("Upload File");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Set Latency");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Reset");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bset)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(but_next, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Auto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(noinst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(noinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Auto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Tomaslo(String lat_load, String lat_store, String lat_add, String lat_sub, String lat_mul, String lat_div) 
 {  
     ll=lat_load;
     ls=lat_store;
     la=lat_add;
     lsb=lat_sub;
     lm=lat_mul;
     ld=lat_div;
    initComponents();
    setLocation(0,0);
 }
    private void but_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_nextActionPerformed
     
        
     if(!tbins.getValueAt(0,0).equals(" ")){
     Clock++;
     if(Clock < instruction.size()+1){
     String s1 = ""+Clock;
     clock.setText(s1);
     
     //Resolve buffer////
     
      resolveBuffer();  
   
      
        if(tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("ld") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("l.d")) {
            
            boolean b=true,b1=true;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkLoadBuffer();
            
            if(index != -1){
                String address = checkSource(rowindex,1);
                String nl =checkSource(rowindex,2);
                if(nl != null){
                    address = address+"+"+checkSource(rowindex,2);
                }
                updateLoadBuffer(index,address);
                
            }else{
                b=false;
                
            }
           
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                
                if(b1 == true){
                    String ld = "Load"+load;
                    inserInFunctionalUnit(des_reg,ld);
                    load++;
                }
                
            }
            
            if(b==true && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==false && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==true && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==false && b1==false){
                
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }
            
            rowindex++;
            
     }else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("sd") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("s.d")) {
            
            boolean b=true,b1=true;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkLoadBuffer();
            
            if(index != -1){
                String address = checkSource(rowindex,1);
                String nl = checkSource(rowindex,2);
                
                if(nl != null){
                    address = address+"+"+checkSource(rowindex,2);
                }
                updateLoadBuffer(index,address);
                
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Store"+store;
                    inserInFunctionalUnit(des_reg,ld);
                    store++; 
                    
                }
                
            }
            
            if(b==true && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==false && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==true && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==false && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }
            rowindex++;
            
     }
     //ADD
     else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("addd")||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("add.d")) {
            
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("add");
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Add"+add;
                    inserInFunctionalUnit(des_reg,ld);
                    add++; 
                    
                }
            }
            
            if(b==true && b1==true){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(la);
                tbresv.setValueAt(la, index, 0);
            }else if(b==false && b1==true){
               
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(la);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(la);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                   
                buffer.get(buffer.size()-1).add(la);
            }
            
            rowindex++;
            
     }
     //SUB
     else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("subd")||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("sub.d")) {
            
           
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("sub");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Sub"+sub;
                    inserInFunctionalUnit(des_reg,ld);
                    sub++; 
                    
                }
            }
            
            if(b==true && b1==true){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                 //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(lsb);
                tbresv.setValueAt(lsb, index, 0);
                
            }else if(b==false && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(lsb);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(lsb);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                   
                buffer.get(buffer.size()-1).add(lsb);
            }
            
            rowindex++;
      
            
     }
     //MUL
      else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("multd") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("multd")) {
            
           
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("mult");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                 
                if(b1 == true){
                    String ld = "Mult"+mul;
                    inserInFunctionalUnit(des_reg,ld);
                    mul++; 
                    
                }
            }
            
            if(b==true && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(lm);
                tbresv.setValueAt(lm, index, 0);
                
            }else if(b==false && b1==true){
               
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(lm);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                buffer.get(buffer.size()-1).add(lm);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                buffer.get(buffer.size()-1).add(lm);
            }
            
            rowindex++;        
     }
        //DIV
    else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("divd") || tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("div.d")) {
            
          
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("div");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Div"+div;
                    inserInFunctionalUnit(des_reg,ld);
                    div++; 
                    
                }
            }
            
            if(b==true && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(ld);
                tbresv.setValueAt(ld, index, 0);
                
            }else if(b==false && b1==true){
                
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(ld);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(ld);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                buffer.get(buffer.size()-1).add(ld);
            }
            
            rowindex++;    
            
     }

    }else{
         //while(buffer.size()!=0){
             
            
             if(buffer.size()!=0){
                 resolveBuffer();
                 
                 if(buffer.size() == 0){
                String s1 = ""+Clock;
                clock.setText(s1);
               // break;
             }
             }
             
             if(buffer.size() != 0){
             String s1 = ""+Clock;
             clock.setText(s1);
             }
           //  Clock++;
         
    //}
     }
    }else{
    JOptionPane.showMessageDialog(rootPane, "ERROR!!! Please insert the instructions!!");
    }
    }//GEN-LAST:event_but_nextActionPerformed

    private void tbfuCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbfuCaretPositionChanged

    }//GEN-LAST:event_tbfuCaretPositionChanged

    private void tbrunAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbrunAncestorAdded
      
    }//GEN-LAST:event_tbrunAncestorAdded

    
    
    private void bsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsetActionPerformed
          
        String input = insarea.getText();
        instline = null;
        instline = input.split("[\n]");
        clock.setText(Integer.toString(0));
        int r_index = 0, c_index = 0,c=0;
        
        
        for(int j=0;j<instline.length;j++){
            instruction.add(new ArrayList());
            if(valid(instline[j])){
            instruction.get(j).add(instline[j]);
            String[] inst = instline[j].split(" ");
            // Set LOAD Begins here...
            if(inst[0].equalsIgnoreCase("LD")||inst[0].equalsIgnoreCase("L.D")){
                c_index = 0;
                tbins.setValueAt(inst[0], r_index, c_index);
                
            String[] source = inst[1].split(",");
            if(source.length == 2){
            if(checkFPR(source[0])){
            // Set Destination register
                c_index++;
                tbins.setValueAt(source[0], r_index, c_index);
            }
            else{
                reset__();
                System.out.println("Invalid Destination Register in LOAD instruction");
                ErrInfo.ErrMsg("Invalid Destination Register in LOAD instruction. Please Reset.", "Invalid Instruction");
                
                }   
            if(check_load_src(source[1])){
            //Set Load source
                c_index++;
                tbins.setValueAt(source[1], r_index, c_index);
            }
            else{
                reset__();
                System.out.println("Invalid Source format in LOAD instruction");
                ErrInfo.ErrMsg("Invalid Source format in LOAD instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                
                }
            }
            else{
            System.out.println("Invalid LOAD Instruction Format");
            ErrInfo.ErrMsg("Invalid LOAD Instruction Format. Please Reset.", "Invalid Instruction");
            }
            }
            
            // Store...
            else if(inst[0].equalsIgnoreCase("SD")||inst[0].equalsIgnoreCase("S.D")){
                c_index = 0;
                tbins.setValueAt(inst[0], r_index, c_index);
            String[] source = inst[1].split(",");
            if(source.length == 2){
               
            if(check_load_src(source[0])){
            //Set source
                c_index++;
                tbins.setValueAt(source[0], r_index, c_index+1);
            }
            else{
                reset__();
                System.out.println("Invalid Source format in STORE instruction");
                ErrInfo.ErrMsg("Invalid Source format in STORE instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                
                }
            if(checkFPR(source[1])){
            // Set Destination register
                System.out.println("src:" + source[1]);
                c_index++;
                tbins.setValueAt(source[1], r_index, c_index-1);
            }
            else{
                reset__();
                System.out.println("Invalid Destination Register in STORE instruction");
                ErrInfo.ErrMsg("Invalid Destination Register in STORE instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                
                }
            }
            else{
                reset__();
            System.out.println("Invalid STORE Instruction Format");
            ErrInfo.ErrMsg("Invalid STORE Instruction Format. Please Reset.", "Invalid Instruction");
            // Reset !
            ;
            }
            
            }
            else if(inst[0].equalsIgnoreCase("ADDD") ||inst[0].equalsIgnoreCase("ADD.D")){
            c_index = 0;
            tbins.setValueAt(inst[0], r_index, c_index);
            c_index++;
            String[] fpr = inst[1].split(",");
            if(fpr.length == 3){
            // from here to go...
            for(int i=0; i<fpr.length; i++){
            if(checkFPR(fpr[i])){
            tbins.setValueAt(fpr[i], r_index, c_index);
            
            }
            else{
                reset__();
                System.out.println("Invalid  Register format in ADDD instruction");
                 ErrInfo.ErrMsg("Invalid  Register format in ADDD instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                 
                }
            c_index++;
            }
            }
            else{
                reset__();
            System.out.println("Invalid ADD Double Instruction Format");
            ErrInfo.ErrMsg("Invalid ADD Double Instruction Format. Please Reset.", "Invalid Instruction");
            // Reset !
            
            }
            }
            else if(inst[0].equalsIgnoreCase("SUBD")||inst[0].equalsIgnoreCase("SUB.D")){
            c_index = 0;
            tbins.setValueAt(inst[0], r_index, c_index);
            c_index++;
            String[] fpr = inst[1].split(",");
            if(fpr.length == 3){
            // from here to go...
            for(int i=0; i<fpr.length; i++){
            if(checkFPR(fpr[i])){
            tbins.setValueAt(fpr[i], r_index, c_index);
            
            }
            else{
                reset__();
                System.out.println("Invalid  Register format in SUBD instruction");
                ErrInfo.ErrMsg("Invalid  Register format in SUBD instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                
                }
            c_index++;
            }
            }
            else{
                 reset__();
            System.out.println("Invalid SUB Double Instruction Format");
            ErrInfo.ErrMsg("Invalid SUB Double Instruction Format. Please Reset.", "Invalid Instruction");
            // Reset !
           
            }
            
            }
            else if(inst[0].equalsIgnoreCase("MULTD") ||inst[0].equalsIgnoreCase("MULT.D")){
            c_index = 0;
            tbins.setValueAt(inst[0], r_index, c_index);
            c_index++;
            String[] fpr = inst[1].split(",");
            if(fpr.length == 3){
            // from here to go...
            for(int i=0; i<fpr.length; i++){
            if(checkFPR(fpr[i])){
            tbins.setValueAt(fpr[i], r_index, c_index);
            
            }
            else{
                reset__();
                System.out.println("Invalid  Register format in MULTD instruction");
                ErrInfo.ErrMsg("Invalid  Register format in MULTD instruction. Please Reset.", "Invalid Instruction");
                // Reset!
                
                }
            c_index++;
            }
            }
            else{
                reset__();
            System.out.println("Invalid MULT Double Instruction Format");
            ErrInfo.ErrMsg("Invalid MULT Double Instruction Format. Please Reset.", "Invalid Instruction");
            // Reset !
            
            }
            }
            else if(inst[0].equalsIgnoreCase("DIVD")||inst[0].equalsIgnoreCase("DIV.D")){
            c_index = 0;
            tbins.setValueAt(inst[0], r_index, c_index);
            c_index++;
            String[] fpr = inst[1].split(",");
            if(fpr.length == 3){
            // from here to go...
            for(int i=0; i<fpr.length; i++){
            if(checkFPR(fpr[i])){
            tbins.setValueAt(fpr[i], r_index, c_index);
            
            }
            else{
                reset__();
                System.out.println("Invalid  Register format in DIVD instruction");
                 ErrInfo.ErrMsg("Invalid  Register format in DIVD instruction. Please Reset.", "Invalid Instruction Format");
                // Reset!
                
                }
            c_index++;
            }
            }
            else{
                reset__();
            System.out.println("Invalid DIV Double Instruction Format");
             ErrInfo.ErrMsg("Invalid DIV Double Instruction Format. Please Reset", "Invalid Instruction");
            // Reset !
             
            }
            }
            else{
                reset__();
            System.out.println("Error: Inappropriate Instruction!");
            ErrInfo.ErrMsg("Error: Inappropriate Instruction!. Please Reset", "Invalid Instruction");
            }
        }
            else{
                reset__();
                System.out.println("Invalid characters found in instruction: " + r_index + ". Separate by ','");
                ErrInfo.ErrMsg("Invalid characters found in instruction: " + r_index + ". Separate by ','. Please Reset", "Invalid Format");
                //REset! 
                
            }
                r_index ++;
        }
      noinst.setText(""+instruction.size());
            /*
            //System.out.println(instline.length);
            String[] parts = instline[j].split(",");
            System.out.println(parts[0]);
            System.out.println(parts[1]);
            c_index =0;
        for (int i = 0; i < parts.length ; i++) {
            
            if(parts.length == 4){
                System.out.println("tatatat");
                tbins.setValueAt(parts[i], r_index, c_index);
                instruction.get(c).add(parts[i]);
                if (c_index == 3) {
                    instruction.add(new ArrayList());
                    r_index++;
                    c_index = 0;
                    c++;
                } 
                else {
                    c_index++;
                }
            }else if(parts.length == 3){
                System.out.println("papapa");
                
                if (c_index == 2) {
                    tbins.setValueAt(parts[i], r_index, c_index);
                    instruction.get(c).add(parts[i]);
                    c_index++;
                    tbins.setValueAt("No", r_index, c_index);
                    instruction.add(new ArrayList());
                    r_index++;
                    c_index = 0;
                    c++;
                }else{
                    tbins.setValueAt(parts[i], r_index, c_index);
                    instruction.get(c).add(parts[i]);
                    c_index++;
                } 
               
                
            }
        }
        }
*/        
  
    }//GEN-LAST:event_bsetActionPerformed
    public boolean valid(String str){
    boolean chu = false;
    if(str.contains("-")||str.contains("=")||str.contains("[")||str.contains("]")||str.contains("\\")
            ||str.contains(";")||str.contains("'")||str.contains(".")||str.contains("/")){
   
    }
    else{
        chu = true;
    }
    return chu;
    }
     
    boolean checkFPR(String str){
   
    return ("F0".equals(str) || "F2".equals(str) || "F4".equals(str) || "F6".equals(str) || "F8".equals(str)
            || "F10".equals(str) || "F12".equals(str) || "F14".equals(str) || "F16".equals(str) || "F18".equals(str)
            || "F20".equals(str) ||"f0".equals(str) || "f2".equals(str) || "f4".equals(str) || "f6".equals(str) || "f8".equals(str)
            || "f10".equals(str) || "f12".equals(str) || "f14".equals(str) || "f16".equals(str) || "f18".equals(str)
            || "f20".equals(str) );
    }
    
    boolean check_load_src(String str){
    boolean foo = false, bar = false, barfoo = false;
    if(str.contains("(") && str.contains(")"))
    {
    if(str.contains("R1")||str.contains("r1") || str.contains("R2")||str.contains("r2") || str.contains("R3")||str.contains("r3") || 
            str.contains("R4")||str.contains("r4") || str.contains("R5")||str.contains("r5") || str.contains("R6")||str.contains("r6") ||
            str.contains("R7")||str.contains("r7") || str.contains("R8")||str.contains("r8") || str.contains("R9")||str.contains("r9") ||
            str.contains("R10")||str.contains("r10")){
            foo = true;
        }
    else{
        System.out.println("Inappropriate GPR used in LOAD instruction");
                foo = false;
        }
    // ld f4,234(r12333)
    if(str.contains("r")){
    String a = str.substring(str.lastIndexOf('r')+1, str.length()-1);
    
        int x = Integer.parseInt(a);
           if(x>0 && x<=32){
        
        bar = true;
           }
          else{
               bar = false;
          System.out.println("Invalid GPR. Range: R1 - R32");
          }
    }
    if(str.contains("R")){
    String b = str.substring(str.lastIndexOf('R')+1, str.length()-1);
    
        int y = Integer.parseInt(b);
          if(y>0 && y<=32){
        
        bar = true;
           }
          else{
               bar = false;
          System.out.println("Invalid GPR. Range: R1 - R32");
          }
    }
     
    if(foo && bar){
    barfoo = true;
    }
    }
        
    return barfoo;
    }
    
      /////////////////////////////////////////////////////////////////////////////////////////
                        ////////////////////// END ////////////////////
   
    private void clockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clockActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reset__();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            System.exit(1);        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      String inst = "Instructions Format For DLX Processor\n"
              + "For Load:                   For Store:   \n"
              + "1. LD F6,34(R2)       1. SD 34(R2),F6   \n"
              + "3. ld F6,34(R2)          3. sd 34(R2),F6   \n\n"
              +"For AddD:                   For SubD:   \n"
              + "1. ADDD F6,F8,F2      1. SUBD F8,F6,F2   \n"
              + "3. addd F6,F8,F2         3. subd F8,F6,F2   \n\n"
              +"For DivD:                   For MultD   \n"
              + "1. DIVD F6,F8,F2      1. MULTD F8,F6,F2   \n"
              + "3. divd F6,F8,F2         3. multd F8,F6,F2   \n";
      
        JOptionPane.showMessageDialog(rootPane, inst, "About", store, null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      dispose();
      Latency lt=new Latency();
      lt.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
        JFileChooser fc=new JFileChooser();
     fc.setCurrentDirectory(new java.io.File("C:/Users/Ali/Desktop"));
     fc.setDialogTitle("File Chooser");
     int result=fc.showSaveDialog(null);
     if(result==JFileChooser.APPROVE_OPTION){
         //String text=insarea.getText();
         File fi=fc.getSelectedFile();
          reset__();
         try {
             String line="";
             String s="";
             BufferedReader br=new BufferedReader(new FileReader(fi.getPath()));
             while((s=br.readLine())!=null){
                 
              line+=s; 
              line = line+"\n";
             }
             insarea.setText(line);
             
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Tomaslo.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(Tomaslo.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void noinstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noinstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noinstActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
        next();
        while(buffer.size()!=0){
         next();
        }
         
         
             
        
        
    }//GEN-LAST:event_AutoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auto;
    private javax.swing.JButton bset;
    private javax.swing.JButton but_next;
    private javax.swing.JTextField clock;
    private javax.swing.JTextArea insarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField noinst;
    private javax.swing.JTable tbfu;
    private javax.swing.JTable tbins;
    private javax.swing.JTable tbload;
    private javax.swing.JTable tbresv;
    private javax.swing.JTable tbrun;
    // End of variables declaration//GEN-END:variables

    private int checkReservationStation(String opr){
        if(opr.contains("add") || opr.contains("ADD") || opr.contains("sub") || opr.contains("SUB")){
          for(int i=0;i<3;i++){
            String val = tbresv.getValueAt(i, 2).toString();
             if(val.equalsIgnoreCase("No")){
                return i;
            }else{
                continue;
            }
          }
          return -1;
        }else{
            for(int i=3;i<5;i++){
                String val = tbresv.getValueAt(i, 2).toString();
             if(val.equalsIgnoreCase("No")){
                return i;
            }else{
                continue;
            }
            }
            return -1;
        }
        
    }
    
    
    private int checkLoadBuffer() {
        for(int i=0;i<2;i++){
            String val = tbload.getValueAt(i,1).toString();
            if(val.equalsIgnoreCase("No")){
                return i;
            }else{
                continue;
            }
            
        }
        
        return -1;
    }

    private void insertInRunningTable( String val,int r, int c) {
        tbrun.setValueAt(val, r, c);
       
    }

    private String checkSource(int row,int col) {
        String sr="";
        if(col == 1){
            
            sr = tbins.getValueAt(row, 2).toString();
            
            if(sr.contains("F") || sr.contains("f")){
                String str = sr.substring(1, sr.length());
                int n = Integer.parseInt(str);
                String v = tbfu.getValueAt(0, n).toString();
                return v;
            }else if(sr.contains("(")){
                String[] s = sr.split("\\(");
                String[] s2 = s[1].split("\\)");
                String temp = s[0]+"+"+s2[0];
               return temp;
            }else{
                     return sr;
                    }
        }else if(col == 2){
            sr = tbins.getValueAt(row, 3).toString();
            
            if(sr.equalsIgnoreCase(" ")){
                return null;
            }else
            if(sr.contains("F") || sr.contains("f")){
                String str = sr.substring(1, sr.length());
                int n = Integer.parseInt(str);
                String v = tbfu.getValueAt(0, n).toString();
                return v;
            }else{
                return sr;
            } 
        }
    return "Error..!!";
        
    }

    private void updateLoadBuffer(int index, String address) {
        tbload.setValueAt("Yes", index, 1);
        tbload.setValueAt(address, index, 2);
    }

    private void inserInFunctionalUnit(String soc_reg, String ld) {
        
        String loc = soc_reg.substring(1, soc_reg.length());
        int n = Integer.parseInt(loc);
        n=n/2;
        tbfu.setValueAt(ld, 0, n);
    }

    private boolean checkFunctionalUnit(String soc_reg) {
        String loc = soc_reg.substring(1, soc_reg.length());
        int n = Integer.parseInt(loc);
        n=n/2; 
        String val1 = tbfu.getValueAt(0, n).toString();
        
        if(val1.contains("store") || val1.contains("load")|| val1.contains("Load") || val1.contains("Store")|| val1.contains("add") || val1.contains("Add")|| val1.contains("sub") || val1.contains("Sub")|| val1.contains("div") || val1.contains("mult")|| val1.contains("Mult")||
           val1.contains("STORE") || val1.contains("LOAD") || val1.contains("ADD") || val1.contains("SUB")|| val1.contains("load")|| val1.contains("Div")  || val1.contains("MULT")){
            
          return false;  
            
        }else{
            return true;
        }
    }
    
    
    private String getFunctionalUnit(String f){
        if(f.contains("F") || f.contains("f")){
        
            String loc = f.substring(1, f.length());
            int n = Integer.parseInt(loc);
            n=n/2; 
            String val1 = tbfu.getValueAt(0, n).toString();
            
            if(val1.contains("store") || val1.contains("load")|| val1.contains("Load") || val1.contains("Store")|| val1.contains("add") || val1.contains("Add")|| val1.contains("sub") || val1.contains("Sub")|| val1.contains("div") || val1.contains("mult")|| val1.contains("Mult")||
           val1.contains("STORE") || val1.contains("LOAD") || val1.contains("ADD") || val1.contains("SUB")|| val1.contains("load")|| val1.contains("Div")  || val1.contains("MULT"))
            {
                return val1;

            }else if(val1.equals(" ")){
                return f;
            }
            else{
                
                return val1;
            }
        }
            return f;
        
    }
    
    private void resolveBuffer(){
        String op,fu,loadbuf,src1,src2,des,time,row,ldindex,resrv,vi,vj,qi,qj;
        int cl = Clock,i=0;
        int siz = buffer.size();
        if(buffer.size() == 0){
            
        }else{
            while(i<buffer.size()){
                op = buffer.get(i).get(4);
                if(op.equalsIgnoreCase("ld") || op.equalsIgnoreCase("l.d")){
                    
                    loadbuf = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    if(loadbuf.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                        
                        time = buffer.get(i).get(8);
                        int tim = Integer.parseInt(time);
                        if(tim == 0){
                            ldindex = buffer.get(i).get(3);
                            int lindex = Integer.parseInt(ldindex);
                            tbload.setValueAt("No", lindex, 1);
                            String adrs = tbload.getValueAt(lindex, 2).toString();
                            tbload.setValueAt("", lindex, 2);
                            des = buffer.get(i).get(5);
                            String loc = des.substring(1, des.length());
                            int n = Integer.parseInt(loc);
                            n=n/2;
                            tbfu.setValueAt("M("+adrs+")", 0,n);
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                           
                            tbrun.setValueAt(""+(Clock), r, 3);
                            buffer.remove(i);
                           // i=0;
                            continue;
                        }else{
                             row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            tbrun.setValueAt(""+(Clock), r, 2);
                            tim--;
                            time ="";
                            time =""+tim;
                            buffer.get(i).set(8, time);
                            i++;
                        }
                    }else if(loadbuf.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkLoadBuffer();
                        
                        if(ind != -1){
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            String addr = checkSource(r,1);
                            String nl = checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            }
                            updateLoadBuffer(ind,addr);
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(loadbuf.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Load"+load;
                            inserInFunctionalUnit(des,ld);                       
                            load++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                       
                    }else if(loadbuf.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkLoadBuffer();
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                            String ld = "Load"+load;
                            inserInFunctionalUnit(des,ld);                       
                            load++;
                            buffer.get(i).set(2,"true");
                           row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            String addr = checkSource(r,1);
                            String nl =checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            updateLoadBuffer(ind,addr);
                            
                            }
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                             String addr = checkSource(r,1);
                             String nl = checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            }
                            updateLoadBuffer(ind,addr);
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            
                            String ld1 = "Load"+load;
                            inserInFunctionalUnit(des,ld1);                       
                            load++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }       
        }else if(op.equalsIgnoreCase("sd") || op.equalsIgnoreCase("s.d")){
                    loadbuf = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    if(loadbuf.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                        time = buffer.get(i).get(8);
                        int tim = Integer.parseInt(time);
                        if(tim == 0){
                            ldindex = buffer.get(i).get(3);
                            int lindex = Integer.parseInt(ldindex);
                            tbload.setValueAt("No", lindex, 1);
                            String adrs = tbload.getValueAt(lindex, 2).toString();
                            tbload.setValueAt("", lindex, 2);
                            des = buffer.get(i).get(5);
                            String loc = des.substring(1, des.length());
                            int n = Integer.parseInt(loc);
                            n=n/2;
                            tbfu.setValueAt("M("+adrs+")", 0,n);
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            tbrun.setValueAt(""+(Clock), r, 3);
                            buffer.remove(i);
                            //i=0;
                            continue;
                        }else{
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            tbrun.setValueAt(""+(Clock), r, 2);
                            tim--;
                            time ="";
                            time =""+tim;
                            buffer.get(i).set(8, time);
                            i++;
                        }
                    }else if(loadbuf.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkLoadBuffer();
                        
                        if(ind != -1){
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            String addr = checkSource(r,1);
                            String nl =checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            }
                            updateLoadBuffer(ind,addr);
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(loadbuf.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Store"+store;
                            inserInFunctionalUnit(des,ld);                       
                            store++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                     
                    }else if(loadbuf.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkLoadBuffer();
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                            String ld = "Store"+store;
                            inserInFunctionalUnit(des,ld);                       
                            store++;
                            buffer.get(i).set(2,"true");
                           row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                            String addr = checkSource(r,1);
                            String nl = checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            updateLoadBuffer(ind,addr);
                            }
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            row = buffer.get(i).get(0);
                            int r = Integer.parseInt(row);
                             String addr = checkSource(r,1);
                             String nl = checkSource(r,2);
                            if(nl != null){
                            addr = addr+"+"+checkSource(r,2);
                            }
                            updateLoadBuffer(ind,addr);
                            buffer.get(i).set(1,"true");
                            buffer.get(i).set(3,""+ind);
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            
                            String ld1 = "Store"+store;
                            inserInFunctionalUnit(des,ld1);                       
                            store++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }       
        }else if(op.equalsIgnoreCase("addd") || op.equalsIgnoreCase("add.d")){
            
                    String indx;
                    int inx;
                    resrv = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    
                    if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                        
                        String i1,i2,i3,i4,fu1,fu2;
                        boolean b3,b4;
                        i1 = buffer.get(i).get(6);
                        i2 = buffer.get(i).get(7);
                        i3 = buffer.get(i).get(8);
                        i4 = buffer.get(i).get(9);
                        
                        if(i3.equals("false") && i4.equals("false")){
                            
                                    time = buffer.get(i).get(10);
                                    int tim = Integer.parseInt(time);
                                    String st = buffer.get(i).get(3);
                                    int ind = Integer.parseInt(st);
                                    tbresv.setValueAt(tim, ind, 0);
                                        if(tim == 0){
                                        ldindex = buffer.get(i).get(3);
                                        int lindex = Integer.parseInt(ldindex);
                                        tbresv.setValueAt(" ", lindex, 0);
                                        tbresv.setValueAt("No", lindex, 2);
                                        tbresv.setValueAt(" ", lindex, 3);
                                        String adrs = tbresv.getValueAt(lindex, 4).toString();
                                        String adrs2 =tbresv.getValueAt(lindex, 5).toString();
                                        tbresv.setValueAt(" ", lindex, 4);
                                        tbresv.setValueAt(" ", lindex, 5);
                                        des = buffer.get(i).get(5);
                                        String loc = des.substring(1, des.length());
                                        int n = Integer.parseInt(loc);
                                        n=n/2;
                                        tbfu.setValueAt("M("+adrs+"+"+adrs2+")", 0,n);
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+Clock, r, 3);
                                        
                                        buffer.remove(i);
                                        //i=0;
                                        continue;
                                    } else{
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+(Clock), r, 2);
                                        tim--;
                                        time ="";
                                        time =""+tim;
                                        buffer.get(i).set(10, time);
                                        
                                        i++;
                                        continue;
                                }
                         }else if(!i3.equals("false") && i4.equals("false")){
                             
                             String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            
                             if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                              //System.out.println("b3 true..");
                           String fu3 = getFunctionalUnit(fu1);
                           
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                               
                           i++;
                           continue;
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                           }
                            }else {
                              
                              i++;
                              continue;
                          }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                        }
                         }else if(i3.equals("false") && !i4.equals("false")){
                             
                           String in = buffer.get(i).get(0);
                           int inn = Integer.parseInt(in);
                           fu2 = tbins.getValueAt(inn,3).toString();
                           
                           if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            i++;
                            continue;
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           i++;
                           continue;
                           }
                            }
                        }else{ 
                            
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                        }
                           
                        }else
                           if(!i3.equals("false") && !i4.equals("false")){
                                String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            fu2 = tbins.getValueAt(inn,3).toString();
                            
                            if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                           
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           }
                            }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                        }
                        
                             if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           }
                            }
                            
                         }
                             i++;
                           continue;
                           }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkReservationStation("add");
                        
                        if(ind != -1){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Add"+add;
                            inserInFunctionalUnit(des,ld);                       
                            add++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkReservationStation("add");
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                             String ld = "Add"+add;
                            inserInFunctionalUnit(des,ld);                       
                            add++;
                            buffer.get(i).set(2,"true");
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            String ld = "Add"+add;
                            inserInFunctionalUnit(des,ld);                       
                            add++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }           
        }//sub 
        else if(op.equalsIgnoreCase("subd") || op.equalsIgnoreCase("sub.d")){
                    
                    String indx;
                    int inx;
                    resrv = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    
                    if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                        
                        String i3,i4,fu1,fu2;
                        boolean b3,b4;
                        i3 = buffer.get(i).get(8);
                        i4 = buffer.get(i).get(9);
                        
                        if(i3.equals("false") && i4.equals("false")){
                            
                                    time = buffer.get(i).get(10);
                                    int tim = Integer.parseInt(time);
                                    String st = buffer.get(i).get(3);
                                    int ind = Integer.parseInt(st);
                                    tbresv.setValueAt(tim, ind, 0);
                                        if(tim == 0){
                                        ldindex = buffer.get(i).get(3);
                                        int lindex = Integer.parseInt(ldindex);
                                        tbresv.setValueAt(" ", lindex, 0);
                                        tbresv.setValueAt("No", lindex, 2);
                                        tbresv.setValueAt(" ", lindex, 3);
                                        String adrs = tbresv.getValueAt(lindex, 4).toString();
                                        String adrs2 =tbresv.getValueAt(lindex, 5).toString();
                                        tbresv.setValueAt(" ", lindex, 4);
                                        tbresv.setValueAt(" ", lindex, 5);
                                        des = buffer.get(i).get(5);
                                        String loc = des.substring(1, des.length());
                                        int n = Integer.parseInt(loc);
                                        n=n/2;
                                        tbfu.setValueAt("M("+adrs+"+"+adrs2+")", 0,n);
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+Clock, r, 3);
                                        
                                        buffer.remove(i);
                                        //i=0;
                                        continue;
                                    } else{
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+(Clock), r, 2);
                                        tim--;
                                        time ="";
                                        time =""+tim;
                                        buffer.get(i).set(10, time);
                                        
                                        i++;
                                        continue;
                                }
                         }else if(!i3.equals("false") && i4.equals("false")){
                            
                             String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            
                             if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                             
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                               
                           i++;
                           continue;
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           i++;
                           continue;
                           }
                            }else {
                             
                              i++;
                              continue;
                          }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                        }
                         }else if(i3.equals("false") && !i4.equals("false")){
                             
                           String in = buffer.get(i).get(0);
                           int inn = Integer.parseInt(in);
                           fu2 = tbins.getValueAt(inn,3).toString();
                           
                           if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            i++;
                            continue;
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           i++;
                           continue;
                           }
                            }
                        }else{ 
                            
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                        }
                           
                        }else
                           if(!i3.equals("false") && !i4.equals("false")){
                                String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            fu2 = tbins.getValueAt(inn,3).toString();
                            
                            if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                           
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           }
                            }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                        }
                        
                             if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           }
                           
                             }
                            
                         }
                             i++;
                           continue;
                           }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkReservationStation("sub");
                        
                        if(ind != -1){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Sub"+sub;
                            inserInFunctionalUnit(des,ld);                       
                            sub++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkReservationStation("sub");
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                             String ld = "Sub"+sub;
                            inserInFunctionalUnit(des,ld);                       
                            sub++;
                            buffer.get(i).set(2,"true");
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            String ld = "Sub"+sub;
                            inserInFunctionalUnit(des,ld);                       
                            sub++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }   
        }
         //MUL
         else if(op.equalsIgnoreCase("multd") || op.equalsIgnoreCase("mult.d")){
            
                    String indx;
                    int inx;
                    resrv = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    
                    if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                       
                        String i3,i4,fu1,fu2;
                        boolean b3,b4;
                        i3 = buffer.get(i).get(8);
                        i4 = buffer.get(i).get(9);
                        
                        if(i3.equals("false") && i4.equals("false")){
                            
                                    time = buffer.get(i).get(10);
                                    int tim = Integer.parseInt(time);
                                    String st = buffer.get(i).get(3);
                                    int ind = Integer.parseInt(st);
                                    tbresv.setValueAt(tim, ind, 0);
                                        if(tim == 0){
                                        ldindex = buffer.get(i).get(3);
                                        int lindex = Integer.parseInt(ldindex);
                                        tbresv.setValueAt(" ", lindex, 0);
                                        tbresv.setValueAt("No", lindex, 2);
                                        tbresv.setValueAt(" ", lindex, 3);
                                        String adrs = tbresv.getValueAt(lindex, 4).toString();
                                        String adrs2 =tbresv.getValueAt(lindex, 5).toString();
                                        tbresv.setValueAt(" ", lindex, 4);
                                        tbresv.setValueAt(" ", lindex, 5);
                                        des = buffer.get(i).get(5);
                                        String loc = des.substring(1, des.length());
                                        int n = Integer.parseInt(loc);
                                        n=n/2;
                                        tbfu.setValueAt("M("+adrs+"+"+adrs2+")", 0,n);
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+Clock, r, 3);
                                        
                                        buffer.remove(i);
                                        //i=0;
                                        continue;
                                    } else{
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+(Clock), r, 2);
                                        tim--;
                                        time ="";
                                        time =""+tim;
                                        buffer.get(i).set(10, time);
                                        
                                        i++;
                                        continue;
                                }
                         }else if(!i3.equals("false") && i4.equals("false")){
                             
                             String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                           
                             if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                             
                           String fu3 = getFunctionalUnit(fu1);
                           
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                             
                           i++;
                           continue;
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           i++;
                           continue;
                           }
                            }else {
                              
                              i++;
                              continue;
                          }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                        }
                         }else if(i3.equals("false") && !i4.equals("false")){
                             
                           String in = buffer.get(i).get(0);
                           int inn = Integer.parseInt(in);
                           fu2 = tbins.getValueAt(inn,3).toString();
                           
                           if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            i++;
                            continue;
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           i++;
                           continue;
                           }
                            }
                        }else{ 
                            
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                        }
                           
                        }else
                           if(!i3.equals("false") && !i4.equals("false")){
                            String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            fu2 = tbins.getValueAt(inn,3).toString();
                            
                            if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                           
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           }
                            }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                        }
                        
                             if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           }
                           
                             }
                            
                         }
                             i++;
                           continue;
                           }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkReservationStation("mult");
                        
                        if(ind != -1){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);//////////
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Mult"+mul;
                            inserInFunctionalUnit(des,ld);                       
                            mul++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkReservationStation("mult");
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                             String ld = "Mult"+mul;
                            inserInFunctionalUnit(des,ld);                       
                            mul++;
                            buffer.get(i).set(2,"true");
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);////////
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            String ld = "Mult"+mul;
                            inserInFunctionalUnit(des,ld);                       
                            mul++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);///////////
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }       
        }
         //DIV
        else if(op.equalsIgnoreCase("divd") || op.equalsIgnoreCase("div.d")){
                    String indx;
                    int inx;
                    resrv = buffer.get(i).get(1);
                    fu = buffer.get(i).get(2);
                    
                    if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("true")){
                       
                        String i3,i4,fu1,fu2;
                        boolean b3,b4;
                        i3 = buffer.get(i).get(8);
                        i4 = buffer.get(i).get(9);
                        
                        if(i3.equals("false") && i4.equals("false")){
                           
                                    time = buffer.get(i).get(10);
                                    int tim = Integer.parseInt(time);
                                    String st = buffer.get(i).get(3);
                                    int ind = Integer.parseInt(st);
                                    tbresv.setValueAt(tim, ind, 0);
                                        if(tim == 0){
                                        ldindex = buffer.get(i).get(3);
                                        int lindex = Integer.parseInt(ldindex);
                                        tbresv.setValueAt(" ", lindex, 0);
                                        tbresv.setValueAt("No", lindex, 2);
                                        tbresv.setValueAt(" ", lindex, 3);
                                        String adrs = tbresv.getValueAt(lindex, 4).toString();
                                        String adrs2 =tbresv.getValueAt(lindex, 5).toString();
                                        tbresv.setValueAt(" ", lindex, 4);
                                        tbresv.setValueAt(" ", lindex, 5);
                                        des = buffer.get(i).get(5);
                                        String loc = des.substring(1, des.length());
                                        int n = Integer.parseInt(loc);
                                        n=n/2;
                                        tbfu.setValueAt("M("+adrs+"+"+adrs2+")", 0,n);
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+Clock, r, 3);
                                        
                                        buffer.remove(i);
                                        //i=0;
                                        continue;
                                    } else{
                                        row = buffer.get(i).get(0);
                                        int r = Integer.parseInt(row);
                                        tbrun.setValueAt(""+(Clock), r, 2);
                                        tim--;
                                        time ="";
                                        time =""+tim;
                                        buffer.get(i).set(10, time);
                                       
                                        i++;
                                        continue;
                                }
                         }else if(!i3.equals("false") && i4.equals("false")){
                            
                             String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                           
                             if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                           
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                           
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                              
                           i++;
                           continue;
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           i++;
                           continue;
                           }
                            }else {
                             
                              i++;
                              continue;
                          }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           i++;
                           continue;
                        }
                         }else if(i3.equals("false") && !i4.equals("false")){
                             
                           String in = buffer.get(i).get(0);
                           int inn = Integer.parseInt(in);
                           fu2 = tbins.getValueAt(inn,3).toString();
                           
                           if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            i++;
                            continue;
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           i++;
                           continue;
                           }
                            }
                        }else{ 
                            
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           i++;
                           continue;
                        }
                           
                        }else
                           if(!i3.equals("false") && !i4.equals("false")){
                                String in = buffer.get(i).get(0);
                            int inn = Integer.parseInt(in);
                            fu1 = tbins.getValueAt(inn,2).toString();
                            fu2 = tbins.getValueAt(inn,3).toString();
                            
                            if(fu1.contains("F") || fu1.contains("f")){
                            b3 = checkFunctionalUnit(fu1);
                          if(b3 == true){
                           String fu3 = getFunctionalUnit(fu1);
                           if(fu3.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "R("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("R("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                           
                           }else if(fu3.contains("add") ||fu3.contains("Sub")||fu3.contains("Add")||fu3.contains("ADD") ||fu3.contains("SUB") ||fu3.contains("sub") ||fu3.contains("load") ||fu3.contains("DIV") ||fu3.contains("Mult")||
                                   fu3.contains("LOAD") ||fu3.contains("Load")||fu3.contains("store") ||fu3.contains("Store")||fu3.contains("STORE") ||fu3.contains("mul") ||fu3.contains("MUL") ||fu3.contains(" div")||fu3.contains("Div") )
                           {
                           
                           }else{
                                 indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu3+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu3+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);  
                           }
                            }
                        }else{  
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(6, "M("+fu1+")");
                           buffer.get(i).set(8, "false");
                           tbresv.setValueAt("M("+fu1+")", inx, 4);
                           tbresv.setValueAt(" ", inx, 6);
                        }
                        
                             if(fu2.contains("F") || fu2.contains("f")){
                           b4 = checkFunctionalUnit(fu2);
                           if(b4 == true){
                           String fu4 = getFunctionalUnit(fu2);
                           if(fu4.equals(" ")){
                           indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "R("+fu2+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("R("+fu2+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);
                           }else if(fu4.contains("add") ||fu4.contains("Add")||fu4.contains("ADD") ||fu4.contains("SUB") ||fu4.contains("Div")||fu4.contains("sub") ||fu4.contains("load") ||fu4.contains("DIV") ||fu4.contains("Mult")||
                                   fu4.contains("LOAD")||fu4.contains("Sub") ||fu4.contains("Load")||fu4.contains("Store")||fu4.contains("store") ||fu4.contains("STORE") ||fu4.contains("mul") ||fu4.contains("MUL") ||fu4.contains(" div") )
                           {
                            
                           }else{
                             indx = buffer.get(i).get(3);
                           inx = Integer.parseInt(indx);
                           buffer.get(i).set(7, "M("+fu4+")");
                           buffer.get(i).set(9, "false");
                           tbresv.setValueAt("M("+fu4+")", inx, 5);
                           tbresv.setValueAt(" ", inx, 7);  
                           }
                            
                             }
                            
                            
                         }
                             i++;
                           continue;
                           }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("true")){
                        
                        int ind = checkReservationStation("div");
                        
                        if(ind != -1){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                          
                      }else{
                            i++;
                            continue;
                        }
                    }else if(resrv.equalsIgnoreCase("true") && fu.equalsIgnoreCase("false")){
                        des = buffer.get(i).get(5);
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true){
                            String ld = "Div"+div;
                            inserInFunctionalUnit(des,ld);                       
                            div++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                       
                    }else if(resrv.equalsIgnoreCase("false") && fu.equalsIgnoreCase("false")){
                        int ind = checkReservationStation("div");
                        des = buffer.get(i).get(5);
                        
                        boolean bl=checkFunctionalUnit(des);
                        if(bl == true && ind != -1){
                             String ld = "Div"+div;
                            inserInFunctionalUnit(des,ld);                       
                            div++;
                            buffer.get(i).set(2,"true");
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else if(ind == -1 && bl==true){
                            String ld = "Div"+div;
                            inserInFunctionalUnit(des,ld);                       
                            div++;
                            buffer.get(i).set(2,"true");
                            i++;
                            continue;
                        }else if(ind != -1 && bl==false){
                            buffer.get(i).set(1, "true");
                            buffer.get(i).set(3,""+ind);
                            tbresv.setValueAt("Yes", ind, 2);
                            tbresv.setValueAt(buffer.get(i).get(4), ind, 3);
                            i++;
                            continue;
                        }else{
                            i++;
                            continue;
                        }
                        
                        
             }       
        }
      }
    }
}


    private void updateReservationStation(int index, String address1, String address2) {
        
        String src1,src2;
        int n;
        if(address1.contains("F") || address1.contains("f")){
            String loc = address1.substring(1, address1.length());
            n = Integer.parseInt(loc);
            n=n/2;
            src1 = tbfu.getValueAt(0, n).toString();
            
            if(src1.contains("load") || src1.contains("LOAD")|| src1.contains("Load") ||src1.contains("store") ||src1.contains("STORE")|| src1.contains("Store") 
                    ||src1.contains("add") ||src1.contains("ADD") || src1.contains("Add")||src1.contains("sub") ||src1.contains("SUB") || src1.contains("Sub")||
                    src1.contains("mult") ||src1.contains("MULT") || src1.contains("Mult")||src1.contains("div") || src1.contains("Div")||src1.contains("DIV"))
            {
                
                tbresv.setValueAt(src1, index, 6);
                tbresv.setValueAt(" ", index, 4);

            }else if(src1.equals(" ")){
                tbresv.setValueAt(" ", index, 4);
                tbresv.setValueAt(" ", index, 6);
               
            }else{
                tbresv.setValueAt(src1, index, 4);
                tbresv.setValueAt(" ", index, 6);
            }
            
        }else{
            tbresv.setValueAt(address1, index, 4);
            tbresv.setValueAt(" ", index, 6);
        }
        if(address2.contains("F") || address2.contains("f")){
            String loc = address2.substring(1, address2.length());
            n = Integer.parseInt(loc);
            n=n/2;
            src2 = tbfu.getValueAt(0, n).toString();
            if(src2.contains("Load") || src2.contains("LOAD") ||src2.contains("Store") ||src2.contains("STORE") 
                    ||src2.contains("Add") ||src2.contains("ADD") ||src2.contains("Sub") ||src2.contains("SUB") ||
                    src2.contains("Mult") ||src2.contains("MULT") ||src2.contains("Div") ||src2.contains("DIV"))
            {
                tbresv.setValueAt(src2, index, 7);
                tbresv.setValueAt(" ", index, 5);

            }else if(src2.equals(" ")){
                tbresv.setValueAt(" ", index, 5);
                 tbresv.setValueAt(" ", index, 7);
                
            }else{
                tbresv.setValueAt(src2, index, 5);
                 tbresv.setValueAt(" ", index, 7);
            }
        }else{
            tbresv.setValueAt(address2, index, 5);
            tbresv.setValueAt(" ", index, 7);
        }
        tbresv.setValueAt("Yes", index, 2);
    }
    
public void reset__(){
        
instline=null;
instruction.clear();
buffer.clear();
reservation.clear();
instruction = new ArrayList<ArrayList<String>>();
buffer = new ArrayList<ArrayList<String>>();
reservation = new ArrayList<ArrayList<String>>();
 Clock = 0;
 click =0;
 load_index=0;
ins_index=0;load=1;store=1;add=1;sub=1;mul=1;div=1;
String des_reg="";
 rowindex=0;colindex=0;s=1;a=1;m=1;d=1;
 load_row_index=0;load_col_index=0;
 res_row_index=0;res_col_index=0;
 run_row_index=0;run_col_index=0;
 value=1; 
 insarea.setText("");
 clock.setText("0");
 noinst.setText("0");
        for(int i=0;i<1000;i++){
         for(int j=0;j<4;j++){
        tbins.setValueAt(" ", i, j);
            }
        }
        
         for(int i=0;i<1000;i++){
            for(int j=0;j<4;j++){
        tbrun.setValueAt(" ", i, j);
            }
        }
          for(int i=0;i<2;i++){
              tbload.setValueAt("No", i, 1);
        tbload.setValueAt(" ", i, 2);
            
        }
          
     for(int i=0;i<5;i++){
         
        tbresv.setValueAt(" ", i, 0);
        tbresv.setValueAt("No", i, 2);
        tbresv.setValueAt(" ", i, 3);
        tbresv.setValueAt(" ", i, 4);
        tbresv.setValueAt(" ", i, 5);
        tbresv.setValueAt(" ", i, 6);
        tbresv.setValueAt(" ", i, 7);
        
        
        }
         
     //tbfu
             
         for(int j=0;j<16;j++)
        {
        tbfu.setValueAt(" ",0, j);
        }
        
    }

    private void next() {
        
        if(!tbins.getValueAt(0,0).equals(" ")){
     Clock++;
     System.out.println(Clock);
     if(Clock < instruction.size()+1){
         
     String s1 = ""+Clock;
     clock.setText(s1);
     
     //Resolve buffer////
     
      resolveBuffer();  
   
      
        if(tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("ld") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("l.d")) {
            
            boolean b=true,b1=true;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkLoadBuffer();
            
            if(index != -1){
                String address = checkSource(rowindex,1);
                String nl =checkSource(rowindex,2);
                if(nl != null){
                    address = address+"+"+checkSource(rowindex,2);
                }
                updateLoadBuffer(index,address);
                
            }else{
                b=false;
                
            }
           
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                
                if(b1 == true){
                    String ld = "Load"+load;
                    inserInFunctionalUnit(des_reg,ld);
                    load++;
                }
                
            }
            
            if(b==true && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==false && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==true && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }else if(b==false && b1==false){
                
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ll);
                
            }
            
            rowindex++;
            
     }else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("sd") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("s.d")) {
            
            boolean b=true,b1=true;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkLoadBuffer();
            
            if(index != -1){
                String address = checkSource(rowindex,1);
                String nl = checkSource(rowindex,2);
                
                if(nl != null){
                    address = address+"+"+checkSource(rowindex,2);
                }
                updateLoadBuffer(index,address);
                
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Store"+store;
                    inserInFunctionalUnit(des_reg,ld);
                    store++; 
                    
                }
                
            }
            
            if(b==true && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==false && b1==true){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==true && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }else if(b==false && b1==false){
                int size = instruction.get(rowindex).size();
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                if(size == 4){
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,3).toString());   
                }else{
                 buffer.get(buffer.size()-1).add(tbins.getValueAt(rowindex,2).toString());
                 buffer.get(buffer.size()-1).add(null);      
                }
                buffer.get(buffer.size()-1).add(ls);
                
            }
            rowindex++;
            
     }
     //ADD
     else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("addd")||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("add.d")) {
            
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("add");
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Add"+add;
                    inserInFunctionalUnit(des_reg,ld);
                    add++; 
                    
                }
            }
            
            if(b==true && b1==true){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(la);
                tbresv.setValueAt(la, index, 0);
            }else if(b==false && b1==true){
               
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(la);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(la);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                   
                buffer.get(buffer.size()-1).add(la);
            }
            
            rowindex++;
            
     }
     //SUB
     else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("subd")||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("sub.d")) {
            
           
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("sub");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Sub"+sub;
                    inserInFunctionalUnit(des_reg,ld);
                    sub++; 
                    
                }
            }
            
            if(b==true && b1==true){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                 //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(lsb);
                tbresv.setValueAt(lsb, index, 0);
                
            }else if(b==false && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(lsb);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(lsb);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                   
                buffer.get(buffer.size()-1).add(lsb);
            }
            
            rowindex++;
      
            
     }
     //MUL
      else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("multd") ||tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("multd")) {
            
           
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("mult");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                 
                if(b1 == true){
                    String ld = "Mult"+mul;
                    inserInFunctionalUnit(des_reg,ld);
                    mul++; 
                    
                }
            }
            
            if(b==true && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(lm);
                tbresv.setValueAt(lm, index, 0);
                
            }else if(b==false && b1==true){
               
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(lm);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                buffer.get(buffer.size()-1).add(lm);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                buffer.get(buffer.size()-1).add(lm);
            }
            
            rowindex++;        
     }
        //DIV
    else if (tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("divd") || tbins.getValueAt(rowindex, colindex).toString().equalsIgnoreCase("div.d")) {
            
          
            boolean b=true,b1=true;
            String f1,f2;
             String op = tbins.getValueAt(rowindex,colindex).toString();
             des_reg = tbins.getValueAt(rowindex, colindex + 1).toString();
             insertInRunningTable(op,rowindex,colindex);
             insertInRunningTable(""+(Clock),rowindex,colindex+1);
            int index = checkReservationStation("div");
            
            if(index != -1){
                String address1 = tbins.getValueAt(rowindex, 2).toString();
                String address2 = tbins.getValueAt(rowindex, 3).toString();
                
                updateReservationStation(index,address1,address2);
                String opr = tbins.getValueAt(rowindex,0).toString();
                tbresv.setValueAt(opr, index,3);
            }else{
                b=false;
            }
            
            if(des_reg.contains("F") || des_reg.contains("f")){
                
                 b1 = checkFunctionalUnit(des_reg);
                if(b1 == true){
                    String ld = "Div"+div;
                    inserInFunctionalUnit(des_reg,ld);
                    div++; 
                    
                }
            }
            
            if(b==true && b1==true){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
                //}else{
                  //  buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.equals(" ")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                buffer.get(buffer.size()-1).add(ld);
                tbresv.setValueAt(ld, index, 0);
                
            }else if(b==false && b1==true){
                
               buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add(ld);
                
            }else if(b==true && b1==false){
                
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                //f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                //f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                //if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        //f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,4).toString());
                //}else{
                    //buffer.get(buffer.size()-1).add(f1);
                //}
                //if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                   // f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(tbresv.getValueAt(index,5).toString());
               // }else{
                    //buffer.get(buffer.size()-1).add(f2);
                //}
                f1 = tbresv.getValueAt(index,6).toString();
                f2 = tbresv.getValueAt(index,7).toString();
                if(f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if(f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   
                   
                buffer.get(buffer.size()-1).add(ld);
                
            }else if(b==false && b1==false){
               
                buffer.add(new ArrayList<String>());
                buffer.get(buffer.size()-1).add(""+rowindex);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add(""+index);
                buffer.get(buffer.size()-1).add(op);
                buffer.get(buffer.size()-1).add(des_reg);
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("false");
                buffer.get(buffer.size()-1).add("true");
                buffer.get(buffer.size()-1).add("true");
                /*
                f1 = getFunctionalUnit(tbresv.getValueAt(index,4).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,5).toString());
                if(f1.contains(" ") || f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f1);
                }
                if(f2.contains(" ") || f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add("false");
                }else{
                    buffer.get(buffer.size()-1).add(f2);
                }
                f1 = getFunctionalUnit(tbresv.getValueAt(index,6).toString());
                f2 = getFunctionalUnit(tbresv.getValueAt(index,7).toString());
                if( f1.contains("Sub")|| f1.contains("Add")|| f1.contains("add") ||f1.contains("ADD") ||f1.contains("sub") ||f1.contains("SUB") || f1.contains("Div")||f1.contains("load") ||f1.contains("DIV") ||
                        f1.contains("LOAD") || f1.contains("Load")|| f1.contains("Store")||f1.contains("store") ||f1.contains("STORE") ||f1.contains("mult")|| f1.contains("Mult") ||f1.contains("MULT") ||f1.contains("div")){
                    buffer.get(buffer.size()-1).add(f1);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                if( f2.contains("add")|| f2.contains("Sub")|| f2.contains("Add") || f2.contains("ADD") ||f2.contains("sub") ||f2.contains("SUB") ||f2.contains("load")|| f2.contains("Div") ||f2.contains("DIV") ||
                    f2.contains("LOAD") || f2.contains("Store")|| f2.contains("Load")|| f2.contains("store") || f2.contains("STORE") || f2.contains("mult") || f2.contains("MULT") || f2.contains("Mult")||f2.contains("div")){
                    buffer.get(buffer.size()-1).add(f2);
                }else{
                    buffer.get(buffer.size()-1).add("false");
                }
                   */
                buffer.get(buffer.size()-1).add(ld);
            }
            
            rowindex++;    
            
     }
           
    }else{
        
             
            
             if(buffer.size()!=0){
                 resolveBuffer();
                 
                 if(buffer.size() == 0){
                String s1 = ""+Clock;
                clock.setText(s1);
                
             }
             }
             
             if(buffer.size() != 0){
             String s1 = ""+Clock;
             clock.setText(s1);
             }
          
         
    
     }
     
           
    }else{
    JOptionPane.showMessageDialog(rootPane, "ERROR!!! Please insert the instructions!!");
 
    }
    }
   
}
