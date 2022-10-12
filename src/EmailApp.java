import java.util.Objects;
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Darshan","Sonawane");
        boolean flag = true;
        while(flag==true){
            System.out.println("Update employee info...");
            System.out.println("1.Change password");
            System.out.println("2.Set alternate email");
            System.out.println("3.Get mail box capacity");
            System.out.println("4.Get new password");
            System.out.println("5.Get alternate email");
            System.out.println("6.Exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter old password: ");
                    String oldpassw = sc.next();
                    if(Objects.equals(oldpassw, em1.password)){
                        System.out.println("Enter new password: ");
                        String newpassw = sc.next();
                        em1.setNewPassw(newpassw);

                    }
                    break;
                case 2:
                    System.out.println("Enter alternate email: ");
                    String email = sc.next();
                    em1.setAlterEmail(email);

                    break;
                case 3:
                    em1.getMailBoxCapacity();
                    break;
                case 4:
                    em1.getNewPassword();
                    break;
                case 5:
                    em1.getAlternateEmailEmail();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Thank you.");
                    flag = false;
            }
        }
    }
}
