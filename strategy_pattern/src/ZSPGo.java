public class ZSPGo {
    private GoToSchool toSchool;
    public ZSPGo(GoToSchool toSchool){
        this.toSchool=toSchool;
    }
    public void exec(){
        toSchool.action();
    }
}
