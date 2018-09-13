class Company{
    public static void main(String[] args){
        Employee employee1=new Employee();
        employee1.firstName="Jan";
        employee1.lastName="Kowalski";
        employee1.birthYear=1988;
        employee1.expWork=10;
        System.out.println(employee1.firstName+" " +employee1.lastName+" "+employee1.birthYear+" "+employee1.expWork);
        
        Employee employee2 = new Employee();
        employee2.firstName="Anna";
        employee2.lastName="Nowak";
        employee2.birthYear=1967;
        employee2.expWork=19;
        System.out.println(employee2.firstName+" "+employee2.lastName+" "+employee2.birthYear+" "+employee2.expWork);
        
        Employee employee3= new Employee();
        employee3.firstName="Tomasz";
        employee3.lastName="Kiepski";
        employee3.birthYear=1956;
        employee3.expWork=49;
        System.out.println(employee3.firstName+" " +employee3.lastName+" "+employee3.birthYear+" "+employee3.expWork+" ");
        
    }
}
