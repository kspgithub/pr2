public class Author {
    private String name;
    private String email;
    private char gender;

    public Author () {
        name = "Sam";
        email = "sam@author.org";
        gender = 'M' ;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ")" + " at " + email ;
    }
}
