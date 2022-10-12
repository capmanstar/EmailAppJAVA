import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    protected String password;
    private int mailBoxCapacity = 500;
    private String department;
    private String alternateEmail;
    private int defaultPasswLength = 8;
    private String email;
    private String companyName = "abc.com";

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: "+firstName+" "+lastName);
        this.department = setDepartment();
        System.out.println("Department: "+department);
        this.password = setPassword(defaultPasswLength);
        System.out.println("Your password is: "+password);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companyName;
        System.out.println("Your Email is: "+email);
    }

    public String setDepartment(){
        System.out.println("Departments:");
        System.out.println("1.Sales");
        System.out.println("2.Development");
        System.out.println("3.Accounting");
        System.out.println("4.Analysis");
        System.out.println("Enter your dept: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            return "Sales";
        }
        else if(choice==2){
            return "Development";
        }
        else if(choice==3){
            return "Accounting";
        }
        else if(choice==4){
            return "Analysis";
        }
        else {
            return "Bad choice....";
        }
    }

    private String setPassword(int length){
        String passwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] passw = new char[length];
        for (int i = 0; i < passw.length; i++) {
            int rand = (int)(Math.random()*passwSet.length());
            passw[i] = passwSet.charAt(rand);
        }
        return new String(passw);
    }

    public void setAlterEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public void setNewPassw(String password){
        this.password = password;
    }

    public void setMailCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void getAlternateEmailEmail(){
        System.out.println(alternateEmail);
    }

    public void getMailBoxCapacity(){
        System.out.println(mailBoxCapacity);
    }

    public void getNewPassword(){
        System.out.println(password);
    }
}
