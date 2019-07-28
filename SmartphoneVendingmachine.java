        double cost;
        double cost2;
        double cost3;
        double cost4;
        int stock1 = 10;
        int x;
        //stock of phones
        int galaxys8stock = 5;
        int oneplus5stock = 5;
        int galaxys7stock = 5;
        int iphone7stock = 5;
        //loop 10 times
        for (x = 1; x <= 10; x++) {
// validates user input
            try {
                //type of phone you want

                int phone = Integer.parseInt(JOptionPane.showInputDialog(" Current phones avaliable in vending machine"
                        + "\n Select the phone you want to Purchase:"
                        + "\n {1} Samsung Galaxys8 (€600)"
                        + "\n {2} One Plus 5 (€550)"
                        + "\n {3} Samsung Galaxy s7 (€400)"
                        + "\n {4} Iphone 7 (€650)"));
                if (phone > 4) {
                    showMessage("Invalid Please Choose Between 1-4");
                }
                //if statements
                double money = 0.0;
                if (phone == 1) {
                    cost = 600;
                    for (int t = 0; t < 1; t++) {
                        money = Double.parseDouble(JOptionPane.showInputDialog("Insert €600 into the vending machine"));

                        if (money < 600) {
                            showMessage("Input the correct amount of money");
                            t--;

                        }
                    }
                    if (galaxys8stock <= 0) {
                        showMessage("OUT OF STOCK");
                    }
                    double end = money - cost;

                    galaxys8stock--;
                    JOptionPane.showMessageDialog(null, "Your phone has been Dispensed "
                            + "\nYour Change  €" + end + "\n Total galaxy s8 stock left = " + galaxys8stock);
                    
                    
                     } else if (phone == 2) {
                    cost2 = 550;
                    for (int s = 0; s < 1; s++) {
                     money = Double.parseDouble(JOptionPane.showInputDialog("Insert €550 into the vending machine"));
                    
                    if (money < 550) {
                        showMessage("Input the correct amount of money");
                        s--;
                    }
                    }
                    double end = money - cost2;
                    if (oneplus5stock <= 0) {
                        showMessage("OUT OF STOCK");
                    }
                    oneplus5stock--;
                    showMessage("Your phone has been Dispensed "
                            + "\nYour Change  €" + end + "\n Total one plus 5 stock left = " + oneplus5stock);
                }
                if (phone == 3) {
                    cost3 = 400;
                    for (int a = 0; a < 1; a++) {
                     money = Double.parseDouble(JOptionPane.showInputDialog("Insert €400 into the vending machine"));
                    
                    if (money < 400) {
                        showMessage("Input the correct amount of money");
                        a--;
                    }
                    }
                    double end = money - cost3;
                    if (galaxys7stock <= 0) {
                        showMessage("OUT OF STOCK");
                    }
                    
                    galaxys7stock--;
                    showMessage("Your phone has been Dispensed "
                            + "\nYour Change  €" + end + "\n Total galaxy s7 stock left = " + galaxys7stock);
                }
                if (phone == 4) {
                    cost4 = 650;
                    for (int z = 0; z < 1; z++) {
                     money = Double.parseDouble(JOptionPane.showInputDialog("Insert €650 into the vending machine"));
                    
                    if (money < 650) {
                        showMessage("Input the correct amount of money");
                        z--;
                    }
                    }
                    double end = money - cost4;
                    if (iphone7stock <= 0) {
                        showMessage("OUT OF STOCK");
                    }
                    iphone7stock--;
                    showMessage("Your phone has been Dispensed "
                            + "\nYour Change  €" + end + "\n Total iphone 7 stock left = " + iphone7stock);
                }
            } catch (  HeadlessException | NumberFormatException e) {
                showMessage("Error, select a number");
            }
        }
//stock check
        showMessage("TOTAL STOCK LEFT "
                + "\n Galaxy S8 stock left = " + galaxys8stock
                + "\n One Plus stock left = " + oneplus5stock
                + "\n Galaxy s7 stock left = " + galaxys7stock
                + "\n Iphone stock left = " + iphone7stock);
    }
//methods
    public static void showMessage(String input) {
        JOptionPane.showMessageDialog(null, input);
    }
}



