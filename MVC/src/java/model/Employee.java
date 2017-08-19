package model;

public class Employee {
    private int empid;
    private String ename;
    private String dname;
    private String salary;
    private String comm;
    private int flag=0;
    
    //0 parameterized construtor in model
    public Employee(){}
    
    public int getIsNull(){
        return flag;
    }
    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }

    public String getDname() {
        return dname;
    }

    public String getSalary() {
        return salary;
    }

    public String getComm() {
        return comm;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
    
    public void setIsNull(){
        flag=1;
    }
    
}
