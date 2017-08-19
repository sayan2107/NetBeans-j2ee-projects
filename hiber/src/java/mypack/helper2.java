package mypack;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class helper2 {
    Session session=null;
  public helper2(){
      this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
  }
   public List getCourse(int id){
      List<Course> crslist=null;
      try{
          org.hibernate.Transaction tx=session.beginTransaction();
          Query q=session.createQuery("from Course as crs where Course.crsid="+id);
          crslist=(List<Course>)q.list();
      }catch(Exception e){
          e.printStackTrace();
      }
    
      return crslist;
  }
}
