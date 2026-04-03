package study.ch14.ex;

interface Printable{
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable{
    void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable{
    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}

public class Ex17 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();
        printer.fax();


    }
}
