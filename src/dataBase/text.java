package dataBase;

public class text {
    public static void main(String[] args) throws Exception{
        MySQL mySQL = new MySQL("jdbc:mysql:///linker","root","6390707");
        mySQL.select("select * from linker");
        mySQL.select("select * from linker");
        mySQL.show(mySQL.statement);
    }
}
