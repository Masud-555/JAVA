
package studentobjectclass;


public class StudentsCls {
    
    private int id;
    private String name;
    private String email;
    private int password;
    private String address;
    private int contact;

    public StudentsCls() {
    }

    public StudentsCls(int id, String name, String email, int password, String address, int contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
    public String sc(){
    
        String mas ="id : "+id+"\n"+"Name : "+name+"\n"+"email : "+email+"\n"+
                "Password : "+password+"\n"+"Address"+address+"\n"+
                "Contact : "+contact;
    
    return mas;
    }

    @Override
    public String toString() {
        return "StudentsCls{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address=" + address + ", contact=" + contact + '}';
    }
    
    
}
