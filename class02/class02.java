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


    public String getname() {
        return name;
    }

    public Test getscore() {
        return score;
    }    
    public void show(Data[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.println(
                    "name:" + getname() + " " + "english:" + getscore().english + " " + "math:" + getscore().math + " " +"avg:"+ getscore().avg());
                    break;
        }
    }
}

public class Class02 {
    public static void main(String[] args) {
        Data dat[];
        dat = new Data[2];
        dat[0] = new Data("Annie", 85, 92);
        dat[1] = new Data("Brian", 77, 56);
        dat[0].show(dat);
        dat[1].show(dat);
    }
}
