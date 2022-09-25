class MyCircularQueue {
    int arr[];
    int front=-1;
    int end=-1;
    int l;
    public MyCircularQueue(int k) {
        arr=new int[k];
        l=k;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(front==-1){
            front=0;
            end=0;
            arr[end]=value;
            return true;
        }
        end=(end+1)%l;
        arr[end]=value;
        
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        
        if(front==end){
            front=-1;
            end=-1;
            return true;
        }
        
        front=(front+1)%l;
        return true;
    }
    
    public int Front() {
        if(front==-1) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(end==-1) return -1;
        return arr[end];
        
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return (front!=-1) && ((end+1)%l==front);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */