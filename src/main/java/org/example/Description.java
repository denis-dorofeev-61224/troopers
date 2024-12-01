package org.example;

import java.util.Objects;

public class Description {

     private String firstName;
     private String callSign;
     private int fullAge;

     public Description(String firstName,String callSign,int fullAge){
         this.firstName=firstName;
         this.callSign=callSign;
         this.fullAge=fullAge;
     }
    // Геттеры и сеттеры
    public String getFirstName() {

         return firstName;
    }

    public void setFirstName(String firstName) {

         this.firstName = firstName;
    }

    public String getCallSign() {

         return callSign;
    }

    public void setCallSign(String lastName) {

         this.callSign = callSign;
    }
    public  int getFullAge(){
         return fullAge;
    }
    public void setFullAge(){
         this.fullAge=fullAge;
    }

    @Override
    public String toString() {
        return firstName + " " + callSign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description description = (Description) o;
        return Objects.equals(firstName, description.firstName) &&
                Objects.equals(callSign, description.callSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, callSign);
    }


}
