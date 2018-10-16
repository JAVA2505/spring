public class Sayer {
    private String phraze;

    public Sayer() {
    }

    public Sayer(String phraze) {
        this.phraze = phraze;
    }

    public String getPhraze() {
        return phraze;
    }

    public void setPhraze(String phraze) {
        this.phraze = phraze;
    }

    void say() {
        System.out.println(phraze);
    }
}
