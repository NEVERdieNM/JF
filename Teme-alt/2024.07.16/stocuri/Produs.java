package stocuri;

public class Produs {
    private String nume;
    private int stoc;

    public Produs(String nume, int stocInitial)
    {
        this.nume = nume;
        this.stoc = stocInitial;
    }

    public String getNume()
    {
        return this.nume;
    }
    
    public int getStoc()
    {
        return this.stoc;
    }

    public String toString()
    {
        String str = nume + ": " + stoc;
        return str;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setStoc(int stoc)
    {
        this.stoc = stoc;
    }

    public void incStoc(int inc)
    {
        stoc += inc;
    }
}
