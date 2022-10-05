package class02;

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
            return (english + math) / 2;
        }
    }

    public String getname() {
        return name;
    }

    public Test getscore() {
        return score;
    }

    public Data(String n, int eng, int m) {
        name = n;
        eng = score.english;
        m = score.math;
    }

    void show(Data[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.println(
                    "name:" + name + " " + "english:" + score.english + " " + "math:" + score.math + " " + score.avg());
        }
    }
}

public class class02 {
    public static void main(String[] args) {
        Data dat[];
        dat = new Data[2];
        dat[0] = new Data("Annie", 85, 92);
        dat[1] = new Data("Brian", 77, 56);
    }
}
