package Inheritance;

public class F extends A implements I{

    public int fi = 0;

    public F(){
        super();
    }

    public int getFi() {
        return fi;
    }

    public void setFi(int fi) {
        this.fi = fi;
    }


    @Override
    public Integer doSomething(Integer par1) {
        return 1234;
    }
}
