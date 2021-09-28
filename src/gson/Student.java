package gson;


import com.google.gson.annotations.Since;

class Student {
    private int age;
    @Since(1.0)
    private int rollNo;

    @Since(1.0)
    private String name;

    @Since(1.1)
    private boolean verified;


    public Student(){}

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isVerified() {
        return verified;
    }
}