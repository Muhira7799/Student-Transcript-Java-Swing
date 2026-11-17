import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentTranscript extends JFrame implements ActionListener {

    JTextField name, mark1, mark2, mark3;
    JTextArea transcript;
    JButton generate;

    StudentTranscript() {
        setTitle("Student Transcript");
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Mark 1:"));
        mark1 = new JTextField(10);
        add(mark1);

        add(new JLabel("Mark 2:"));
        mark2 = new JTextField(10);
        add(mark2);

        add(new JLabel("Mark 3:"));
        mark3 = new JTextField(10);
        add(mark3);

        generate = new JButton("Generate Transcript");
        add(generate);

        transcript = new JTextArea(10, 25);
        transcript.setEditable(false);
        add(new JScrollPane(transcript));

        generate.addActionListener(this);

        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String studentName = name.getText();

            double a = Double.parseDouble(mark1.getText());
            double b = Double.parseDouble(mark2.getText());
            double c = Double.parseDouble(mark3.getText());

            if (studentName.trim().isEmpty()
                    || a < 0 || a > 100
                    || b < 0 || b > 100
                    || c < 0 || c > 100) {
                transcript.setText(
                    "Enter a name and marks between 0 and 100."
                );
                return;
            }

            double total = a + b + c;
            double average = total / 3.0;

            String grade;

            if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            transcript.setText(
                "STUDENT TRANSCRIPT\n"
                + "------------------------\n"
                + "Name: " + studentName + "\n"
                + "Mark 1: " + a + "\n"
                + "Mark 2: " + b + "\n"
                + "Mark 3: " + c + "\n"
                + "Total: " + total + "\n"
                + "Average: " + String.format("%.2f", average) + "\n"
                + "Grade: " + grade
            );

        } catch (NumberFormatException ex) {
            transcript.setText("Please enter valid marks.");
        }
    }

    public static void main(String[] args) {
        new StudentTranscript();
    }
}