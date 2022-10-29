package prac.prac13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country = "";
    private String Region = "";
    private String City = "";
    private String Street = "";
    private String House = "";
    private String Building = "";

    public Address(){}

    private int Trash(String A, int index)
    {
        while (A.charAt(index) == ' ' || A.charAt(index) == ',' || A.charAt(index) == '.' || A.charAt(index) == ';')
        {
            ++index;
        }
        return index;
    }

    public void setAddress1(String A)
    {
        String mass[] = A.split(",");
        for (int i = 0; i < 6; i++) {
            mass[i] = mass[i].replace(" ","");
        }
        country = mass[0];
        Region = mass[1];
        City = mass[2];
        Street = mass[3];
        House = mass[4];
        Building = mass[5];
    }

    public void setAddress2(String A)
    {
        StringTokenizer a = new StringTokenizer(A,";,.");
        country = a.nextToken().replace(" ","");
        Region = a.nextToken().replace(" ","");
        City = a.nextToken().replace(" ","");
        Street = a.nextToken().replace(" ","");
        House = a.nextToken().replace(" ","");
        Building = a.nextToken().replace(" ","");
    }

    public String toString()
    {
        return country+"\n"+Region+'\n'+City+"\n"+Street+"\n"+House+"\n"+Building+"\n";
    }
}
