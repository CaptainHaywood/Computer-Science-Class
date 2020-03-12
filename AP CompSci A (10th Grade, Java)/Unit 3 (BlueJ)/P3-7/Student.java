public class Student {
    
    String name;
    double totalScore;
    double numQuiz;
    
    public Student(String nombre){
        name = nombre;
    }
    
    public String getName(){
        return name;
    }
    
    public void addQuiz(int score){
        numQuiz++;
        totalScore = totalScore + score;
    }
    
    public double getTotalScore(){
        return totalScore;
    }
    
    public double getAverageScore(){
        return totalScore / numQuiz;
    }
}
