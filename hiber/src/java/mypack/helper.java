package mypack;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class helper {
    
  Session session=null;
  public helper(){
      this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
  }
  
  public List getCourse(){
      List<Course> crslist=null;
      try{
          org.hibernate.Transaction tx=session.beginTransaction();
          Query q=session.createQuery("from Course as crs");
          crslist=(List<Course>)q.list();  
      }catch(Exception e){
          e.printStackTrace();
      }
    
      return crslist;
  }
}
