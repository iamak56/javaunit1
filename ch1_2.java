import javax.swing.JOptionPane;

public class ch1_2 {
    int loan;
    int interest;
    double emi;

    Loan(int loan,int interest);

    {
        this.loan = loan;
        this.interest = interest;

    }

    double calcEMI() {
        return loan * interest / (100 * 60);

    }

}

public class U1P2 {
    public static void main(String[] args) {

        int loan;
        int interest;
        String lo = JOptionPane.showInputDialog(null, "Enter Loan Ammount");
        loan = Integer.parseInt(lo);
        String in = JOptionPane.showInputDialog(null, "Enter intrest");
        interest = Integer.parseInt(in);
        Loan l1 = new Loan(loan, interest);
        System.out.println("EMI=" + l1.calcEMI);
    }

}
