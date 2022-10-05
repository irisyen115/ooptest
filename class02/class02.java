package Class02;

class Data {
    private String name;
    private Test score;

    class Test {
        public int english;
        public int math;

        public Test(int eng, int m) {
            english = eng;
            math = m;
        }

        double avg() {
            return (double)(english + math) / 2;
        }
    }

    public Data(String n, int eng, int m) {
        name = n;
        score = new Test(eng, m);
    }
    public void show() {
        System.out.println("name:" + name + " " + "english:" + score.english + " " + "math:" + score.math + " " +"avg:"+ score.avg());
    }
}

public class Class02 {
    public static void main(String[] args) {
        Data dat[];
        dat = new Data[2];
        dat[0] = new Data("Annie", 85, 92);
        dat[1] = new Data("Brian", 77, 56);
        dat[0].show();
        dat[1].show();
    }
}
