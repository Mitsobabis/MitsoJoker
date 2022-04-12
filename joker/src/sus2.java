import javax.swing.*;

public class sus2 {

    sus2(){
        int max = 40;
        int min = 1;
        int max2 = 20;

        var s1 = sus.getInt1();
        var s2 = sus.getInt2();
        var s3 = sus.getInt3();
        var s4 = sus.getInt4();
        var s5 = sus.getInt5();
        var s6 = sus.getInt6();
        String result = s1 + " | " + s2 + " | " + s3 + " | " + s4 + " | " + s5 + " Joker: " + s6;

        String firstnumber = JOptionPane.showInputDialog("1st Number");
        System.out.println("[LOG] Input(1): " + firstnumber);
        if (firstnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (firstnumber.isBlank() || firstnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }
        String secondnumber = JOptionPane.showInputDialog("2nd Number");
        System.out.println("[LOG] Input(2): " + secondnumber);
        if (secondnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (secondnumber.isBlank() || secondnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }
        String thirdnumber = JOptionPane.showInputDialog("3rd Number");
        System.out.println("[LOG] Input(3): " + thirdnumber);
        if (thirdnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (thirdnumber.isBlank() || thirdnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }
        String fourthnumber = JOptionPane.showInputDialog("4th Number");
        System.out.println("[LOG] Input(4): " + fourthnumber);
        if (fourthnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (fourthnumber.isBlank() || fourthnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }
        String fifthnumber = JOptionPane.showInputDialog("5th Number");
        System.out.println("[LOG] Input(5): " + fifthnumber);
        if (fifthnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (fifthnumber.isBlank() || fifthnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }
        String sixthnumber = JOptionPane.showInputDialog("Joker");
        System.out.println("[LOG] Input(6): " + sixthnumber);
        if (sixthnumber == null) {
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        } else if (sixthnumber.isBlank() || sixthnumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Only Integer Values are accepted");
            System.out.println("[LOG] Shutting down...");
            System.exit(0);
        }

       try{
          var v1 = Integer.parseInt(firstnumber);
          var v2 = Integer.parseInt(secondnumber);
          var v3 = Integer.parseInt(thirdnumber);
          var v4 = Integer.parseInt(fourthnumber);
          var v5 = Integer.parseInt(fifthnumber);
          var v6 = Integer.parseInt(sixthnumber);
          if (v1 > max) v1 = max;
          if (v2 > max) v2 = max;
          if (v3 > max) v3 = max;
          if (v4 > max) v4 = max;
          if (v5 > max) v5 = max;
          if (v6 > max2) v6 = max2;
          if (v1 < min) v1 = min;
          if (v2 < min) v2 = min;
          if (v3 < min) v3 = min;
          if (v4 < min) v4 = min;
          if (v5 < min) v5 = min;
          if (v6 < min) v6 = min;
          var es = 0;

          if(s1 == v1){
              es = es + 100 / 6;
          }else if(s2 == v2){
              es = es + 100 / 6;
          }else if (s3 == v3){
              es = es + 100 / 6;
          }else if(s4 == v4){
              es = es + 100 / 6;
          }else if(s5 == v5){
              es = es + 100 / 6;
          }else if(s6 == v6){
              es = es + 100 / 6;
          }
          JOptionPane.showMessageDialog(null, "Your numbers are: " + v1 + " | " + v2 + " | " + v3 + " | " + v4 + " | " + v5 + " Joker: " + v6);
          System.out.println("[LOG] User's input: " + v1 + " | " + v2 + " | " + v3 + " | " + v4 + " | " + v5 + " Joker: " + v6);
          JOptionPane.showMessageDialog(null, "The lucky numbers were: " + result);
           System.out.println("[LOG] Lucky numbers: " + result);
          JOptionPane.showInternalMessageDialog(null, "You correctly guessed a " + es + "% of numbers");
           System.out.println("[LOG] User's Right/Wrong Guess Rate: " + es + "%");
          System.out.println("The list was refilled");
          new sus2();
       }catch (NumberFormatException e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "String Input is not allowed!");
           new sus2();
       }
    }
}