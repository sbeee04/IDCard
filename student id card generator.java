package Visual;

import java.awt.*;
import java.awt.event.*;

public class mc extends Frame implements ActionListener
{
    Label lblHead, lblSName, lblCourse, lblANo, lblDOB, lblFName, lblAdd, lblMNo;
    TextField txtSName, txtCourse, txtANo, txtDOB, txtFName, txtAdd, txtMNo;
    Button ViewID;
    //Image img;

    mc()
    {
        //setLayout(new FlowLayout());
        //this.setLayout(null);

       setLayout(null);
        lblHead = new Label("Enter Student’s Details");
        lblSName = new Label("Student's Name : ");
        lblCourse = new Label("Course : ");
        lblANo = new Label("Admission No. : ");
        lblDOB = new Label("Date of Birth : ");
        lblFName = new Label("Father's Name : ");
        lblAdd = new Label("Address : ");
        lblMNo = new Label("Contact No. : ");
        txtSName = new TextField();
        txtCourse = new TextField();
        txtANo = new TextField();
        txtDOB = new TextField();
        txtFName = new TextField();
        txtAdd = new TextField();
        txtMNo = new TextField();
        ViewID = new Button("View Student ID Card");
        lblHead.setBounds(200, 0, 200, 20);
        lblSName.setBounds(0, 25, 100, 20);
        txtSName.setBounds(120, 25, 200, 20);
        lblCourse.setBounds(0, 50, 100, 20);
        txtCourse.setBounds(120, 50, 200, 20);
        lblANo.setBounds(0, 75, 100, 20);
        txtANo.setBounds(120, 75, 200, 20);
        lblDOB.setBounds(0, 100, 100, 20);
        txtDOB.setBounds(120, 100, 200, 20);
        lblFName.setBounds(0, 125, 100, 20);
        txtFName.setBounds(120, 125, 200, 20);
        lblAdd.setBounds(0, 150, 100, 20);
        txtAdd.setBounds(120, 150, 200, 20);
        lblMNo.setBounds(0, 175, 100, 20);
        txtMNo.setBounds(120, 175, 200, 20);
        ViewID.setBounds(90, 210, 150, 30);
        add(lblHead);
        add(lblCourse);
        add(txtCourse);
        add(lblSName);
        add(txtSName);
        add(lblANo);
        add(txtANo);
        add(lblDOB);
        add(txtDOB);
        add(lblFName);
        add(txtFName);
        add(lblAdd);
        add(txtAdd);
        add(lblMNo);
        add(txtMNo);
        add(ViewID);
        ViewID.addActionListener(this);

        setBackground(Color.white);


    }
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }

    public void paint(Graphics g) {
        Color custColor = new Color(77, 0, 19);
        g.setColor(custColor);
        g.fillRoundRect(7, 280, 350, 57, 30, 30);
        g.fillRect(7, 290, 350, 47);
        g.setColor(Color.white);
        g.drawString("K.L.N College of Engineering", 90, 305);
        g.drawString("(Autonomous College)", 110, 325);
        g.setColor(Color.black);
        g.drawString("IDENTITY CARD", 125, 352);
        g.drawString("Student's Name : " + txtSName.getText(), 15, 367);
        g.drawString("Course : " + txtCourse.getText(), 15, 392);
        g.drawString("Admission No. :  " + txtANo.getText(), 15, 417);
        g.drawString("Date of Birth : " + txtDOB.getText(), 15, 442);
        g.drawString("Father's Name : " + txtFName.getText(), 15, 467);
        g.drawString("Address : " + txtAdd.getText(), 15, 492);
        g.drawString("Contact No. : " + txtMNo.getText(), 15, 517);
        g.drawRoundRect(7, 280, 350, 245, 30, 30);




    }
    public static void main(String ar[])
    {
        mc b=new mc();
        b.setVisible(true);
        b.setSize(500,500);
        b.setTitle("just try");

    }
}
