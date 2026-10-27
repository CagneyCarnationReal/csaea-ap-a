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
        return false;
    }


}
