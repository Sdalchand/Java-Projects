//
// ComboLock class mimicks a
//combination lock and tests whether
//the user opens the lock corresponding
//to the correct unlocking numbers.
//*******************************

public class ComboLock {
    
    private int secret1, secret2, secret3;
    private int one, two, three;
    private int currentNumber;
    private int count;
    private boolean open;

    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        one = one;
        two = two;
        three = three;
        currentNumber = currentNumber;
        count = count;
        open = open;
    }

    //Resets the lock
    public void reset() {
        one = 0;
        two = 0;
        three = 0;
        currentNumber = 0;
        count = 1;
        open = true;
    }

    //Turns the lock to the left, numbers increase
    public void turnLeft(int ticks) {
        
        if (count == 2) {
            currentNumber = one + ticks;
            two = currentNumber;
            count++;
        }
        
        else {
                open = false;
        }
    }

    //Turns the lock to the right, numbers decrease
    public void turnRight(int ticks) 
    {
        
        if (count == 1) {
            currentNumber = 40-ticks;
            one = currentNumber;
            count++;
        }
        else if (count == 3) {
            currentNumber = two-ticks;
            three = currentNumber;
            count++;
        }
        else {
                open = false;
        }
    }
    //checks if tested numbers are equal to the 
    //lock's secret combination.
    public boolean open(){ 

        if(one == secret1 && two == secret2 && 
        three == secret3)
        {
        return true;
        }
        else
        {
        return false;
        }
    }
}
