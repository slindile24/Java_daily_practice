public class Student {
    private String name;
    private int age;
    private double score;



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    public void displayinfo(){
        System.out.println("Name: "+ name );
        System.out.println("Age: " + age);
        System.out.println("Score:" + score);

    }


}
