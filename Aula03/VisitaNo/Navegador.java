package VisitaNo;

public class Navegador {
    No no;

    public void setNo(No no) {
        this.no = no;
    }

    public No proximo() {
        if(this.no.no == null)
            return null;

        this.no = this.no.no;
        return this.no;
    }
}
