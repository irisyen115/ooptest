package class02;

class Data {
    private static String name;
    private static Test score;

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

    public Data(String n, int eng, int m) {
        name = n;
        eng = score.english;
        m = score.math;
    }


    public static String getname() {
        return name;
    }

    public static Test getscore() {
        return score;
    }    
}

class data extends Data {
    public data(String n, int eng, int m) {
        super(n, eng, m);
    }

    public static void show(Data[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.println(
                    "name:" + getname() + " " + "english:" + getscore().english + " " + "math:" + getscore().math + " " + getscore().avg());
        }
    }
}

public class class02 {
    public static void main(String[] args) {
        Data dat[];
        dat = new Data[2];
        dat[0] = new Data("Annie", 85, 92);
        dat[1] = new Data("Brian", 77, 56);
        data.show(dat);
    }
}
