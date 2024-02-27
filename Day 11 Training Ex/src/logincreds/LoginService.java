package logincreds;

public class LoginService {
    private int failedLoginAttempts = 0;
    private boolean isAccountLocked = false;
    static final int MAX_FAILED_ATTEMPTS = 3; // Threshold for locking the account

    public boolean authenticateUser(String username, String password) {
        if (isAccountLocked) {
            return false; // Account is already locked
        }

        if (username.equals("user123") && password.equals("password123")) {
            // Successful login
            failedLoginAttempts = 0; // Reset failed login attempts
            return true;
        } else {
            failedLoginAttempts++;
            if (failedLoginAttempts >= MAX_FAILED_ATTEMPTS) {
                isAccountLocked = true; // Lock the account
            }
            return false; // Failed login
        }
    }

    public boolean isAccountLocked() {
        return isAccountLocked;
    }
}

//Problem 2: Testing a Login System
//Create JUnit tests for a login system that validates user credentials.
//
//Requirements:
//- LoginService class with a method to authenticate users.
//- JUnit test cases for successful and failed login attempts.
//
//Operations to Perform:
//1. Successful Login
//2. Failed Login (Invalid Username)
//3. Failed Login (Invalid Password)
//4. Failed Login (Account Locked)
//
//Code Stub:
//public class LoginService {
//    public boolean authenticateUser(String username, String password) { /* method implementation */ }
//}
//
//Sample Input:
//Username: "user123"
//Password: "password123"
//
//Sample Output:
//Successful Login: true
//Failed Login (Invalid Username): false
//Failed Login (Invalid Password): false
//Failed Login (Account Locked): false
