<%-- 
    Document   : index.jsp
    Created on : Aug 7, 2017, 2:36:10 PM
    Author     : sayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function chkcrs(){
            var crs_id = document.getElementById("crs_id").value;
             var status = document.getElementById("status");
              var hr = new XMLHttpRequest();
           if(crs_id.length>0){
              // alert(hr);
                var v = "result.jsp?crs_id="+crs_id;
		hr.open("GET", v , true);
		hr.send(null);
                status.innerHTML = 'checking...';
                //hr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		hr.onreadystatechange = function() {
			if(hr.readyState == 4 && hr.status == 200) {
                                 status.innerHTML = hr.responseText;
                               // alert(hr.responseText);
			}
		}
           }
          
        }
    
        </script>
    </head>
    <body>
        <form >
    Enter Course ID:
    <input type="text" name="crs_id" id="crs_id" value="">
     <br>
     <br>
     <input type="button" onclick="chkcrs()" value="check">
         </form>
        <span id="status"></span>
    </body>
</html>
