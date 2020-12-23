class ATM{
    public int countBanknotes(int sum){
        int[] Q = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int n, q, x;
        x = 0;
        int i = 0;
        while (i < 9){
            q = Q[i];
            x += sum / q;
            sum %= q;
            i++;
        }
        return x;
    }
}
