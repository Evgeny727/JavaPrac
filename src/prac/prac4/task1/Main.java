package prac.prac4.task1;

enum Season {
    Leto(28, "Теплое время года"), Osen(10, "Холодное время года"),
    Zima(-20, "Холодное время года"), Vesna(19, "Теплое время года");
    private final int averTemp;
    private  final String inf;
    private Season(int averTemp, String inf) {
        this.averTemp = averTemp;
        this.inf = inf;
    }
    public int getAverTemp(){
        return this.averTemp;
    }
    public static void loveSeason(Season s) {
        switch (s) {
            case Leto:
                System.out.println("I love " + Season.Leto);
                break;
            case Osen:
                System.out.println("I love " + Season.Osen);
                break;
            case Zima:
                System.out.println("I love " + Season.Zima);
                break;
            case Vesna:
                System.out.println("I love " + Season.Vesna);
                break;
        }
    }
    public String getDescription() {
        return this.inf.toString();
    }
};

public class Main {
    public static void main(String[] args) {
        Season favor = Season.Leto;
        System.out.println("Мое любимое время года - " + favor + ", средняя температура = " + favor.getAverTemp() + " " + favor.getDescription());
        Season.loveSeason(Season.Osen);
        for(Season season : Season.values()){
            System.out.println(season + " " + season.getAverTemp() + " " + season.getDescription());
        }
    }
}
