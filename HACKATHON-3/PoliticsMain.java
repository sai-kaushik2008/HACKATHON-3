public class PoliticsMain {

    static class Candidate {
        String name, position;
        int roll, votes;

        Candidate(String n, int r, String p) {
            name = n.toUpperCase();
            roll = r;
            position = p.toUpperCase();
        }

        Candidate(String n, int r, String p, int v) {   // constructor overloading
            this(n, r, p);
            votes = v;
        }

        void display() {
            System.out.println("Candidate Name  : " + name);
            System.out.println("Roll Number     : " + roll);
            System.out.println("Position        : " + position);
            System.out.println("Votes Received  : " + votes);
        }

        void display(String msg) {                      // method overloading
            System.out.println(msg);
            display();
        }
    }

    public static void main(String[] args) {
        System.out.println("---------- STUDENT COUNCIL ELECTION ----------");

        Candidate a = new Candidate("Ananya", 101, "President", 125);
        Candidate b = new Candidate("Rahul", 102, "President", 98);
        a.display("Candidate Registered Successfully");
        b.display("Candidate Registered Successfully");

        String newName = "Ananya";
        System.out.println("Duplicate Candidate Check:");
        System.out.println("Candidate Name  : " + newName.toUpperCase());
        if (newName.equalsIgnoreCase(a.name) || newName.equalsIgnoreCase(b.name))
            System.out.println("Status          : Duplicate Nomination");
        else
            System.out.println("Status          : Valid Nomination");

        Candidate w = a.votes > b.votes ? a : b;
        System.out.println("---------- ELECTION RESULTS ----------");
        System.out.println("Position          : " + w.position);
        System.out.println("Winning Candidate : " + w.name);
        System.out.println("Total Votes       : " + w.votes);
    }
}