package com.jsp.OnetoOneUnidirection;

import com.jsp.OnetoOneUnidirection.dao.PersonDao;
import com.jsp.OnetoOneUnidirection.model.Pancard;
import com.jsp.OnetoOneUnidirection.model.Person;

public class App 
{
    public static void main( String[] args )
    {
        
    	Person person=new Person();
    	Pancard pancard=new Pancard();
    	PersonDao persondao=new PersonDao();
    	
    	person.setName("Venkatesh");
    	person.setAddress("Tirupathi");
    	
    	pancard.setPanName("ApTp963d ");
    	
    	person.setPancard(pancard);
    	persondao.savePerson(person);
    	
//    	person.setId(2);
//    	person.setName("Sita");
//    	person.setAddress("Ayodhya");
//    	
//    	pancard.setPanid(2);
//    	person.setPancard(pancard);
//    	persondao.updateperson(2, person);
    	
    	
    	
    }
}
