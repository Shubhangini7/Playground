import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
  
  private static Pattern userName = Pattern.compile("^[a-zA-Z0-9_-]*$");
  private static Pattern emailId = Pattern.compile("^[a-z0-9._@]*$");
  private static Pattern password = Pattern.compile("^[a-zA-Z@#$%0-9]*$");
  
  public static boolean	validName(String un)
  {
    Matcher m = userName.matcher(un);
    if(m.matches())
    {
      return true;
    }
    return false;
  }
  
  public static boolean	validEmail(String email)
  {
    Matcher m = emailId.matcher(email);
    if(m.matches())
    {
      return true;
    }
    return false;
  }
 
  public static boolean	validPsw(String psw)
  {
    Matcher m = password.matcher(psw);
    if(m.matches())
    {
      return true;
    }
    return false;
  }
  
  public static void main(String a[])
  {
    Scanner sc = new Scanner(System.in);
    String user_name = sc.nextLine();  
    String email_id = sc.nextLine();
    String password = sc.nextLine();
    
    System.out.println("Is "+ user_name+" a valid user name? " +validName(user_name));
    System.out.println("Is " +email_id+ " a valid email address? "+validEmail(email_id));
    System.out.println("Is " +password +" a valid password? " +validPsw(password));
  }
}