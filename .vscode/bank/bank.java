package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getter and setter for private variable password
    public String getPassword() {
        //setPassword(randomPass);
        return this.password;
    }
    // private void setPassword(String pass) { 
    //     this.password = pass;
    // }
   public void setPassword(String pass) { 
    
        this.password = pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "vishesh";
        account1.email = "vishesh@example.com";
        // account1.password = "password123"; // This line will cause a compilation error because password is private
        account1.setPassword("abcd1234"); // Use setter to set the password
        System.out.println(account1.getPassword()); // Use getter to retrieve the password
    }
}