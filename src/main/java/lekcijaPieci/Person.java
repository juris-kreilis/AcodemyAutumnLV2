package lekcijaPieci;

public class Person {
    private int age;
    protected String name;
    int height;

     public Person(int age) throws Exception {
        setAge(age);
     }

    //getter
    public int getAge() {
        return age;
    }


    //setter
    public void setAge(int age) throws Exception {
        if (age <= 0) {
           throw new Exception("Vecums nedrikst but mazaks par 0");
        } else {
            this.age = age;
        }
    }

}
