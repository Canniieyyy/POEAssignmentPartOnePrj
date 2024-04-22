/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POEAssignmentPartOnePrj {
    
    static Login objLogin = new Login();
   
    public static void main(String[] args) {
       
 //Declaring of variable to store name, surname and username
     
   
   
       
     String name;
     String surname;
     String userName;
     String password;
     
     
     
 //Method for asking user for their input
     
     name = JOptionPane.showInputDialog(null,"Please Enter first name");
     surname = JOptionPane.showInputDialog(null,"Please Enter last name");
     JOptionPane.showMessageDialog(null,"Hello" + name + surname);
     userName = JOptionPane.showInputDialog(null,"Please create a username, please ensure that your username is no more than 5 charecters and consits of an underscore");
     password = JOptionPane.showInputDialog(null, "Please create a password, Please ensure that your username begins with one upppercase letter, followed by one lowercase letter, followed by any one number from 1 to 9, followed by any of these special charecters(!@#$%^&*)");
     
     
 //loop for attemtpting the username until parameters are met
     
     while (!isValid(userName)){
         JOptionPane.showMessageDialog(null,"Username is not correctly formatted,please ensure that your username is no more than 5 charecters and consits of an underscore");
         userName = JOptionPane.showInputDialog(null,"Please create a username,please ensure that your username is no more than 5 charecters and consits of an underscore");
     }
     
     
     
        JOptionPane.showMessageDialog(null,"Valid Username is:" + userName);
        
//loop for attemtpting the password until parameters are met
        
      while (!isTrue(password)){
          JOptionPane.showMessageDialog(null,"password is not correctly formatted, please ensure that your password begins with one upppercase letter, followed by one lowercase letter, followed by any one number from 1 to 9, followed by any of these special charecters(!@#$%^&*)");
          password = JOptionPane.showInputDialog(null, "Please create your password, please ensure that your username begins with one upppercase letter, followed by one lowercase letter, followed by any one number from 1 to 9, followed by any of these special charecters(!@#$%^&*)");
          
      }
      
      JOptionPane.showMessageDialog(null,"Valid Username is:" + password);
      
    //Login
   objLogin.checkUserName();
   objLogin.checkPasswordComplexity();
   objLogin.loginUser(userName, password);
    
    
    }
    
    
    
    //Method for matching username pattern    
    public static boolean isValid (String userName){
    
    Pattern p = Pattern.compile("_");
    Matcher m = p.matcher(userName);
    
    return m.find();
    
    }
    
//Method for matching if password pattern is within parameters
    
    
 public static boolean isTrue (String password){
    
    Pattern o = Pattern.compile("([A-Z])([a-z])([1-9])([!@#$%^&*])");
    Matcher n = o.matcher(password);
    
    return n.find();
    
    }
    
    
    
}
