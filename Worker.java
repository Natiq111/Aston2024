public class Worker {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Worker(String name1, String post1, String email1, String phone1, int salary1, int age1) {
        name = name1;
        post = post1;
        email = email1;
        phone = phone1;
        salary = salary1;
        age = age1;
    }
    public void Print() {
        System.out.println(name);
        System.out.println(post);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
    }
    
}