public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String first,String last,String ssn)
    {
        firstName=first;
        lastName=last;
        socialSecurityNumber=ssn;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last)
    {
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s\nsocial security number:%s",
                getFirstName(),getLastName(),getSocialSecurityNumber());
    }
}
