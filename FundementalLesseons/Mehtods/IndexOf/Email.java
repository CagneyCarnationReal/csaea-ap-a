package FundementalLesseons.Mehtods.IndexOf;

public class Email {
    
    String address;

    public Email(String address){

    this.address = address;
    

    }

    public String toString(){
        return address;
    }

    public int getAtIndex(){
        return address.indexOf("@");
    }
    
    public String getUser(){
        return address.substring(0, address.indexOf("@"));
    }

    public String getDomain(){
        return address.substring(address.indexOf("@") + 1);
    }

    public boolean isSchool(){
        return address.indexOf("hcvsd.org") != -1;
    }
    
    public String getFirstName(){
        
        String x = this.getUser();
        return x.substring(0 , x.indexOf("."));
    }
    
    public String changeDomain(String newDomain){
        this.address = this.getUser() + "@" + newDomain;
        return this.address; 
        
    }

    public String getLabel(){
        
        if (this.isSchool() = true){
            String x = "School";
        }
        else{
            String x = "Personal";
        }
        return x;
    }




//Challenge 3
    // Method name: getLabel
// Label the address as "School" or "Personal", followed by the domain.
//     "ana.lee@hcvsd.org" -> "School: hcvsd.org"
//     "ana99@gmail.com"   -> "Personal: gmail.com"
// Hint: isSchool() already returns true or false, so use it as your condition.
// Hint: every path through the method needs a return.
// Tools: if/else, isSchool, getDomain

// ===== CHALLENGE 4 =====
// Method name: isStaffFormat
// Return true only if BOTH are true:
//     1. the full address contains "hcvsd.org"
//     2. the user has a "." in it (first.last format)
//     "ana.lee@hcvsd.org" -> true
//     "ana99@hcvsd.org"   -> false   (no "." in user)
//     "ana.lee@gmail.com" -> false   (not school)
// Rule: do NOT use address or isSchool(). Use toString() to get the full address.
// Hint: toString() returns a String, so you can call indexOf on it.
// Hint: for condition 2, search getUser(), not toString(). Why?
// Hint: two conditions that must both be true -> &&
// Tools: toString, getUser, indexOf, -1, &&



 
}
