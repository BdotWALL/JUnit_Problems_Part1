public class Counter {
    private int value;
 
    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public int increase() {
        return this.value +=1;
    }

    public int decrease() {
        return this.value -=1;
    }

    public int  increase(int increaseBy) {

        if (increaseBy > 0){

       return  this.value +=  increaseBy;

        } else {

            return this.value +=0;

    }
}

    public int decrease(int decreaseBy) {
        if (decreaseBy > 0){

            return this.value -=  decreaseBy;
    
            } else {
    
              return   this.value -=0;
    
        }
    }


  
}