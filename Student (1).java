public class Student implements Comparable<Student> {


    int age;
    String name;
    long id;
    boolean isOnline;

    public Student(int age, String name, long id, boolean isOnline) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.isOnline = isOnline;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(getAge() > o.getAge()){
            return 1;
        }else if(getAge() < o.getAge()){
            return -1;
        }else{
            return 0;
        }
    }
}
