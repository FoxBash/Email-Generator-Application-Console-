import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "atCompany.com";
    
    // constructor, ask for department, generate random password

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created "+ firstName + " "+lastName);
        
        //call a method to call department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);

        //call a method that returns a random password

        this.password = randomPassword(10);
        System.out.println("Your password is "+ this.password);

        // combine elements to generate email
        email = firstName.toLowerCase()+ lastName.toLowerCase()
                + "@"+department +"."+ companySuffix;
        System.out.println("Email: "+ email);

        
    }
    
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1: For sales\n2: For " +
                "development\n3: For Accounting\n4: For none");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){
            return "Sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acct";
            
        }else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordTxt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstvwxyz" +
                "1234567890!@#$%^&*()_[]{};'\\|/:><.,+-*/";
//        Scanner sc = new Scanner(System.in);
//        ;
//        System.out.println("Enter the length of password ");
//        length = sc.nextInt();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)( Math.random()  * passwordTxt.length());
            password[i] = passwordTxt.charAt(rand);

        }
        return new String(password);
    }
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", mailBoxCapacity=" + mailBoxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", companySuffix='" + companySuffix + '\'' +
                '}';
    }
}
