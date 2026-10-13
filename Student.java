// implemented inheritance
class Student extends Person {
    private String address;
    private String phone;

    Student(int id, String name, String address, String phone) {
        super(id, name);
        this.address = address;
        this.phone = phone;
    }


    // impleneted encapsulation
    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    //implenanted abstract method
    //implemented polymorphism
    @Override
    void displayRole() {
        System.out.println(getName() + " is a Student");
    }

    void enroll(Program p) {
        System.out.println(getName() + " enrolled in " + p.name);
    }
}