

public class Employee{
    private String name;
    private String address;
    private int salary;
    private String job_title;

    public Employee(String name, String address, int salary, String job_title){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getSalary(){
        return salary;
    }
    public String getJobTitle(){
        return job_title;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setjob_title(String j0b_title){
        this.job_title = job_title;
    }
    class Manager extends Employee{
        public Manager(String name, String address, int salary, String job_title){
            super(name, address, salary, job_title);
        }
    }
    class Developer extends Employee{
        public Developer(String name, String address, int salary, String job_title){
            super(name,address,salary,job_title);
        }
    }
    class programer extends Employee{
        public programer( String address, int salary, String job_title){
            super(name, address, salary, job_title);
    }
    public static void main(String[] args) {
        
    }
};
