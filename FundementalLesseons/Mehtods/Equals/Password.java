package FundementalLesseons.Mehtods.Equals;

public class Password {
    
    private String secret;

    Password(String secret){
        this.secret = secret;
    }

    public boolean checkbroken(String attempt){
        return secret == attempt;
    }

    public boolean check(String attempt){
        return secret.equals(attempt);
    }

    public boolean sameAs(Password other){
        return secret.equals(other.secret);
    }

     // ===== CHALLENGE 2 =====
     // Create another method called "change()" two String arguements, new pw and its duplicate
    // Change the password. The user must type the new password twice.
    // Change secret and return true ONLY if:
    //     both typed passwords match each other, AND
    //     the new password is different from the current one.
    // Otherwise change nothing and return false.
    //     secret "lion": change("tiger", "tiger") -> true   (secret is now "tiger")
    //     secret "lion": change("tiger", "tigre") -> false  (typo)
    //     secret "lion": change("lion", "lion")   -> false  (same as old)
    // Tools: equals, if/else, &&, !

    public boolean change(String new1, String new2){
        if ((new1 == new2) && !(secret.equals(new1))){
            secret = new1;
            return true;
        }
        else{
            return false;
        }
    }


    public boolean isSafe(String name){
        if (secret.equals("password")){
            return false;
        }
        else{
            if (secret.indexOf(name) == -1){
                return true;
            }
            else{
                return false;
            }
        }
    }


}