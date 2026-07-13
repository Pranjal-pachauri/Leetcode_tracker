// Last updated: 7/13/2026, 10:02:42 AM
class NumberContainers {
    Map<Integer,Integer> store;
    Map<Integer,TreeSet<Integer>> rec;


    public NumberContainers() {
        store=new HashMap<>();
        rec=new HashMap<>();
        
    }
    
    public void change(int index, int number) {
        if(store.containsKey(index)){
            int onum=store.get(index);
            rec.get(onum).remove(index);
            if(rec.get(onum).isEmpty()){
                rec.remove(onum);
            }
        }
        store.put(index,number);
        rec.putIfAbsent(number,new TreeSet<>());
        rec.get(number).add(index);
        
    }
    
    public int find(int number) {
        return rec.containsKey(number) && !rec.get(number).isEmpty() ? rec.get(number).first() : -1;
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */