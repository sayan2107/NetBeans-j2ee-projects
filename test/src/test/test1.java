/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author sayan
 */
public class test1 extends JApplet{
   private HashMap<String, URL> websiteInfo;
   private ArrayList<String> titles;
   private JList mainList;
   
   //init
   public void init(){
     websiteInfo = new HashMap<String, URL>();
     titles = new ArrayList<String>();
     
     grabHTMLInfo();
     add(new JLabel("what web do u wanna visit?"), BorderLayout.NORTH);
     mainList = new JList(titles.toArray());
     
     mainList.addListSelectionListener(
         new ListSelectionListener(){
           public void valueChanged(ListSelectionEvent event){
                   Object obj = mainList.getSelectedValue();
                   URL newDocument = websiteInfo.get(obj);
                   AppletContext browser = getAppletContext();
                   browser.showDocument(newDocument);
           }
         }
     );
     
     add(new JScrollPane(mainList), BorderLayout.CENTER);
   }

   //getwebsiteinfo
    private void grabHTMLInfo() {
        String title;
        String address;
        URL url;
        int counter = 0;
        title = getParameter("title"+counter);
        
        while(title != null){
           address = getParameter("address"+counter);
           try{
               url = new URL(address);
               websiteInfo.put(title, url);
               titles.add(title);
           }catch(Exception e){
               e.printStackTrace();
           }
           ++counter;
           title = getParameter("title"+counter);
        }
   }
}
