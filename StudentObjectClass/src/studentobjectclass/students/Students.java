
package studentobjectclass.students;


public class Students {
    
        private int id;
        private String name;
        private String email;
        private String address;
        private int password;
        private int contact;

    public Students() {
    }

    public Students(int id, String name, String email, String address, int password, int contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    

    public String stu(){
    
    String masud = "Id :"+id+"\n"+"Name :"+name+"\n"+ "Email "+ email+"\n"+"adress: " +
            address+ "\n"+ "password: "+ password+"\n"+ "contact: "+ contact;
    
    return masud;
    }
    
    
      
        
        
}
