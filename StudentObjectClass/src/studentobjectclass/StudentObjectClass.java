
package studentobjectclass;

import studentobjectclass.students.Students;


public class StudentObjectClass {

    
    public static void main(String[] args) {
        
        Students s = new Students(123,"masud","masud@gmail.com", "savar", 2366566, 26556365);
        
        System.out.println(s.stu());
        
//        s.setAddress("savar");
//        s.setId(1235);
//        
//        System.out.println(s);
    }
    
}
