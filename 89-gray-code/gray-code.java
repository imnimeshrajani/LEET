class Solution {
    // public List<Integer> grayCode(int n) {
    //     var list = new ArrayList();
    //     for(var i = 0; i < (1 << n); i++) list.add(i ^ (i>>1));
    //     return list;
    // }

    public List<Integer> grayCode(int n) {    
        if(n == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            return list;
        }
        
        List<Integer> pres = grayCode(n-1);
        List<Integer> mres = new ArrayList<>();
        
        for(int i=0;i<pres.size();i++)
            mres.add(0+2*pres.get(i));
        
        for(int i=pres.size()-1;i>=0;i--)
            mres.add(1+2*pres.get(i));
        
        return mres;
    }
}
